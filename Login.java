package com.mycompany.assignment_pt1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Login {
    
    
    
    public Login() {
        
    }
    public boolean checkUserName(String username){
        
        if(username.contains("_") && username.length() <= 5){
                return true;
        }else{
            return false;
        }
    }
    
    public boolean checkPasswordComplexity(String password){
        
    String capital = ".*[A-Z].*";//checks capital letters
    String small = ".*[a-z].*";//checks small letter
    String digit = ".*[0-9].*";//checks digits
    String special = ".*[!@#$%^&*()_+\\-=\\[\\]{}|;':\",./<>?].*";//checks special characters
    
    if(password.length() >= 8 && password.matches(capital) && password.matches(small) && password.matches(digit) && password.matches(special)){
        return true;
    }
    else{
        return false;
    }
    }

public boolean checkCellPhoneNumber(String phone){

    String saCode = "+27";
    String firstThreeChars = phone.substring(0,3);//Gets characters from index 0 to 2 (inclusive)
    
    int fourthDigit = Character.getNumericValue(phone.charAt(3));//Gets and converts to fourth digit
    if(phone.length() <= 12 && firstThreeChars.equals(saCode) && fourthDigit >= 6 && fourthDigit <= 8){
        return true;
    } 
    else{
        return false;
    }
}

public String registerUser(String username, String password, String phone){
    
    boolean validatePhone = checkCellPhoneNumber(phone);
    boolean validateUserName = checkUserName(username);
    boolean validatePassword = checkPasswordComplexity(password);
    
    if(validatePhone == true && validateUserName == true && validatePassword == true){
        return "User is succesfully registered";
    }else{
        return "User registration failed!!!";
    }
}

     public boolean loginUser(String username, String password){
        boolean validUserName = checkUserName(username);
        boolean validPassword = checkPasswordComplexity(password);
         
        if(validUserName && validPassword){
                return true;
        }else{
            return false; 
        }     
         }
     
     public String returnLoginStatus(String username, String password){
         boolean validUserName = checkUserName(username);
         boolean validPassword = checkPasswordComplexity(password);
         
         if(validUserName && validPassword){
             return "Login succesful";
         }else{
             return "Login failed";
         }
     }
}

