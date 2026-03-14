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
 * @author Sainath
 */
public class deleteUserStoriesTest {
    
        private deleteUserStories deleteUserStoriesInstance;

    @BeforeEach
    public void setUp() {
        deleteUserStoriesInstance = new deleteUserStories();
    }

//    @Test
//    public void testDeleteUserStoriesButtonActionPerformed_SuccessfulDeletion() {
//        deleteUserStoriesInstance.userStoryId.setText("7");
//
//        deleteUserStoriesInstance.DeleteUserStoriesButtonActionPerformed(null);
//
//        assertEquals("User Story with ID 7 is deleted", deleteUserStoriesInstance.LabelHiddenMessage.getText());
//    }

    @Test
    public void testDeleteUserStoriesButtonActionPerformed_NoExistingUserStory() {

        deleteUserStoriesInstance.userStoryId.setText("100");

        deleteUserStoriesInstance.DeleteUserStoriesButtonActionPerformed(null);

        assertEquals("No user story with ID : 100 exists", deleteUserStoriesInstance.LabelHiddenMessage.getText());
    }

//    @Test
//    public void testFetchDeletingUserStoryButtonActionPerformed_UserStoryExists() {
//
//
//        deleteUserStoriesInstance.userStoryId.setText("7");
//
//        deleteUserStoriesInstance.FetchDeletingUserStoryButtonActionPerformed(null);
//
//        assertTrue(deleteUserStoriesInstance.DeletingUserStoryTable.getRowCount() == 1);
//    }

    @Test
    public void testFetchDeletingUserStoryButtonActionPerformed_NoExistingUserStory() {

        deleteUserStoriesInstance.userStoryId.setText("100");

        deleteUserStoriesInstance.FetchDeletingUserStoryButtonActionPerformed(null);

        assertEquals("No User Story with ID 100", deleteUserStoriesInstance.LabelHiddenMessage.getText());
    }
    
}
