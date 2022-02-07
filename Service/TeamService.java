package com.bnta.wendy.Rugby.Service;

import com.bnta.wendy.Rugby.POJO.Player;
import com.bnta.wendy.Rugby.POJO.Team;

public class TeamService {

    public TeamService(){

    }

    //Start by counting the empty spaces on the team so we know if we can add players to the team
    // we need to return an int
    //parameters we need: Team

    public int countEmptySpacesOnTeam(Team team){
      //We need a temporary variable to store the team count
        int count = 0;
      //Loop through the players array to count the nulls
        for (Player player: team.getPlayers()) {
           //create an if statement to add all nulls in the player array to the count
            if (player == null){
                count++; }
            }
        //return count
        return count;
    }


}
