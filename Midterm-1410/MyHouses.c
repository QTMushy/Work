// COMPLETE THIS PART
// ******************
// Include all the required header files
#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdbool.h>
#include"House.h"






// COMPLETE THIS PART
// ******************
/** Write prototype for the function ShowMenuOptions(), to show the menu, get
    and return the user’s selection as a single character. The menu options are
    O) Occupy a house
    E) Empty a house
    P) Print all occupied houses
    V) Print all empty houses
    Q) Quit the program
    No matter user enters lowercase or uppercase, the function must return the
    corresponding uppercase letter. Also, the uesr’s selection must be validated
    and only valid input must be accepted. Otherwise, it should ask the input again.
 */
char ShowMenuOption();



int main(void) {
    // COMPLETE THIS PART
    // ******************
   /** Declare variables, including a constant integer, NUM_HOUSES = 5, an array of House struct with the length NUM_HOUSES, and any other required variables.
    * 
   */
  const int NUM_HOUSES = 5;
  House house[NUM_HOUSES];
  char userinput ='-';
  int temp;

    
    
    
    
    
    
    // COMPLETE THIS PART
    // ******************
   // Make all the houses empty
   MakeEmptyAllHouses(house,NUM_HOUSES);

    
    // COMPLETE THIS PART
    // ******************
   // In a loop, every time get the user’s selection and performs the corresponding task.
   while(userinput != 'Q')
   {
       userinput = ShowMenuOption();
       
       switch(userinput)
       {
           case 'O':
            
            printf("Enter House Number (1-5)\n");
            scanf("%d",&temp);
            if (temp>=1&&temp<=5)
            {
                if(IsHouseEmpty(house[temp-1]))
                {initHouse(&house[temp-1]);
                printf("The House %d is occupied\n",temp);
                }
                else
                {
                    printf("House is occupied\n");
                }
            }
            else
            {
                printf("Number is out of range.\n");
                
            }
            break;
        case 'E':
            
            printf("Enter House Number (1-5)\n");
            scanf("%d",&temp);
            if (temp>=1&&temp<=5)
            {
                MakeEmptyOneHouse(&house[temp]);
                printf("House Empty\n");
                
            }
            else
            {
                printf("Invalid input\n");
                
            }
            break;
        case 'P':
            printf("List of non-empty houses\n--------------------------------\n");
            PrintHouses(house,NUM_HOUSES,false);
            break;

        case 'V':
            printf("List of empty houses\n--------------------------------\n");
            PrintHouses(house,NUM_HOUSES,true);
            break;

        case 'Q':
            printf("Goodbye!\n");
            break;


        default:
            printf("Invalid");
            break;
       }


   }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   return 0;
}

// COMPLETE THIS PART
// ******************
// Define (implement the body of) the function ShowMenuOptions()
char ShowMenuOption()
{
    char userinput;
    printf("Select one of the following items:\n");
    printf("    O) Occupy a house\n");
    printf("    E) Empty a house\n");
    printf("    P) Print all occupied houses\n");
    printf("    V) Print all empty houses\n");
    printf("    Q) Quit the program\n");
   // while ((getchar()) != '\n');
   userinput=getchar();
   if(userinput=='\n')
    scanf("%c",&userinput);
    userinput = toupper(userinput);
    return userinput;


}