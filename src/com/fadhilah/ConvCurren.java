package com.fadhilah;

/*This is a class that contains all the method for converting. I write this class on different file, just because when
* class is written on different class, it's actually make a better vision to figure out how class-method-object is working.*/

public class ConvCurren {
    public static int DollarToRupiah(int amount){
        return amount * 14000;
    }

    //This is a method for converting rupiah to dollar, dollar to rupiah, yen to rupiah, and rupiah to yen
    public static int RupiahToDollar(int amount){
        return amount / 14000;
    }

    public static int YenToRupiah(int amount){
        return amount * 175;
    }

    public static int RupiahToYen(int amount){
        return amount / 175;
    }
}
