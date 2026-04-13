/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_pt1;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Registration {
    
    public static void SignUp(){
    }
    public static void SignIn(){
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String firstname ;
        String lastname ;
        String username ;
        String password ;
        String phonenumber ;
        
        //Promt and Receiving user input
        System.out.print("Enter First Name: ");
        firstname = input.nextLine();
        System.out.print("Enter Last Name: ");
        lastname = input.nextLine();
        System.out.print("Enter Username: ");
        username = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();
        System.out.print("Enter phone Number: ");
        phonenumber = input.nextLine();
        
        Login login = new Login();
        //Validation of inputs
        boolean validatePhone = login.checkCellPhoneNumber(phonenumber);
        boolean validateUsername = login.checkUserName(username);
        boolean validatePassword = login.checkPasswordComplexity(password);
        
        //check and validate username
        if(validateUsername = true){
            System.out.println("Username has been succesfully captured. ");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five letters in lenghth. ");
        }
        
        //check and validate password
        if(validatePassword = true){
            System.out.println("Password succesfully captured. ");
        }else{
            System.out.println("Password not correctly formatted, please ensure that password contains atleast eight characters, a capital letter, a number, and a special character. ");
        }
        
        //check and validate phone number
        if(validatePhone = true){
            System.out.println("Cell phone number has been succesfully added. ");
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code. ");
        }
        }    
        } 
