/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.List;

/**
 * Class describing the decoder
 * @author Pierre Baudet, Loïc Patigny
 */
public class Decoder extends Player {

    // Constructors
    
    /**
     * Constructor for the decoder.
     * @param name the name of the decoder
     * @param score the score of the decoder
     */
    public Decoder(String name, int score) {
        super(name, score);
    }
    
    /**
     * Constructor for the decoder.
     * @param player the player who will be a decoder
     */
    public Decoder(Player player) {
        super(player.getName(), player.getScore());
    }
 
    
    // Guess creation
    
    /**
     * Ask the user for a guess.
     * @return a list of integer corresponding to the combination
     */
    public List<Integer> getGuess() {
        System.out.println("Guess the code.");
        return super.getCombination();
    }
}
