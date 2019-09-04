package com.company;
import java.util.*;

public class Main {
    //Prints N digits of Pi, with n being provided by the user.
    public static void main(String[] args) {

        double pi = Math.PI;
        int n;

        System.out.print("Hello, enter how many digits for pi, note that decimals will count as a digit! : ");

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        scan.close();

        System.out.println("");
        System.out.println((""+pi).substring(0,n));

    }
}
