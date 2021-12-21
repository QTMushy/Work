package com.company;

import java.util.ArrayList;

public class ChargeAccountValidation {
    public static boolean check(int num)
    {
     int[] Valid_list = {5658845,4520125,7895122,8777541,8451277,1302850,8080152,4562555,5552012,5050552,7825877,1250255,1005231,6545231,3852085,7576651,7881200,4581002};
     for (int i = 0;i<Valid_list.length;i++)
     {
         if(Valid_list[i]==num)
         {
             return true;
         }
     }
     return false;
    }
    public static void main(String[] args) {
        System.out.println(check(5658845));


    }

}
