package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> valid_list = new ArrayList<>();
        valid_list.add("12334");
        valid_list.add("123334");
        valid_list.add("12334");
        valid_list.add("12334");
        valid_list.add("1234");
        Scanner keyboard = new Scanner(System.in);
        String n = keyboard.nextLine();
        for(int i =0;i<valid_list.size();i++)
        {
            if(valid_list.get(i).equals(n))
            {
                System.out.println("true");
                break;
            }
        }
    }
}
