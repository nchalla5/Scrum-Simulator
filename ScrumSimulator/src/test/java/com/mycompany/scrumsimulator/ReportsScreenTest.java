/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.scrumsimulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Sainath
 */
public class ReportsScreenTest {
    
    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockStatement;

    @Mock
    private ResultSet mockResultSet;

    @Mock
    private ResultSetMetaData mockResultSetMetaData;

    private ReportsScreen reportsScreen;

    @BeforeEach
    void setUp() throws SQLException {
        mockConnection = mock(Connection.class);
        mockStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);
        mockResultSetMetaData = mock(ResultSetMetaData.class);

        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.getMetaData()).thenReturn(mockResultSetMetaData);

        reportsScreen = new ReportsScreen();
    }

//    @Test
//    void testGenerateReportsButtonClicked() throws SQLException {
//        // Mock the database interaction
//        when(mockResultSetMetaData.getColumnCount()).thenReturn(1);
//        when(mockResultSetMetaData.getColumnName(1)).thenReturn("Report");
//        when(mockResultSet.next()).thenReturn(true).thenReturn(false);
//        when(mockResultSet.getString(1)).thenReturn("Test Report");
//
//        // Trigger the button click event
//        reportsScreen.jButton2ActionPerformed(null);
//
//        // Verify that the table model has been updated
//        DefaultTableModel model = (DefaultTableModel) reportsScreen.jTable1.getModel();
//        assertEquals(1, model.getRowCount());
//        assertEquals("After Sprint-1, number of blocked stories are: 1", model.getValueAt(0, 0));
//    }

    
}
