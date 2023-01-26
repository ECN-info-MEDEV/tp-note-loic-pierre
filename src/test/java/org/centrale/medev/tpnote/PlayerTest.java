/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev.tpnote;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("testName", 0);
        String expResult = "testName";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Player instance = new Player("", 20);
        int expResult = 20;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "testName";
        Player instance = new Player("", 0);
        instance.setName(name);
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 20;
        Player instance = new Player("", 0);
        instance.setScore(score);
    }

    /**
     * Test of askName method, of class Player.
     */
    @Test
    public void testAskName() {
        System.out.println("askName");
        Player instance = new Player("", 0);
        String data = "testName";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        instance.askName();
        System.setIn(stdin);
    }

    /**
     * Test of getCombination method, of class Player.
     */
    @Test
    public void testGetCombination() {
        System.out.println("getCombination");
        Player instance = new Player("", 0);
        List<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        String data = "0123";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        List<Integer> result = instance.getCombination();
        System.setIn(stdin);
        assertEquals(expResult, result);
    }
    
}
