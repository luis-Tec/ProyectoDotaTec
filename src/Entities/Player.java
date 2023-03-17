/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Player {

    public String Player;
    public ArrayList<FireCharacter> fireCharactersList = new ArrayList<>();
    public ArrayList<WaterCharacter> waterCharactersList = new ArrayList<>();
    public ArrayList<GroundCharacter> groundCharactersList = new ArrayList<>();
    public ArrayList<WindCharacter> windCharactersList = new ArrayList<>();
    public ArrayList<Towers> TowersList = new ArrayList<>();

    public Player(String Player) {
        this.Player = Player;
    }

    public String getPlayer() {
        return Player;
    }

    public void setPlayer(String Player) {
        this.Player = Player;
    }

    public ArrayList<FireCharacter> getFireCharactersList() {
        return fireCharactersList;
    }

    public void setFireCharactersList(ArrayList<FireCharacter> fireCharactersList) {
        this.fireCharactersList = fireCharactersList;
    }

    public ArrayList<WaterCharacter> getWaterCharactersList() {
        return waterCharactersList;
    }

    public void setWaterCharactersList(ArrayList<WaterCharacter> waterCharactersList) {
        this.waterCharactersList = waterCharactersList;
    }

    public ArrayList<GroundCharacter> getGroundCharactersList() {
        return groundCharactersList;
    }

    public void setGroundCharactersList(ArrayList<GroundCharacter> groundCharactersList) {
        this.groundCharactersList = groundCharactersList;
    }

    public ArrayList<WindCharacter> getWindCharactersList() {
        return windCharactersList;
    }

    public void setWindCharactersList(ArrayList<WindCharacter> windCharactersList) {
        this.windCharactersList = windCharactersList;
    }

    public ArrayList<Towers> getTowersList() {
        return TowersList;
    }

    public void setTowersList(ArrayList<Towers> TowersList) {
        this.TowersList = TowersList;
    }

    

}
