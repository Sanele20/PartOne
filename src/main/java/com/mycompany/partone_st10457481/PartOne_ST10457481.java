/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partone_st10457481;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PartOne_ST10457481 {

     public static void main(String[] args) {
        
      String name = JOptionPane.showInputDialog("Enter your name:");
     String surname = JOptionPane.showInputDialog("Enter your surname:");
     String username = JOptionPane.showInputDialog("Enter your username:");
   String password = JOptionPane.showInputDialog("Enter your password:");
   
  

      
      
    
      
      if (name != null && surname != null && username != null && password != null){
          JOptionPane.showMessageDialog(null,"Name: " + name + "\nSurname: " + surname + "\nUsername: " + username +
                  "\nPassword" + password );}else { JOptionPane.showMessageDialog(null,"Login "
                          + "incomplete. Not all fields are filled in.");
      }
      
   
   
        
        //Username Condition.
        
        if (Login.checkUsername(username)== true) {
            JOptionPane.showMessageDialog(null,"Username successfully captured");
        } else JOptionPane.showMessageDialog(null,"Username is not correctly formatted."
                + "Please ensure that your username contains an "
                + "underscore and is no more than 5 charactyers in length.");
        
        
    
      
//Password condition.
    
    if (Login.checkPasswordComplexity(password) == false) {
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted. "
                + "Please ensure that your password is at least 8 characters long, "
                + "has at least one uppercase, has at least one number, and has at"
                + "least one number, and has at least one special character");
        System.exit(0);
    } else if (Login.checkPasswordComplexity(password) == true) {
        JOptionPane.showMessageDialog(null, "Password successfully captured");
    }
    
    
        // User Login
        System.out.println("Login to your account:");
        String usernameInput = JOptionPane.showInputDialog("Enter your username:");
        String passwordInput = JOptionPane.showInputDialog("Enter your password:");

        if (Login.loginUser(username, password, usernameInput, passwordInput)) {
            System.out.println("Login successful! Welcome, " + name + " " + surname + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

     
    }
   
   
   
   
}

