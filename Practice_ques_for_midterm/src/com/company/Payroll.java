package com.company;

import java.util.Scanner;

public class Payroll {
   int[] employeeId = {658845,4520125,7895122,8777541};
   int[] hours = new int[7];
   double[] payRate = new double[7];
   double[] wages = new double[7];
   Scanner keyboard = new Scanner(System.in);

   public Payroll() {
      this.setEmployeeId();
   }

   public void setEmployeeId()
  {
     for (int i=0;i<employeeId.length;i++)
     {
        System.out.println("Enter the following details for the EmployeeID:"+employeeId[i]);
        System.out.println("hours:");
        hours[i]= keyboard.nextInt();
        System.out.println("Pay Rate:");
        payRate[i]=keyboard.nextDouble();
        System.out.println("Wages:");
        wages[i]= keyboard.nextDouble();
        keyboard.nextLine();

     }
  }
   public void get_Data(int EmployeeId)
   {
      boolean flag = true;
      for (int i=0;i<this.employeeId.length;i++)
      {
         if (EmployeeId==this.employeeId[i])
         {
            System.out.println("hours:"+this.hours[i]);
            System.out.println("Pay Rate:"+this.payRate[i]);
            System.out.println("Wages:"+this.wages[i]);
            flag = false;
            break;
         }
      }
      if(flag)
      {
         System.out.println("Element Not found");
      }
   }









   public boolean checklist(int id)
   {
      for(int i = 0; i<employeeId.length;i++)
      {
         if (id==employeeId[i])
         {
            return true;
         }
      }
      return false;
   }
   public int getIndex(int id)
   {
      for(int i = 0; i<employeeId.length;i++)
      {
         if (id==employeeId[i])
         {
            return i;
         }
      }
      return 0;
   }

   public int[] getEmployeeId() {
      return employeeId;
   }

   public int[] getHours() {
      return hours;
   }

   public double[] getPayRate() {
      return payRate;
   }

   public double[] getWages() {
      return wages;
   }
}
