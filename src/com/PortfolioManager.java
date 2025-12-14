package com;

import java.util.*;

public class PortfolioManager 
{
    private ArrayList<Portfolio> records = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addRecord() 
    {
        String name, email, phone, skillsInput, achievementsInput;

        System.out.print("Enter the Full Name: ");
        name = sc.nextLine().trim();

        while (name.isEmpty()) 
        {
            System.out.print("Name is empty.Enter again: ");
            name = sc.nextLine().trim();
        }

        System.out.print("Enter the Email: ");
        email = sc.nextLine().trim();

        while (!validateEmail(email)) 
        {
            System.out.print("Invalid email. Enter again: ");
            email = sc.nextLine().trim();
        }

        System.out.print("Enter the phone number: ");
        phone = sc.nextLine().trim();

        while (!validatePhone(phone)) 
        {
            System.out.print("Invalid phone. Enter again: ");
            phone = sc.nextLine().trim();
        }

        System.out.print("Enter the skills (comma separated): ");
        skillsInput = sc.nextLine();

        System.out.print("Enter the achievements (comma separated): ");
        achievementsInput = sc.nextLine();

        List<String> skills = parseList(skillsInput);
        List<String> achievements = parseList(achievementsInput);

        Portfolio p = new Portfolio(name, email, phone, skills, achievements);
        records.add(p);

        System.out.println("Portfolio added successfully!✅✅✅");
    }

    private boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    private boolean validatePhone(String phone) {
        return phone.matches("\\d+");
    }

    private List<String> parseList(String input) {
        List<String> list = new ArrayList<>();
        for (String item : input.split(",")) {
            list.add(item.trim());
        }
        return list;
    }

    public void listAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        for (Portfolio p : records) {
            displayRecord(p);
        }
    }

    private void displayRecord(Portfolio p) {
        System.out.println("\n=========================");
        System.out.println("     PERSONAL DETAILS");
        System.out.println("=========================");
        System.out.println("Name  : " + p.getName());
        System.out.println("Email : " + p.getEmail());
        System.out.println("Phone : " + p.getPhone());
        System.out.println("----------------------------------");
        System.out.println("Skills:");
        for (String s : p.getSkills()) {
            System.out.println("- " + s);
        }
        System.out.println("Achievements:");
        for (String a : p.getAchievements()) {
            System.out.println("- " + a);
        }
        System.out.println("----------------------------------");
    }
}

