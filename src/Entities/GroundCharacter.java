/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GroundCharacter extends Character implements Interface {

    private int health;
    private int mana;
    private int damage;
    ArrayList<Abilities> GroundAbilities = new ArrayList<>();

    public GroundCharacter(String name, String element) {
        super(name, element);
        this.health = 550;
        this.mana = 250;
        this.damage = 45;
    }

    public GroundCharacter() {
        super(null, null);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public ArrayList<Abilities> getGroundAbilities() {
        return GroundAbilities;
    }

    public void setGroundAbilities(ArrayList<Abilities> GroundAbilities) {
        this.GroundAbilities = GroundAbilities;
    }

    @Override
    public void attack(String Mapa, String Skill, GroundCharacter gc, FireCharacter fc, WindCharacter wc, WaterCharacter wac) {
        if (gc != null) {
            if (Mapa.equals(this.getElement())) {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            int Damage = (int) (this.GroundAbilities.get(i).getDamage() * 0.25);
                            gc.setHealth(gc.getHealth() - this.GroundAbilities.get(i).getDamage() + Damage);
                            if (gc.getHealth() <= 0) {
                                gc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");

                        }
                    }
                }
            } else {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            gc.setHealth(gc.getHealth() - this.GroundAbilities.get(i).getDamage());
                            if (gc.getHealth() <= 0) {
                                gc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");
                        }
                    }
                }
            }
        }
        if (fc != null) {
            if (Mapa.equals(this.getElement())) {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            int Damage = (int) (this.GroundAbilities.get(i).getDamage() * 0.25);
                            fc.setHealth(fc.getHealth() - this.GroundAbilities.get(i).getDamage() + Damage);
                            if (fc.getHealth() <= 0) {
                                fc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");

                        }
                    }
                }
            } else {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            fc.setHealth(fc.getHealth() - this.GroundAbilities.get(i).getDamage());
                            if (fc.getHealth() <= 0) {
                                fc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");
                        }
                    }
                }
            }
        }
        if (wc != null) {
            if (Mapa.equals(this.getElement())) {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            int Damage = (int) (this.GroundAbilities.get(i).getDamage() * 0.25);
                            wc.setHealth(wc.getHealth() - this.GroundAbilities.get(i).getDamage() + Damage);
                            if (wc.getHealth() <= 0) {
                                wc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");

                        }
                    }
                }
            } else {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            wc.setHealth(wc.getHealth() - this.GroundAbilities.get(i).getDamage());
                            if (wc.getHealth() <= 0) {
                                wc.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");
                        }
                    }
                }
            }
        }
        if (wac != null) {
            if (Mapa.equals(this.getElement())) {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            int Damage = (int) (this.GroundAbilities.get(i).getDamage() * 0.25);
                            wac.setHealth(wac.getHealth() - this.GroundAbilities.get(i).getDamage() + Damage);
                            if (wac.getHealth() <= 0) {
                                wac.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");

                        }
                    }
                }
            } else {
                for (int i = 0; i < this.GroundAbilities.size(); i++) {
                    if (this.GroundAbilities.get(i).getName().equals(Skill)) {
                        if (this.getMana() > this.GroundAbilities.get(i).getManaCosts()) {
                            this.setMana(this.getMana() - (this.GroundAbilities.get(i).getManaCosts()));
                            wac.setHealth(wac.getHealth() - this.GroundAbilities.get(i).getDamage());
                            if (wac.getHealth() <= 0) {
                                wac.setHealth(0);
                                int DamageMax = (int) (this.getDamage() * 0.25);
                                this.setDamage(this.getDamage() + DamageMax);
                                this.setLevel(this.getLevel() + 1);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, this.getName() + " don't have enough mana");
                        }
                    }
                }
            }
        }
    }

    @Override
    public void BasicAttack(GroundCharacter gc, FireCharacter fc, WindCharacter wc, WaterCharacter wac, Towers tw) {
        if (gc != null) {
            gc.setHealth(gc.getHealth() - this.getDamage());
            if (gc.getHealth() <= 0) {
                gc.setHealth(0);
                int DamageMax = (int) (this.getDamage() * 0.25);
                this.setDamage(this.getDamage() + DamageMax);
                this.setLevel(this.getLevel() + 1);

            }
        }
        if (fc != null) {
            fc.setHealth(fc.getHealth() - this.getDamage());
            if (fc.getHealth() <= 0) {
                fc.setHealth(0);
                int DamageMax = (int) (this.getDamage() * 0.25);
                this.setDamage(this.getDamage() + DamageMax);
                this.setLevel(this.getLevel() + 1);

            }
        }
        if (wc != null) {
            wc.setHealth(wc.getHealth() - this.getDamage());
            if (wc.getHealth() <= 0) {
                wc.setHealth(0);
                int DamageMax = (int) (this.getDamage() * 0.25);
                this.setDamage(this.getDamage() + DamageMax);
                this.setLevel(this.getLevel() + 1);

            }
        }
        if (wac != null) {
            wac.setHealth(wac.getHealth() - this.getDamage());
            if (wac.getHealth() <= 0) {
                wac.setHealth(0);
                int DamageMax = (int) (this.getDamage() * 0.25);
                this.setDamage(this.getDamage() + DamageMax);
                this.setLevel(this.getLevel() + 1);

            }
        }
        if (tw != null) {
            tw.setHealth(tw.getHealth() - this.getDamage());
            if (tw.getHealth() <= 0) {
                tw.setHealth(0);
                int DamageMax = (int) (this.getDamage() * 0.25);
                this.setDamage(this.getDamage() + DamageMax);
                this.setLevel(this.getLevel() + 1);
            }
        }
    }
}
