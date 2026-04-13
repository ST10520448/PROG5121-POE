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
    //check paasword complexity
    public boolean checkPasswordComplexity(String password){
    //checks capital letters    
    String capital = ".*[A-Z].*";
    //checks small letter
    String small = ".*[a-z].*";
    //checks digits
    String digit = ".*[0-9].*";
    //checks special characters
    String special = ".*[!@#$%^&*()_+\\-=\\[\\]{}|;':\",./<>?].*";
    
    if(password.length() >= 8 && password.matches(capital) && password.matches(small) && password.matches(digit) && password.matches(special)){
        return true;
    }
    else{
        return false;
    }
    }
//Cellphone number validation
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

//Registration validation
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
//  Login validation
     public boolean loginUser(String username, String password){
        boolean validUserName = checkUserName(username);
        boolean validPassword = checkPasswordComplexity(password);
         
        if(validUserName && validPassword){
                return true;
        }else{
            return false; 
        }     
         }
     //Login status
     public String returnLoginStatus(String username, String password){
         boolean validUserName = checkUserName(username);
         boolean validPassword = checkPasswordComplexity(password);
         
         if(validUserName && validPassword){
             return "Welcome" + " " + username + " " + ",it is great to see you again";
         }else{
             return "Username or password incorrect, please try again.";
         }
     }
}

