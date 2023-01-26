/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe décrivant le plateau de jeu
 * @author Pierre Baudet, Loïc Patigny
 */
public class Board {
    //Attributs
    
    /**
     * Array List containing the code of the coder
     */
    private List<Integer> code;
    
    /**
     * Array List containing the Guess List made by the decoder
     */
    private List<List<Integer>> guessList;
    
    /**
     * 
     */
    private Decoder decoder;
    
    /**
     * 
     */
    private Coder coder;
    
    //Getters and Setters

     /**
     * gets the code of the current game
     * @return code
     */
    public List<Integer> getCode() {
        return code;
    }
    
     /**
     * sets the code of the current game
     */
    public void setCode(List<Integer> Code) {
        this.code = Code;
    }
    
     /**
     * gets the Guess List of the current game
     * @return Guess List
     */
    public List<List<Integer>> getGuessList() {
        return guessList;
    }

     /**
     * sets the Guess List of the current game
     */
    public void setGuessList(List<List<Integer>> GuessList) {
        this.guessList = GuessList;
    }

     /**
     * gets the decoder of the current game
     * @return decoder
     */    
    public Decoder getDecoder() {
        return decoder;
    }

     /**
     * sets the decoder of the current game
     */    
    public void setDecoder(Decoder decoder) {
        this.decoder = decoder;
    }

     /**
     * gets the coder of the current game
     * @return coder
     */    
    public Coder getCoder() {
        return coder;
    }

     /**
     * sets the coder of the current game
     */    
    public void setCoder(Coder coder) {
        this.coder = coder;
    }
    
    
    //Constructors

    public Board() {
    }
    
    //Methods
    
    /**
     * method running the ongoing round on the board
     * @return score the score of the coder that equals the number of turns (initiating at 0) the decoder takes to find the code
     */
    public int round(){
        //Setting and saving the code for the round
        this.setCode(coder.getCode());
        //initialize turns 
        for (int turn = 0; turn < 12; turn++){
            //getting the guess of the current turn
            List<Integer> guess = decoder.getGuess();
            
            if (guess.equals(code)){
                System.out.println(decoder.getName() + ", the decoder wins ! ");
                return turn;
            }
            //The guess is wrong, the coder indicates black/white marking
            else {
                score = score + 1;
                int nbBlack = coder.getNbBlack();
                int nbWhite = coder.getNbWhite();
                guess.add(nbBlack);
                guess.add(nbWhite);
                
                
                //actualize the guess list
                this.guessList.add(guess);            
            }
            
        }
        
        System.out.println(coder.getName() + ", the coder wins !"); 
        return 12;
    }
    
}
    
    
    
    
    
