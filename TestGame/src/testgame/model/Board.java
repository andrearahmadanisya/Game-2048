/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.model;

/**
 *
 * @author Andrea Rahmadanisya
 */
public class Board {
    private Tile[][] tile;
    private int score, best;

    public Board(int score, int best) {
        int[] position = new int[2];
        
        tile = new Tile[4][4];
        
        for (int i=0; i<=3; i++) {
            position[0] = i;
            for (int j=0; j<=3; j++) {
                position[1] = j;
                tile[i][j] = new Tile(0, position);
            }
        }
        
        this.score = score;
        this.best = best;
    }
    
    public Tile getOneTile(int idxRow, int idxCol) {
        return this.tile[idxRow][idxCol];
    }
    
    public Tile[][] getTile() {
        return tile;
    }

    public void setTile(Tile[][] tile) {
        this.tile = tile;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public void addScore(int score) {
        this.score = this.score + score;
    }
    
    public int getBest() {
        return best;
    }

    public void setBest(int best) {
        this.best = best;
    }
}
