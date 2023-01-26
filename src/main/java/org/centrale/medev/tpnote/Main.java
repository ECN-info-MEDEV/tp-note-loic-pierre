/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

/**
 * Main class
 * @author Pierre Baudet, Loïc Patigny
 */
public class Main {
    
    /**
     * Main method
     * @param args the arguments of the main method
     */
    public static void main(String[] args) {
        
        // Create the players
        Player player1 = new Player("");
        Player player2 = new Player("");
        player1.askName();
        player2.askName();
        
        // Create the game and play
        Game game = new Game(player1, player2);
        game.play();
    }
    
}
