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
public class GameResults {
    
    private int deads;
    private int kills;
    private int destroyedTowers;
    private int playedTurns;

    public GameResults(int deads, int kills, int destroyedTowers, int playedTurns) {
        this.deads = deads;
        this.kills = kills;
        this.destroyedTowers = destroyedTowers;
        this.playedTurns = playedTurns;
    }

    public int getDeads() {
        return deads;
    }

    public void setDeads(int deads) {
        this.deads = deads;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDestroyedTowers() {
        return destroyedTowers;
    }

    public void setDestroyedTowers(int destroyedTowers) {
        this.destroyedTowers = destroyedTowers;
    }

    public int getPlayedTurns() {
        return playedTurns;
    }

    public void setPlayedTurns(int playedTurns) {
        this.playedTurns = playedTurns;
    }
    
}
