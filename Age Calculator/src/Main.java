//age calculator using date of birth

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth in format: dd mm yyyy:::: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.print("Enter today's date: ");
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();
        int age = year1 - year;
        if (month1 < month) {
            age--;
        } else if (month1 == month) {
            if (day1 < day) {
                age--;
            }
        }
        System.out.println("Your age is: " + age);
    }
}