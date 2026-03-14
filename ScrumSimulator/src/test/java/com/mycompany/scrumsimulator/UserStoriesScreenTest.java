///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
// */
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
///**
// *
// * @author nishalsharvayigari
// */
//
//
//public class UserStoriesScreenTest {
//
//    @Test
//    public void testFetchUserStoriesFromDAO() {
//        // Set up the H2 in-memory database
//        try (Connection connection = DriverManager.getConnection("jdbc:mysql://sql3.freesqldatabase.com:3306/sql3659139","sql3659139" ,"ZD2nzaxCwN")) {
//            // Create tables and insert test data
//            try (Statement statement = connection.createStatement()) {
//                statement.execute("CREATE TABLE UserStories (ID INT PRIMARY KEY, Title VARCHAR(255), Status VARCHAR(255))");
//                statement.execute("INSERT INTO UserStories VALUES (1, 'Sample User Story', 'New')");
//                statement.execute("INSERT INTO UserStories VALUES (2, 'In Progress Story', 'In Progress')");
//                statement.execute("INSERT INTO UserStories VALUES (3, 'Done Story', 'Done')");
//                statement.execute("INSERT INTO UserStories VALUES (4, 'Blocker Story', 'Blocker')");
//            }
//
//            // Create an instance of UserStoriesDAO with the H2 in-memory database connection
//            UserStoriesDAO userStoriesDAO = new UserStoriesDAO(connection);
//
//            // Call the method to be tested for different statuses
//            List<UserStory> newStories = userStoriesDAO.fetchUserStories("New", "1");
//            List<UserStory> inProgressStories = userStoriesDAO.fetchUserStories("In Progress", "1");
//            List<UserStory> doneStories = userStoriesDAO.fetchUserStories("Done", "1");
//            List<UserStory> blockerStories = userStoriesDAO.fetchUserStories("Blocker", "1");
//
//            // Verify the results
//            assertEquals(1, newStories.size());
//            assertEquals(1, inProgressStories.size());
//            assertEquals(1, doneStories.size());
//            assertEquals(1, blockerStories.size());
//
//            UserStory newStory = newStories.get(0);
//            assertEquals("1", newStory.getId());
//            assertEquals("Sample User Story", newStory.getTitle());
//
//            UserStory inProgressStory = inProgressStories.get(0);
//            assertEquals("2", inProgressStory.getId());
//            assertEquals("In Progress Story", inProgressStory.getTitle());
//
//            UserStory doneStory = doneStories.get(0);
//            assertEquals("3", doneStory.getId());
//            assertEquals("Done Story", doneStory.getTitle());
//
//            UserStory blockerStory = blockerStories.get(0);
//            assertEquals("4", blockerStory.getId());
//            assertEquals("Blocker Story", blockerStory.getTitle());
//
//        } catch (SQLException e) {
//            fail("Exception not expected: " + e.getMessage());
//        }
//    }
//}