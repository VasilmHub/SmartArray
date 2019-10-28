package smartarray;


import java.io.IOException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SmartArray smartArray = new SmartArray();
        System.out.println("Hello!");
        boolean temp = true;
        while (temp)
            System.out.printf("Choose what do you want to do?(enter wanted number)%n" +
                    "1.Add number or numbers to your Smart Array.%n" +
                    "2.Take the number ont the requested index.%n" +
                    "3.Replace two numbers.%n" +
                    "4.Print all numbers in the Smart Array. da ne za bravq da popitam kak gi iskam%n " +
                    "5.Check for number.%n" +
                    "6.Remove numbers.%n" +
                    "7.Stop the program.%n");
        int n = Integer.parseInt(scanner.nextLine());
        switch (n) {
            case 1:
                boolean pos=true;
                int num;
                while(pos) {
                    System.out.printf("How many numbers do you want to enter?");
                    num = Integer.parseInt(scanner.nextLine());
                    if (num < 0) {
                        System.out.println("Invalid input! Please, try again.");
                    }
                    if (num != 1) {
                        System.out.println("Now entered them in format:1 2 3 34 2...(with space between them):");
                        for (int i = 0; i <num ; i++) {
                            smartArray.add(scanner.nextInt());
                        }
                    }
                }

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Goodbye");
                temp = false;
                break;
            default:
                System.out.println("Invalid input! Please, try again.");
                break;
        }

    }
}
