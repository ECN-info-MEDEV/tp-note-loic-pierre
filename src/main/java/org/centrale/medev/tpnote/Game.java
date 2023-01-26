/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

/**
 * Class describing a game.
 * @author Pierre Baudet, Loïc Patigny
 */
public class Game {
    
    // Attributes
    
    /**
     * First player
     */
    private Player player1;
    
    /**
     * Second player
     */
    private Player player2;
    
    
    // Constructors

    /**
     * Constructor for the game.
     * @param player1 the first player
     * @param player2 the second player
     */
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    
    // Play method
    
    /**
     * Create the game and play it.
     */
    public void play() {
        
    }
}
