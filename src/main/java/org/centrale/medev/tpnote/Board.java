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
    
    // Attributes
    
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
     * @param code the new code
     */
    public void setCode(List<Integer> code) {
        this.code = code;
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
     * @param guessList the new guess list
     */
    public void setGuessList(List<List<Integer>> guessList) {
        this.guessList = guessList;
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
     * @param decoder the new decoder
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
     * @param coder the new coder
     */    
    public void setCoder(Coder coder) {
        this.coder = coder;
    }
    
    
    //Constructors

    /**
     * Empty Constructor
     */
    public Board() {
        this.guessList = new ArrayList<>();
    }
    
    /**
     * Board constructor
     * @param decoder the decoder player
     * @param coder the coder player
     */
    public Board(Decoder decoder, Coder coder) {
        this.decoder = decoder;
        this.coder = coder;
        this.guessList = new ArrayList<>();
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
            //print state of the board before the decoder makes a guess :
            if (turn > 0){
                System.out.println("Current game board :");
                for (int i = 0; i < turn; i++){
                    List<String> temp = colors(this.getGuessList().get(i));
                    System.out.println(temp.get(0) + ", " + temp.get(1) + ", " + temp.get(2) + ", " + temp.get(3) + "\n" +
                            "White = " + this.guessList.get(i).get(5) + "; Black = " + this.guessList.get(i).get(4));
                }
            }

            
            //getting the guess of the current turn
            List<Integer> guess = decoder.getGuess();
            
            if (guess.equals(code)){
                System.out.println(decoder.getName() + ", the decoder wins ! ");
                return turn;
            }
            //The guess is wrong, the coder indicates black/white marking
            else {
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
    
    public List<String> colors(List<Integer> guess) {
        final String[] COLORS = new String[]{"Jaune", "Bleu", "Rouge", "Vert"};
        List<String> colorList = new ArrayList<>(4);
        for (int i = 0; i< 4; i++){
            colorList.add(COLORS[guess.get(i)]);
        }
        return colorList;
    }
        

    
}
    
    
    
    
    
