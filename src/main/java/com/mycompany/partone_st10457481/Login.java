package com.mycompany.partone_st10457481;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
    //Username
    public static boolean checkUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }
    
    
    //Password
     public static boolean checkPasswordComplexity(String sCheck) {
        
        boolean bHowLong = false;
        boolean bCapitalLetter = false;
        boolean bNumber = false;
        boolean bSpecialChar = false;
        char cPosition;
        int iCount = 0;
        
        for (int i=0;i < sCheck.length();i++) {
            cPosition = sCheck.charAt(i);
            if (Character.isDigit(cPosition)) {
                bNumber = true;
            }
            else if (Character.isUpperCase(cPosition)) {
                bCapitalLetter= true;
            }
            else if (!Character.isDigit(sCheck.charAt(i)) && !Character.isLetter(sCheck.charAt(i))
                    && !Character.isWhitespace(sCheck.charAt(i))) { bSpecialChar = true;
        }
            iCount = iCount + 1;
        
    }
      if (iCount >= 8) {
          bHowLong = true;
      } 
        
        if (bHowLong && bCapitalLetter && bNumber && bSpecialChar)
            return true;
        
        return bHowLong == true && bCapitalLetter == true && bNumber == true && bSpecialChar ==
                true && bHowLong == true;
     }
        
     
     //Register
        public static String registerUser(String username, String password){
            if (checkPasswordComplexity(password) && checkUsername(username)) {
            return "User Registered";
        } else {
            return "Registration fail.";
        }
    }
        
        
        //Login verify
        public static boolean loginUser(String username, String password, String usernameInput, 
                String passwordInput) {
         if  (usernameInput.equals(username) && passwordInput.equals(password)) {
             return username.equals(username) && password.equals(password);} else {
            return false;  
         }
       
        }
        
        
   
        //Message
        public static String returnLoginStatus(String username, String password,
                String usernameInput,String passwordInput) {
            
      
            if (loginUser(username, password, usernameInput, passwordInput)){
            return "Login successful! Welcome!";
        } else {
            return "Invalid username or password. Please try again.";
        }
        
       
        }
    
}
