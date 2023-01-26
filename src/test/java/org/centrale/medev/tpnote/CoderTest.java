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
public class CoderTest {
    
    public CoderTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getCode method, of class Coder.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Coder instance = new Coder("", 0);
        List<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        String data = "0123";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        List<Integer> result = instance.getCode();
        System.setIn(stdin);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbWhite method, of class Coder.
     */
    @Test
    public void testGetNbWhite() {
        System.out.println("getNbWhite");
        Coder instance = new Coder("", 0);
        int expResult = 2;
        String data = "2";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int result = instance.getNbWhite();
        System.setIn(stdin);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbBlack method, of class Coder.
     */
    @Test
    public void testGetNbBlack() {
        System.out.println("getNbBlack");
        Coder instance = new Coder("", 0);
        int expResult = 4;
        String data = "4";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        int result = instance.getNbBlack();
        System.setIn(stdin);
        assertEquals(expResult, result);
    }
    
}
