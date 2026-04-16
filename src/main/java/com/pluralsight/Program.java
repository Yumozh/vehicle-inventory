package com.pluralsight;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static Vehicle[] vehicles = new Vehicle[20];

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
            input.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByModel();
                    break;
                case 3:
                    searchPriceRange();
                case 5:
                    //addAVehicle();
                    break;
                case 6:
                    programIsRunning = false;
                    break;
            }
        }

    }

    private static void listAllVehicles(){
        System.out.println("---List of All Vehicles ---");
        for(Vehicle oneVehicle : vehicles) {
            if(oneVehicle!= null) {
                System.out.println(oneVehicle.getVehicleId() + ", " + oneVehicle.getMakeModel() + ", " + oneVehicle.getColor()
                        + ", " + oneVehicle.getOdometerReading() + ", " + oneVehicle.getPrice());
            }
        }
        System.out.println();
    }

    private static void findVehiclesByModel(){
        System.out.println("---Search by make/model--- ");
        System.out.println("Enter model name: ");
        String inputModel = input.nextLine();
        boolean foundVehicle = false;

        for (Vehicle eachVehicle : vehicles){
            if (inputModel.equals(eachVehicle.getMakeModel())){
                System.out.println("We found option that match you model request: " + eachVehicle.getVehicleId()+ ", " + eachVehicle.getMakeModel() + ", " + eachVehicle.getColor()
                        + ", " + eachVehicle.getOdometerReading() + ", " + eachVehicle.getPrice());
                foundVehicle = true;
            }
        }
        if(!foundVehicle){
            System.out.println("We do not have this model available!");
        }
        System.out.println();
    }

    private static void searchPriceRange(){
        System.out.println("---List Vehicle withing Price Range---");
        System.out.println("Enter min price: ");
        float inputMinPrice = input.nextFloat();

        System.out.println("Enter max price: ");
        float inputMaxPrice = input.nextFloat();

        boolean found = false;

        for (Vehicle eachVehicle : vehicles){
            if(eachVehicle.getPrice() >= inputMinPrice && eachVehicle.getPrice() <= inputMaxPrice){

                System.out.println("We found option that match you model request: " + eachVehicle.getVehicleId()+ ", " + eachVehicle.getMakeModel() + ", " + eachVehicle.getColor()
                        + ", " + eachVehicle.getOdometerReading() + ", " + eachVehicle.getPrice());
                found = true;
            }
        }
        if (!found){
            System.out.println("No car withing your range!");
        }
    }



}

