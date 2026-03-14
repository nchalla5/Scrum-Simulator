/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.scrumsimulator;

import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eshwar Gulupalli
 */
public class ScrumBoardTest {
    
    
    @Test
    public void testJButton3ActionPerformed_SaveState() {
        ScrumBoard scrumBoard = new ScrumBoard();
        
        DefaultTableModel mockTableModel = new DefaultTableModel(
            new Object[][] {
                { "ID1", "Status1", "Title1" },
                { "ID2", "Status2", "Title2" }
            },
            new String[] { "New", "In Progress", "Done", "Blocker" }
        );
        scrumBoard.scrumBoardTable.setModel(mockTableModel);

        scrumBoard.jButton3ActionPerformed(null);

        DefaultTableModel savedTableModel = (DefaultTableModel) scrumBoard.scrumBoardTable.getModel();

        assertEquals("ID1", savedTableModel.getValueAt(0, 0));
        assertEquals("Status1", savedTableModel.getValueAt(0, 1));
        assertEquals("Title1", savedTableModel.getValueAt(0, 2));
        assertEquals("ID2", savedTableModel.getValueAt(1, 0));
        assertEquals("Status2", savedTableModel.getValueAt(1, 1));
        assertEquals("Title2", savedTableModel.getValueAt(1, 2));
    }
    
    @Test
    public void testSaveAction() {
        ScrumBoard scrumBoard = new ScrumBoard();

        DefaultTableModel mockTableModel = new DefaultTableModel(
            new Object[][] {
                { "ID3", "Status3", "Title3" },
                { "ID4", "Status4", "Title4" }
            },
            new String[] { "New", "In Progress", "Done", "Blocker" }
        );
        scrumBoard.scrumBoardTable.setModel(mockTableModel);

        scrumBoard.jButton3ActionPerformed(null);

        DefaultTableModel savedTableModel = (DefaultTableModel) scrumBoard.scrumBoardTable.getModel();

        assertEquals("ID3", savedTableModel.getValueAt(0, 0));
        assertEquals("Status3", savedTableModel.getValueAt(0, 1));
        assertEquals("Title3", savedTableModel.getValueAt(0, 2));
        assertEquals("ID4", savedTableModel.getValueAt(1, 0));
        assertEquals("Status4", savedTableModel.getValueAt(1, 1));
        assertEquals("Title4", savedTableModel.getValueAt(1, 2));
    }
    
    public ScrumBoardTest() {
    }
    
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ScrumBoard.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        ScrumBoard.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
