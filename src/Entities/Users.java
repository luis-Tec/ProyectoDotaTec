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
public class Users {

    private String name;
    private String nickName;
    private String passWord;
    private int edad;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLoss;
    private int userPerformance;
    ArrayList<Arena> arenas = new ArrayList<>();
    ArrayList<Character> characters = new ArrayList<>();

    public Users(String name, String nickName, String passWord, int edad) {
        this.name = name;
        this.nickName = nickName;
        this.passWord = passWord;
        this.edad = edad;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLoss = 0;
        this.userPerformance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLoss() {
        return gamesLoss;
    }

    public void setGamesLoss(int gamesLoss) {
        this.gamesLoss = gamesLoss;
    }

    public int getUserPerformance() {
        return userPerformance;
    }

    public void setUserPerformance(int userPerformance) {
        this.userPerformance = userPerformance;
    }

    public ArrayList<Arena> getArenas() {
        return arenas;
    }

    public void setArenas(ArrayList<Arena> arenas) {
        this.arenas = arenas;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    
}
