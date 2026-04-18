/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment.pt1;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class AssignmentPt1 {
   
    public static void main(String[] args){
        
        //variables to store user registration input
        String username ;
        String password ;
        String phonenumber ;
        
        //scanner object to read user input
        Scanner input = new Scanner(System.in); 
        //login object to access all validation methods 
        Login login = new Login();
               
        //Registration Section
         //Prompt user to enter their registration details
        System.out.print("Please Enter Username: ");
        username = input.nextLine();
        System.out.print("Please Enter Password: ");
        password = input.nextLine();
        System.out.print("Enter phone Number: ");
        phonenumber = input.nextLine();
        
        //Store validation results
        boolean checkPhone = login.checkCellPhoneNumber(phonenumber);
        boolean checkUsername = login.checkUserName(username);
        boolean checkPassword = login.checkPassword(password);
        
        //check and display username validation result
        if(checkUsername){
            System.out.println("Username succesfully captured. ");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and five letters. ");
        }
        
        //check and display password validation result
        if(checkPassword){
            System.out.println("Password succesfully captured. ");
        }else{
            System.out.println("Password not correctly formatted, please ensure that password contains atleast eight characters. ");
        }
        
        //check and display phone number result
        if(checkPhone){
            System.out.println("Cell phone number succesfully added. ");
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code. ");
        }
        
        //register user and display registration result
        String registerResult = login.registerUser(username, password, phonenumber);
        System.out.println(registerResult);
        
         //Login Section
         //Prompt user to enter their login details
         System.out.println("--Please enter login details--");
        
        //variables to store user login input
        System.out.print("Enter username: ");
        String loginUser = input.nextLine();
        System.out.print("Enter password: ");
        String loginPass = input.nextLine();
        
        //attempt login and store result
        boolean status = login.loginUser(loginUser, loginPass);
        
        //display login stats message
        System.out.print(login.returnLoginStatus(status, loginUser));

        
                }    
        }