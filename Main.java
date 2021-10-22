// By: Joshua and Tochi

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Rental rent = new Rental();
    rent.setcNum(recieveContractNum());
    rent.setHoursAndMinutes(rentTime());
    printingDetails(rent.getContractNum(), rent.getHoursRented(), rent.getExtraMin(), rent.getTotalPrice());

  }
  public static int rentTime() {
    Scanner rentalTime = new Scanner(System.in);
    System.out.println("What is the rental time");
    int timeRented = rentalTime.nextInt();
    return timeRented;
  }

  public static String recieveContractNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Whats the contract number");
    String contractNumber = scanner.nextLine();
    return contractNumber;
  }

  public static void motto() {
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

    System.out.println("S                                                    S");
    System.out.println("S Sammy’s makes it fun in the sun.                   S");
    System.out.println("S                                                    S");
    System.out.println("*SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
  }
  


  public static void printingDetails(String contractNumber, int hourlyRate, int extraMinutes, int total) {
    System.out.println("Contract Number: " + contractNumber);
    System.out.println("Hours Rented: " + hourlyRate); 
    System.out.println("Minutes Rented: " + extraMinutes);     
    System.out.println("Total Price: $"+ total );
  }
} 