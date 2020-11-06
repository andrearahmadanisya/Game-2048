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
public class Tile {
    private int value;
    private java.awt.Color color;
    private boolean merged;
    

    public Tile(int value, int[] position) {
        this.value = value;
        this.color = new java.awt.Color(255, 234, 167);
        this.merged = false;
    }
    
    public boolean isEmpty() {
        return this.value == 0;
    }
    
    public boolean equals(Tile tile){
        return (this.getValue() == tile.getValue()) && !this.isEmpty() && !tile.isEmpty();
    }
    
    public void clearTile(){
        this.value = 0;
        this.color = new java.awt.Color(255, 234, 167);
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        if (value != 0) {
            this.setColor(new java.awt.Color(108, 92, 231));
        }
    }

    public java.awt.Color getColor() {
        return color;
    }

    public void setColor(java.awt.Color color) {
        this.color = color;
    }

    public boolean isIsMerged() {
        return merged;
    }

    public void setIsMerged(boolean isMerged) {
        this.merged = isMerged;
    }
    
}
