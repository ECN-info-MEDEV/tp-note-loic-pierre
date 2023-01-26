/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.List;
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
     
}
