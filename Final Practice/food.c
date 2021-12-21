#include <stdio.h>
#include <string.h>

int main(void) {
   const int MAX_LINES = 25;   // Maximum number of lines in the input text file
   const int MAX_STRING_LENGTH = 100;  // Maximum number of characters in each column of the input text file
   const int MAX_LINE_LENGTH = 200;  // Maximum number of characters in each line of the input text file 
   
   // Declare 4 string arrays to store the 4 columns from the input text file
   char column1[MAX_LINES][MAX_STRING_LENGTH];
   char column2[MAX_LINES][MAX_STRING_LENGTH];
   char column3[MAX_LINES][MAX_STRING_LENGTH];
   char column4[MAX_LINES][MAX_STRING_LENGTH];
   
   FILE* file = NULL;
   file = fopen("food.txt","r");
   int count = 0;
   while(!feof(file))
   {
       fscanf(file,"%[^\n]s%[^\n]s%[^\n]s%[^\n]s",column1[count],column2[count],column3[count],column4[count]);
       count++;
   }

   printf("%s",column2[0]);

   return 0;
}
