import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Random r1 = new Random();
        Scanner scanner = new Scanner(System.in);
        int num=r1.nextInt(101);
        int i=0;
        int user;
        boolean win=false;
        int maxattempts=10;
        while (i<maxattempts) {
            System.out.println("Enter  a number: ");
            user= scanner.nextInt();
            i++;
            if (user==num) {
                win=true;
                break;
            }
            else if (user > num){
                System.out.println("The guess is too high!");
            }
            else System.out.println("the guess is too low! ");
        }
        if (win) System.out.println("Congrats you nailed it after "+i+" attempts");
        else System.out.println("Sorry you failed!");
        scanner.close();


    }
}