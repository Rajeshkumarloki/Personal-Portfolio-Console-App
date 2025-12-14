package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        PortfolioManager manager = new PortfolioManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==============================");
            System.out.println("   PORTFOLIO MANAGEMENT APP");
            System.out.println("==============================");
            System.out.println("1. Add Portfolio");
            System.out.println("2. View All Portfolios");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            switch (choice) {
                case 1:
                    manager.addRecord();
                    break;
                case 2:
                    manager.listAllRecords();
                    break;
                case 3:
                    System.out.println("Exiting PORTFOLIO MANAGEMENT APPlication...\nThank You!");
                    return;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}

