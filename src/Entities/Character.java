/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public  class Character {
    
    private String name;
    private int moves;
    private int level;
    private String element;
    private int totalAbilities;
    private boolean Turn;

    public Character(String name, String element) {
        this.name = name;
        this.moves = 3;
        this.level = 1;
        this.element = element;
        this.totalAbilities = 3;
        this.Turn = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getTotalAbilities() {
        return totalAbilities;
    }

    public void setTotalAbilities(int totalAbilities) {
        this.totalAbilities = totalAbilities;
    }

    public boolean isTurn() {
        return Turn;
    }

    public void setTurn(boolean Turn) {
        this.Turn = Turn;
    }
    
}
