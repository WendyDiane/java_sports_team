package com.bnta.wendy.Rugby.POJO;

import com.bnta.wendy.Rugby.POJO.Player;

public class Team {
    private Player[] players;
    private String name;
    private Manager Manager;

    public Team(){

    }

    public Team(String name, Manager manager){
        this.name = name;
        this.Manager = manager;
        this.players = new Player[15];
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Manager getManager() {
        return Manager;
    }

    public void setManager(Manager manager) {
        Manager = manager;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
