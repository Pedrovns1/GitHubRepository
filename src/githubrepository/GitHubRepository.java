/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githubrepository;

import java.util.Scanner;

/**
 *
 * @author peuvi
 */
public class GitHubRepository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        
        System.out.println("Enter your name:");
        String Name = sc.nextLine();
        
        System.out.println("Enter your address:");
        String Address = sc.nextLine();
        
        String Email;
        
        while (true){
        System.out.println("Enter your email:");
        Email = sc.nextLine();
        
        if (Email.matches(".+@.+\\..+")) {
            break;
        }else{
            System.out.println("Invalid email format. Please enter a valid email.");
        }
        }
        System.out.println("Enter your contact number:");
        int ContactNumber = sc.nextInt();
        sc.nextLine();
                
        System.out.println("Enter car model:");
        String Model = sc.nextLine();
        
        System.out.println("Enter car make:");
        String Make = sc.nextLine();
        
        System.out.println("Enter car color:");
        String Color = sc.nextLine();
        
        System.out.println("Enter number of wheels:");
        int NumWheels = sc.nextInt();
        
        Car car = new Car(Model, Make, Color , NumWheels);
        PersonalData personalData = new PersonalData(Name, Address, Email, ContactNumber);
        
        System.out.println("These are the personal detail provid:");
        System.out.printf("Personal Details:%nName: %s%nAddress: %s%nEmail: %s%nContact Number: %d%n",
                  personalData.Name, personalData.Address, personalData.Email, personalData.ContactNumber);
        System.out.println("These are the specifications of the car you selected.");
        System.out.printf("Car Details:%nCar Make: %s%nCar Model: %s%nCar Color: %s%nNumber of Wheels: %d%n",
                  car.Make, car.Model, car.Colour, car.NumWheels);

        System.out.println("Thank you for your request. A member of our staff will be in touch shortly.");
    }
    
}
