/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.view;

import java.awt.event.KeyListener;
import testgame.*;

/**
 *
 * @author Atta
 */
public class BoardUI extends javax.swing.JFrame {
    private javax.swing.JPanel[] tileArray;
    private javax.swing.GroupLayout[] tileLayoutArray;
    private javax.swing.JLabel[] tileLabelArray;
    private java.awt.Color[] colorList;
    /**
     * Creates new form NewJFrame
     */
    public BoardUI() {
//        initComponents();
        makeComponents();
        this.setVisible(true);
        
    }

    private void makeComponents() {
        
        bg = new javax.swing.JPanel();
        board = new javax.swing.JPanel();
        palyerName = new javax.swing.JLabel();
        scoreBoard = new javax.swing.JPanel();
        scoreText = new javax.swing.JLabel();
        scoreValue = new javax.swing.JLabel();
        bestBoard = new javax.swing.JPanel();
        bestText = new javax.swing.JLabel();
        bestValue = new javax.swing.JLabel();
        
        colorList = new java.awt.Color[]{
            new java.awt.Color(255, 234, 167),
            new java.awt.Color(194, 54, 22)
        };
        
        tileLabelArray = new javax.swing.JLabel[16];
        for (int i =0; i<16; i++) {
            tileLabelArray[i] = new javax.swing.JLabel();
            tileLabelArray[i].setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
            tileLabelArray[i].setForeground(new java.awt.Color(255, 255, 255));
            tileLabelArray[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            tileLabelArray[i].setText("");
        }
        
        
        tileArray = new javax.swing.JPanel[16];
        tileLayoutArray = new javax.swing.GroupLayout[16];
        for (int i=0; i<16; i++) {
            tileArray[i] = new javax.swing.JPanel();
            tileArray[i].setBackground(new java.awt.Color(255, 234, 167));
            
            tileLayoutArray[i] = new javax.swing.GroupLayout(tileArray[i]);
            tileArray[i].setLayout(tileLayoutArray[i]);
            
            tileLayoutArray[i].setHorizontalGroup(
                tileLayoutArray[i].createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tileLabelArray[i], javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            );
            tileLayoutArray[i].setVerticalGroup(
                tileLayoutArray[i].createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tileLabelArray[i], javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            );
        }
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048");
        setResizable(false);

        bg.setBackground(new java.awt.Color(99, 110, 114));

        board.setBackground(new java.awt.Color(253, 203, 110));
        board.setPreferredSize(new java.awt.Dimension(460, 460));
        
        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tileArray[8], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tileArray[9], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tileArray[10], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tileArray[11], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tileArray[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[3], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tileArray[4], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[5], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[6], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[7], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tileArray[12], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[13], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[14], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tileArray[15], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tileArray[3], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tileArray[7], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[6], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[5], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[4], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tileArray[11], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[10], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[9], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[8], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tileArray[15], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[14], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[13], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileArray[12], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
            )
        );
        
        palyerName.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        palyerName.setForeground(new java.awt.Color(204, 204, 204));
        palyerName.setText("2048");

        scoreBoard.setBackground(new java.awt.Color(253, 203, 110));
        scoreBoard.setPreferredSize(new java.awt.Dimension(140, 48));

        scoreText.setBackground(new java.awt.Color(255, 255, 255));
        scoreText.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        scoreText.setForeground(new java.awt.Color(255, 255, 255));
        scoreText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreText.setText("SCORE");

        scoreValue.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        scoreValue.setForeground(new java.awt.Color(255, 255, 255));
        scoreValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreValue.setText("");

        javax.swing.GroupLayout scoreBoardLayout = new javax.swing.GroupLayout(scoreBoard);
        scoreBoard.setLayout(scoreBoardLayout);
        scoreBoardLayout.setHorizontalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreBoardLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(scoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scoreBoardLayout.setVerticalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scoreText)
                .addGap(4, 4, 4)
                .addComponent(scoreValue))
        );

        bestBoard.setBackground(new java.awt.Color(253, 203, 110));
        bestBoard.setPreferredSize(new java.awt.Dimension(140, 48));

        bestText.setBackground(new java.awt.Color(255, 255, 255));
        bestText.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bestText.setForeground(new java.awt.Color(255, 255, 255));
        bestText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestText.setText("BEST");

        bestValue.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        bestValue.setForeground(new java.awt.Color(255, 255, 255));
        bestValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestValue.setText("0");

        javax.swing.GroupLayout bestBoardLayout = new javax.swing.GroupLayout(bestBoard);
        bestBoard.setLayout(bestBoardLayout);
        bestBoardLayout.setHorizontalGroup(
            bestBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestBoardLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(bestText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(bestValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bestBoardLayout.setVerticalGroup(
            bestBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestBoardLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(bestText)
                .addGap(4, 4, 4)
                .addComponent(bestValue))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(palyerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bestBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palyerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    public void changeColor(int tileIdx, java.awt.Color color) {
        tileArray[tileIdx].setBackground(color);
    }
    
    public void changeValue(int tileIdx, int value) {
        if (value != 0) {
            tileLabelArray[tileIdx].setText(Integer.toString(value));
        } else {
            tileLabelArray[tileIdx].setText("");
        }
    }
    
    public void setScore(int score) {
        scoreValue.setText(Integer.toString(score));
    }
    
    public void setBest(int best) {
        bestValue.setText(Integer.toString(best));
    } 
    
    public void addMovementListener(KeyListener listenForMoveButton) {
        this.addKeyListener(listenForMoveButton);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        bg = new javax.swing.JPanel();
        board = new javax.swing.JPanel();
        tile1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tile2 = new javax.swing.JPanel();
        tile3 = new javax.swing.JPanel();
        tile5 = new javax.swing.JPanel();
        tile6 = new javax.swing.JPanel();
        tile7 = new javax.swing.JPanel();
        tile8 = new javax.swing.JPanel();
        tile9 = new javax.swing.JPanel();
        tile10 = new javax.swing.JPanel();
        tile11 = new javax.swing.JPanel();
        tile12 = new javax.swing.JPanel();
        tile13 = new javax.swing.JPanel();
        tile14 = new javax.swing.JPanel();
        tile15 = new javax.swing.JPanel();
        tile16 = new javax.swing.JPanel();
        tile17 = new javax.swing.JPanel();
        palyerName = new javax.swing.JLabel();
        scoreBoard = new javax.swing.JPanel();
        scoreText = new javax.swing.JLabel();
        scoreValue = new javax.swing.JLabel();
        bestBoard = new javax.swing.JPanel();
        bestText = new javax.swing.JLabel();
        bestValue = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048");
        setResizable(false);

        bg.setBackground(new java.awt.Color(99, 110, 114));

        board.setBackground(new java.awt.Color(253, 203, 110));
        board.setPreferredSize(new java.awt.Dimension(460, 460));

        tile1.setBackground(new java.awt.Color(108, 92, 231));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("4");

        javax.swing.GroupLayout tile1Layout = new javax.swing.GroupLayout(tile1);
        tile1.setLayout(tile1Layout);
        tile1Layout.setHorizontalGroup(
            tile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        tile1Layout.setVerticalGroup(
            tile1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        tile2.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile2Layout = new javax.swing.GroupLayout(tile2);
        tile2.setLayout(tile2Layout);
        tile2Layout.setHorizontalGroup(
            tile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile2Layout.setVerticalGroup(
            tile2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile3.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile3Layout = new javax.swing.GroupLayout(tile3);
        tile3.setLayout(tile3Layout);
        tile3Layout.setHorizontalGroup(
            tile3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile3Layout.setVerticalGroup(
            tile3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile5.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile5Layout = new javax.swing.GroupLayout(tile5);
        tile5.setLayout(tile5Layout);
        tile5Layout.setHorizontalGroup(
            tile5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile5Layout.setVerticalGroup(
            tile5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile6.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile6Layout = new javax.swing.GroupLayout(tile6);
        tile6.setLayout(tile6Layout);
        tile6Layout.setHorizontalGroup(
            tile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile6Layout.setVerticalGroup(
            tile6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile7.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile7Layout = new javax.swing.GroupLayout(tile7);
        tile7.setLayout(tile7Layout);
        tile7Layout.setHorizontalGroup(
            tile7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile7Layout.setVerticalGroup(
            tile7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile8.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile8Layout = new javax.swing.GroupLayout(tile8);
        tile8.setLayout(tile8Layout);
        tile8Layout.setHorizontalGroup(
            tile8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile8Layout.setVerticalGroup(
            tile8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile9.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile9Layout = new javax.swing.GroupLayout(tile9);
        tile9.setLayout(tile9Layout);
        tile9Layout.setHorizontalGroup(
            tile9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile9Layout.setVerticalGroup(
            tile9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile10.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile10Layout = new javax.swing.GroupLayout(tile10);
        tile10.setLayout(tile10Layout);
        tile10Layout.setHorizontalGroup(
            tile10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile10Layout.setVerticalGroup(
            tile10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile11.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile11Layout = new javax.swing.GroupLayout(tile11);
        tile11.setLayout(tile11Layout);
        tile11Layout.setHorizontalGroup(
            tile11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile11Layout.setVerticalGroup(
            tile11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile12.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile12Layout = new javax.swing.GroupLayout(tile12);
        tile12.setLayout(tile12Layout);
        tile12Layout.setHorizontalGroup(
            tile12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile12Layout.setVerticalGroup(
            tile12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile13.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile13Layout = new javax.swing.GroupLayout(tile13);
        tile13.setLayout(tile13Layout);
        tile13Layout.setHorizontalGroup(
            tile13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile13Layout.setVerticalGroup(
            tile13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile14.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile14Layout = new javax.swing.GroupLayout(tile14);
        tile14.setLayout(tile14Layout);
        tile14Layout.setHorizontalGroup(
            tile14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile14Layout.setVerticalGroup(
            tile14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile15.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile15Layout = new javax.swing.GroupLayout(tile15);
        tile15.setLayout(tile15Layout);
        tile15Layout.setHorizontalGroup(
            tile15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile15Layout.setVerticalGroup(
            tile15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile16.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile16Layout = new javax.swing.GroupLayout(tile16);
        tile16.setLayout(tile16Layout);
        tile16Layout.setHorizontalGroup(
            tile16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile16Layout.setVerticalGroup(
            tile16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tile17.setBackground(new java.awt.Color(255, 234, 167));

        javax.swing.GroupLayout tile17Layout = new javax.swing.GroupLayout(tile17);
        tile17.setLayout(tile17Layout);
        tile17Layout.setHorizontalGroup(
            tile17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tile17Layout.setVerticalGroup(
            tile17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tile10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tile11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(tile14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tile16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tile11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tile10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(boardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        palyerName.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        palyerName.setForeground(new java.awt.Color(204, 204, 204));
        palyerName.setText("2048");

        scoreBoard.setBackground(new java.awt.Color(253, 203, 110));
        scoreBoard.setPreferredSize(new java.awt.Dimension(140, 48));

        scoreText.setBackground(new java.awt.Color(255, 255, 255));
        scoreText.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        scoreText.setForeground(new java.awt.Color(255, 255, 255));
        scoreText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreText.setText("SCORE");

        scoreValue.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        scoreValue.setForeground(new java.awt.Color(255, 255, 255));
        scoreValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreValue.setText("1140");

        javax.swing.GroupLayout scoreBoardLayout = new javax.swing.GroupLayout(scoreBoard);
        scoreBoard.setLayout(scoreBoardLayout);
        scoreBoardLayout.setHorizontalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreBoardLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(scoreText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(scoreValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scoreBoardLayout.setVerticalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scoreText)
                .addGap(4, 4, 4)
                .addComponent(scoreValue))
        );

        bestBoard.setBackground(new java.awt.Color(253, 203, 110));
        bestBoard.setPreferredSize(new java.awt.Dimension(140, 48));

        bestText.setBackground(new java.awt.Color(255, 255, 255));
        bestText.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bestText.setForeground(new java.awt.Color(255, 255, 255));
        bestText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestText.setText("BEST");

        bestValue.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        bestValue.setForeground(new java.awt.Color(255, 255, 255));
        bestValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bestValue.setText("1436");

        javax.swing.GroupLayout bestBoardLayout = new javax.swing.GroupLayout(bestBoard);
        bestBoard.setLayout(bestBoardLayout);
        bestBoardLayout.setHorizontalGroup(
            bestBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestBoardLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(bestText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(bestValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bestBoardLayout.setVerticalGroup(
            bestBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestBoardLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(bestText)
                .addGap(4, 4, 4)
                .addComponent(bestValue))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(palyerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bestBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palyerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bestBoard;
    private javax.swing.JLabel bestText;
    private javax.swing.JLabel bestValue;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel board;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel palyerName;
    private javax.swing.JPanel scoreBoard;
    private javax.swing.JLabel scoreText;
    private javax.swing.JLabel scoreValue;
    private javax.swing.JPanel tile1;
    private javax.swing.JPanel tile10;
    private javax.swing.JPanel tile11;
    private javax.swing.JPanel tile12;
    private javax.swing.JPanel tile13;
    private javax.swing.JPanel tile14;
    private javax.swing.JPanel tile15;
    private javax.swing.JPanel tile16;
    private javax.swing.JPanel tile17;
    private javax.swing.JPanel tile2;
    private javax.swing.JPanel tile3;
    private javax.swing.JPanel tile5;
    private javax.swing.JPanel tile6;
    private javax.swing.JPanel tile7;
    private javax.swing.JPanel tile8;
    private javax.swing.JPanel tile9;
    // End of variables declaration//GEN-END:variables
}
