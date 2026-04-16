package com.pluralsight;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[6];

    public static void main(String[] args) {

        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.println(""" 
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model
                    3 - Search by price range
                    4 - Search by color
                    5 - Add a vehicle
                    6 - Quit
                    Enter your command:""");

            int command = input.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2: //findVehiclesByPrice();
                    break;
                case 5: //addAVehicle();
                    break;
                case 6:
                    break;
            }
        }

    }

    private static void listAllVehicles(){
        System.out.println("---List of All Vehicles ---");
        for(Vehicle oneVehicle : vehicles) {

            System.out.println(oneVehicle.getVehicleId()+ ", " + oneVehicle.getMakeModel() + ", " + oneVehicle.getColor()
                                + ", " + oneVehicle.getOdometerReading() + ", " + oneVehicle.getPrice());
        }
        System.out.println();
    }


}

