/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class describing the player
 * @author Pierre Baudet, Loïc Patigny
 */
public class Player {
    
    // Attributes
    
    /**
     * Name of the player.
     */
    private String name;
    
    
    // Constructors

    /**
     * Constructor for the player.
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
    }
    
    // Getters

    /**
     * Getter for name.
     * @return the name of the player.
     */
    public String getName() {
        return name;
    }
    
    
    // Combination choice
    
    /**
     * Ask the user for a combination of colors.
     * @return a list of integer corresponding to the combination
     */
    public List<Integer> getCombination() {
        
        System.out.println("This is the available colors");
        System.out.println("0: Jaune");
        System.out.println("1: Bleu");
        System.out.println("2: Rouge");
        System.out.println("3: Vert");
        System.out.println("Please create a combination of 4 numbers corresponding to your combination:");
        
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        boolean correctAnswer = false;
        while (!correctAnswer) {
            answer = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-3]{4}", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(answer);
            correctAnswer = matcher.find();
            if (!correctAnswer) {
                System.out.println("The combination you gave is incorrect, please retry.");
            }
        }
        
        List<Integer> combination = new ArrayList<>(4);
        for (int i=0; i < answer.length(); i++) {
            combination.add(Character.getNumericValue(answer.charAt(i)));
        }
        
        return combination;
    }
    
    
    
}
