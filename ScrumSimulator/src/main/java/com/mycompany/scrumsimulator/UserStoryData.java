/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scrumsimulator;

/**
 *
 * @author nithi
 */
public class UserStoryData {
        String id;
        String title;
        String storyPoints;
        String status;
        // Add more fields for other columns as needed

        UserStoryData(String id, String title, String storyPoints, String status) {
            this.id = id;
            this.title = title;
            this.storyPoints = storyPoints;
            this.status = status;
            // Initialize other fields as needed
        }
    }