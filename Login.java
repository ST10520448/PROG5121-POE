package com.mycompany.assignment.pt1;
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
    
    //method checks the validity of the username
     //Username must contain an underscore
     //and must be at least 5 characters long
    
    //Username check
    public boolean checkUserName(String username){
        if(username.contains("_") && username.length() <= 5){
            return true;
        }else{
            return false;
        }
    }        

    //Method to check if password meets complexity requirements
     //Password must have at least 8 characters, one uppercase,
     //one lowercase, one digit and one special character
     
    //Password check
    public static boolean checkPassword(String password) {

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
    }
 
    //Method to validate South African cell number
     //Number must start with +27, followed by 6, 7 or 8
     //and must not exceed 12 characters total
  
    //cellphone number check
    public boolean checkCellPhoneNumber(String phone){

       if(phone.length() < 3){
           return false;
       }
      String saCode = "+27";
      String firstThreeChars = phone.substring(0,3);
      int fourthDigit = Character.getNumericValue(phone.charAt(3));
      
      if(phone.length() <= 12 &&
           firstThreeChars.equals(saCode) &&
           fourthDigit >= 6 &&
           fourthDigit <=  8){
        return true;
    } 
    else{
        return false;
    }
}
    
     //Method to register a new user
     //All three validations must pass for
     //registration to be successful
public String registerUser(String username, String password, String phone){
    
    boolean checkPhone = checkCellPhoneNumber(phone);
    boolean checkUserName = checkUserName(username);
    boolean checkPassword = checkPassword(password);
    
    if(checkPhone && checkUserName && checkPassword){
        return "User is succesfully registered";
    }else{
        return "User registration failed!!!";
    }
}

     //Method to login user
     //Both username and password must pass
     //validation for login to be successful
     public boolean loginUser(String username, String password){
        boolean validUserName = checkUserName(username);
        boolean validPassword = checkPassword(password);
         
        if(validUserName && validPassword){
                return true;
        }else{
            return false; 
        }     
         }
     
     //Method to return login status message
     //Returns welcome message if status is true
     //Returns error message if status is false
     public String returnLoginStatus(boolean status, String username){
         if(status){
             return "welcome " + username + ",it is great to see you again.";
                }else{
             return "Username or password incorrect, please try again.";
                  
         
         }
     }
}
