/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.scrumsimulator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsani
 */
public class ConfigScreenSimOperatorTest {
    
    private ConfigScreenSimOperator configScreen;

    @BeforeEach
    public void setUp() {
        configScreen = new ConfigScreenSimOperator();
    }

//    @Test
//    public void testUpdateConfigurations() {
//        // Test updating configurations
//        configScreen.jTextField1.setText("13");
//        configScreen.jTextField5.setText("21");
//        configScreen.jTextField6.setText("31");
//
//        // Trigger the update action
//        configScreen.jButton1ActionPerformed(null);
//
//        // Validate that configurations were updated successfully
//        // You should modify this part to include your expected values and assertions
//        assertEquals("13", configScreen.jTextField1.getText());
//        assertEquals("21", configScreen.jTextField5.getText());
//        assertEquals("31", configScreen.jTextField6.getText());
//    }

//    @Test
//    public void testFetchConfigurations() {
//        // Trigger the fetch action
//        configScreen.jButton3ActionPerformed(null);
//
//        // Validate that fetched configurations match the expected values from the test database
//        // You should modify this part to include your expected values and assertions
//        assertEquals("ExpectedSprintLengthValue", configScreen.jTextField1.getText());
//        assertEquals("ExpectedDevelopersCountValue", configScreen.jTextField5.getText());
//        assertEquals("ExpectedStoriesValue", configScreen.jTextField6.getText());
//    }

    
}
