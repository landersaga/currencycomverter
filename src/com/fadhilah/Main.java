package com.fadhilah;

import com.fadhilah.ConvCurren;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialize all the variables needed
	    int option;
	    char next;
        int dollar, rupiah, yen;

        //Initialize new scanner object
        Scanner scn = new Scanner(System.in);

        //Initialize reference of ConvCurren class to access necessary method
        ConvCurren cnv = new ConvCurren();

        //Printing the menus
        System.out.println("1. USD To IDR");
        System.out.println("2. IDR To USD");
        System.out.println("3. JPY To IDR");
        System.out.println("4. IDR To JPY");
        System.out.print("Select Your Menu! ");
        option = scn.nextInt(); /*This line is for user input using scanner object,
        user's input will added to option variable as an option of the menu*/

        //Logics that operate user input to the desired menu
        if (option == 1){
            System.out.println("Insert Your Amount of Dollar!");
            dollar = scn.nextInt();
            System.out.println("Your Rupiah is " + cnv.DollarToRupiah(dollar));
        }

        if (option == 2){
            System.out.println("Insert Your Amount of Rupiah!");
            rupiah = scn.nextInt();
            System.out.println("Your Dollar is " + cnv.RupiahToDollar(rupiah));
        }

        if (option == 3){
            System.out.println("Insert Your Amount of Yen!");
            yen = scn.nextInt();
            System.out.println("Your Rupiah is " + cnv.YenToRupiah(yen));
        }

        if (option == 4){
            System.out.println("Insert Your Amount of Rupiah!");
            rupiah = scn.nextInt();
            System.out.println("Your Yen is " + cnv.RupiahToYen(rupiah));
        }

    }
}
