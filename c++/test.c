#include <stdio.h>

typedef struct PenniesToDollars_struct {
 int dollars;
} PenniesToDollars;


PenniesToDollars ComputeDollars(int pennies) {
 PenniesToDollars cal;


 cal.dollars = pennies / 100; 


 return cal;
}


int main(void) {
 int somePennies;
 PenniesToDollars dollarValue;
 
 printf("Enter penny value:");
 scanf("%d", &somePennies);
 dollarValue = ComputeDollars(somePennies);
 printf("You have %d pennies or %d dollars", somePennies, dollarValue.dollars);
 
 return 0;
}