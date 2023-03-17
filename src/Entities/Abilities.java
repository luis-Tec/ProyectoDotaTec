/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author User
 */
public class Abilities {
    private int manaCosts;
    private int damage;
    private String name;

    public Abilities(int manaCosts, int damage, String name) {
        this.manaCosts = manaCosts;
        this.damage = damage;
        this.name = name;
    }

    public int getManaCosts() {
        return manaCosts;
    }

    public void setManaCosts(int manaCosts) {
        this.manaCosts = manaCosts;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
