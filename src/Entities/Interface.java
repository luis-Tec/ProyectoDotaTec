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
public interface Interface {

    public void attack(String Mapa, String Skill, GroundCharacter gc, FireCharacter fc, WindCharacter wc, WaterCharacter wac);

    public void BasicAttack(GroundCharacter gc, FireCharacter fc, WindCharacter wc, WaterCharacter wac, Towers tw);

}
