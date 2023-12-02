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
        
        System.out.println("Enter car model:");
        String Model = sc.nextLine();
        
        System.out.println("Enter car make:");
        String Make = sc.nextLine();
        
        System.out.println("Enter car color:");
        String Color = sc.nextLine();
        
        System.out.println("Enter number of wheels:");
        int NumWheels = sc.nextInt();
        
        Car car = new Car(Model, Make, Color , NumWheels);
        
        
        System.out.println("These are the specifications of the car you selected.");
        System.out.println("Car Make: " + car.Make + ", Car Model: " + car.Model + ", Car Color: " + car.Colour + ", Number of Wheels: " + car.NumWheels);
    }
    
}
