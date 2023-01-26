/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.Scanner;

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
        
        boolean gameOver = false;
        int score = 0;
        int nbRound = 0;
        Coder coder;
        Decoder decoder;
        
        while (!gameOver) {
            if (nbRound % 2 == 0) {
                coder = new Coder(player1);
                decoder = new Decoder(player2);
            } else {
                coder = new Coder(player2);
                decoder = new Decoder(player1);
            }
            Board board = new Board(decoder, coder);
            score = board.round();
            coder.setScore(coder.getScore() + score);
            
            nbRound += 1;
            if (nbRound % 2 == 0) {
                gameOver = this.askEndGame();
            }
            
        }
    }
    
    private boolean askEndGame() {
        System.out.println("Do you both agree to end the game ? [y: yes; n: no]");
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        boolean correctAnswer = false;
        while (!correctAnswer) {
            answer = scanner.nextLine();
            if (!answer.equals("y") && !answer.equals("n")) {
                correctAnswer = false;
                System.out.println("Write 'y' or 'n' for yes or no.");
            }
        }
        return answer.equals("y");
    }
}
