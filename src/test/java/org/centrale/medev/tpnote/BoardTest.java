/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pierr
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getCode method, of class Board.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Board instance = new Board();
        List<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        instance.setCode(expResult);
        List<Integer> result = instance.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCode method, of class Board.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        List<Integer> code = new ArrayList<>();
        code.add(0);
        code.add(1);
        code.add(2);
        code.add(3);
        Board instance = new Board();
        instance.setCode(code);
    }

    /**
     * Test of getGuessList method, of class Board.
     */
    @Test
    public void testGetGuessList() {
        System.out.println("getGuessList");
        Board instance = new Board();
        List<List<Integer>> expResult = new ArrayList<>();
        List<List<Integer>> result = instance.getGuessList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGuessList method, of class Board.
     */
    @Test
    public void testSetGuessList() {
        System.out.println("setGuessList");
        List<List<Integer>> GuessList = new ArrayList<>();
        Board instance = new Board();
        instance.setGuessList(GuessList);
    }

    /**
     * Test of getDecoder method, of class Board.
     */
    @Test
    public void testGetDecoder() {
        System.out.println("getDecoder");
        Board instance = new Board();
        Decoder expResult = null;
        Decoder result = instance.getDecoder();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDecoder method, of class Board.
     */
    @Test
    public void testSetDecoder() {
        System.out.println("setDecoder");
        Decoder decoder = new Decoder("", 0);
        Board instance = new Board();
        instance.setDecoder(decoder);
    }

    /**
     * Test of getCoder method, of class Board.
     */
    @Test
    public void testGetCoder() {
        System.out.println("getCoder");
        Board instance = new Board();
        Coder expResult = null;
        Coder result = instance.getCoder();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoder method, of class Board.
     */
    @Test
    public void testSetCoder() {
        System.out.println("setCoder");
        Coder coder = new Coder("", 0);
        Board instance = new Board();
        instance.setCoder(coder);
    }

    /**
     * Test of colors method, of class Board.
     */
    @Test
    public void testColors() {
        System.out.println("colors");
        List<Integer> guess = new ArrayList<>();
        guess.add(0);
        guess.add(1);
        guess.add(2);
        guess.add(3);
        Board instance = new Board();
        List<String> expResult = new ArrayList<>();
        expResult.add("Jaune");
        expResult.add("Bleu");
        expResult.add("Rouge");
        expResult.add("Vert");
        List<String> result = instance.colors(guess);
        assertEquals(expResult, result);
    }
    
}
