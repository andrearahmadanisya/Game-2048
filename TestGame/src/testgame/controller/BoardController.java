/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import testgame.model.Board;
import testgame.model.Tile;
import testgame.view.BoardUI;

/**
 *
 * @author Andrea Rahmadanisya
 */
public class BoardController {
    
    private final BoardUI boardView;
    private final Board boardModel;
    private final Tile[][] tile;
    boolean myWin = false;
    boolean myLose = false;
    int myScore = 0;
    
    private static final Color BG_COLOR = new Color(0xbbada0);
    private static final String FONT_NAME = "Arial";
    private static final int TILE_SIZE = 64;
    private static final int TILES_MARGIN = 16;

    public BoardController(BoardUI boardView, Board boardModel) {
        
        this.boardView = boardView;
        this.boardModel = boardModel;
        this.tile = boardModel.getTile();
        
        boardView.setVisible(true);
        this.boardView.addMovementListener(new MovementListener());
        
//        initGame();
        generateSample();
    }
    
    private void initGame() {
        ArrayList<Integer> numbers = new ArrayList<>(); 
        for (int i = 0; i < 16; i++) { 
            numbers.add(i); 
        } 
        Collections.shuffle(numbers);
        
        int tile1Idx = numbers.get(0);
        int tile2Idx = numbers.get(1);
        
        int tile1Row = (int) tile1Idx/4;
        int tile1Col = tile1Idx % 4;
        
        int tile2Row = (int) tile2Idx/4;
        int tile2Col = tile2Idx % 4;
        
        tile[tile1Row][tile1Col].setValue(2);
        tile[tile2Row][tile2Col].setValue(2);
        
        updateBoard();
    }
    
    private void generateRandomTile() {
        
        if (hasEmptyTile()) {
            ArrayList<Integer> availableTile = new ArrayList<>();
            int idxTileView = 0;
            for (int i=0; i<4; i++) {
                for (int j=0; j<4; j++) {
                    if (tile[i][j].isEmpty()) {
                        availableTile.add(idxTileView);
                    }
                    idxTileView++;
                }
            }

            Collections.shuffle(availableTile);

            int tileRow = (int) availableTile.get(0)/4;
            int tileCol = availableTile.get(0) % 4;

            tile[tileRow][tileCol].setValue(2);
        }
    }
    
    private void generateSample() {
        this.tile[0][0].setValue(4);
        this.tile[0][1].setValue(4);
        this.tile[0][2].setValue(4);
        this.tile[0][3].setValue(4);
        updateBoard();
    }
    
    private boolean hasEmptyTile() {
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (tile[i][j].isEmpty()) {
                    return true;
                }
            }
        }
        return false; 
    }
    
    private void resetMerged(int rowIdx) {
        for (int i=0; i<4; i++) {
            tile[rowIdx][i].setIsMerged(false);
        }
    }
    
    public void moveLeft() {
        boolean isMoved = false;
        for (int i=0; i<=3; i++) {
            resetMerged(i);
            for (int loopCol=0; loopCol<=2; loopCol++) {
                for (int j=1; j<=3; j++) {
                    if (tile[i][j].equals(tile[i][j-1]) && !tile[i][j-1].isIsMerged() && !tile[i][j].isIsMerged()) {
                        mergeTile(tile[i][j], tile[i][j-1]);
                        tile[i][j-1].setIsMerged(true);
                        boardModel.addScore(100);
                        isMoved = true;
                    } else if (tile[i][j-1].isEmpty() && !tile[i][j].isEmpty()) {
                        moveTile(tile[i][j], tile[i][j-1]);
                        isMoved = true;
                    }
                }
            }
        }
        if (isMoved) {
            generateRandomTile();
        }
        updateBoard();
    }
    
    public void moveRight() {
        for (int i=0; i<=3; i++) {
            for (int loopCol=0; loopCol<=2; loopCol++) {
                for (int j=2; j>=0; j--) {
                    if (tile[i][j].equals(tile[i][j+1])) {
                        mergeTile(tile[i][j], tile[i][j+1]);
                        boardModel.addScore(100);
                    } else if (tile[i][j+1].isEmpty()) {
                        moveTile(tile[i][j], tile[i][j+1]);
                    }
                }
            }
        }
        generateRandomTile();
        updateBoard();
    }
    
    public void moveUp() {
        for (int j=0; j<=3; j++) {
            for (int loopCol=0; loopCol<=2; loopCol++) {
                for (int i=1; i<=3; i++) {
                    if (tile[i][j].equals(tile[i-1][j])) {
                        mergeTile(tile[i][j], tile[i-1][j]);
                        boardModel.addScore(100);
                    } else if (tile[i-1][j].isEmpty()) {
                        moveTile(tile[i][j], tile[i-1][j]);
                    }
                }
            }
        }
        generateRandomTile();
        updateBoard();
    }
    
    public void moveDown() {
        for (int j=0; j<=3; j++) {
            for (int loopCol=0; loopCol<=2; loopCol++) {
                for (int i=2; i>=0; i--) {
                    if (tile[i][j].equals(tile[i+1][j])) {
                        mergeTile(tile[i][j], tile[i+1][j]);
                        boardModel.addScore(100);
                    } else if (tile[i+1][j].isEmpty()) {
                        moveTile(tile[i][j], tile[i+1][j]);
                    }
                }
            }
        }
        generateRandomTile();
        updateBoard();
    }
    
    public void mergeTile(Tile nextTile, Tile prevTile) {
        int newValue = nextTile.getValue() + prevTile.getValue();
        prevTile.setValue(newValue);
        
        nextTile.clearTile();
    }
    
    public void moveTile(Tile nextTile, Tile prevTile) {
        prevTile.setValue(nextTile.getValue());
        
        nextTile.clearTile();
    }
    
    public void updateBoard() {
        int tileViewNumber = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                boardView.changeColor(tileViewNumber, tile[i][j].getColor());
                boardView.changeValue(tileViewNumber, tile[i][j].getValue());
                tileViewNumber++;
            }
        }
        boardView.setScore(boardModel.getScore());
        
        if (boardModel.getScore() > boardModel.getBest()) {
            boardModel.setBest(boardModel.getScore());
            boardView.setBest(boardModel.getBest());
        }
    }
    
}
