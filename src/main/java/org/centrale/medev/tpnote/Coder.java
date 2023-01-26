/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Class describing the decoder
 * @author Pierre Baudet, Loïc Patigny
 */
public class Coder extends Player {
    
    // Constructors
    
    /**
     * Constructor for the coder.
     * @param name the name of the coder
     */
    public Coder(String name) {
        super(name);
    }
    
    // Code creation
    
    /**
     * Ask the user for a guess.
     * @return a list of integer corresponding to the combination
     */
    public List<Integer> getCode() {
        System.out.println("Create a secret code.");
        return super.getCombination();
    }
    
    
    // Evaluate the guess
    
    /**
     * Use a scanner to get the number of pieces.
     * @return the number of pieces
     */
    private int getNbPieces() {
        Scanner scanner = new Scanner(System.in);
        boolean isInteger = false;
        int nbPieces = 0;
        while (!isInteger) {
            try {
                nbPieces = scanner.nextInt();
                isInteger = true;
            } catch (NoSuchElementException e) {
                isInteger = false;
            }
        }
        return nbPieces;
    }
    
    /**
     * Get the number of white pieces the coder wants to add.
     * @return the number of white pieces
     */
    public int getNbWhite() {
        System.out.println("How many white pieces do you want to indicate?");
        return getNbPieces();    
    }
    
    /**
     * Get the number of black pieces the coder wants to add.
     * @return the number of black pieces
     */
    public int getNbBlack() {
        System.out.println("How many black pieces do you want to indicate?");
        return getNbPieces();    
    }
     
}
