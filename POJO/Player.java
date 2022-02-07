package com.bnta.wendy.Rugby.POJO;

import java.util.Objects;

public class Player {

    private String name;
    private String position;
    private int squadNumber;
    private int contractLength;

    //Constructor

    public Player(){

    }

    public Player(String name, String position, int squadNumber, int contractLength) {
        this.name = name;
        this.position = position;
        this.squadNumber = squadNumber;
        this.contractLength = contractLength;
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", squadNumber=" + squadNumber +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return squadNumber == player.squadNumber && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, squadNumber, contractLength);
    }
}
