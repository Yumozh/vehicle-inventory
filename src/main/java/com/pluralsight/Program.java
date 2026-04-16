package com.pluralsight;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[6];

        vehicle[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicle[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicle[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicle[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicle[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicle[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        System.out.println(""" 
                                What do you want to do?
                                1 - List all vehicles
                                2 - Search by make/model
                                3 - Search by price range
                                4 - Search by color
                                5 - Add a vehicle
                                6 - Quit
                                Enter your command:""");

        int userOption = input.nextInt();
        switch(userOption) {
            case 1: listAllVehicles();
            break;
            case 2: //findVehiclesByPrice();
            break;
            case 5: //addAVehicle();
            break;
            case 6:
            return;
        }

    }

    private static void listAllVehicles(Vehicle[] vehicle){


    }
}
