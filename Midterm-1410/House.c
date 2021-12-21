// COMPLETE THIS PART
// ******************
// Include all the required header files
#include<stdio.h>
#include<string.h>
#include<stdbool.h>
#include "House.h"


void initHouse(House* house)
{
    char temp[50];
    char temp2[20];
    int tempPrice;
    float tempArea;
    getchar();
    printf("Enter the house address:");
    fgets(temp,20,stdin);
    printf("Enter the Owner Name:");
    fgets(temp2,20,stdin);
    printf("Enter the House Price:");
    scanf("%d",&tempPrice);
    printf("Enter the House area:");
    scanf("%f",&tempArea);
    getchar();
    house->price=tempPrice;
    house->area=tempArea;
    temp[strlen(temp)-1]='\0';
    temp2[strlen(temp2)-1]='\0';
    strcpy(house->address,temp);
    strcpy(house->owner,temp2);
}




// COMPLETE THIS PART
// ******************
// Define a function, MakeEmptyOneHouse(), to make a house empty, which
// receives a struct pointer to a house to make it empty, by setting the
// address and owner to "Not set yet", and set price and area to zero.
void MakeEmptyOneHouse(House* house)
{
    strcpy(house->address,"Not set yet");
    strcpy(house->owner,"Not set yet");
    house->area=0;
    house->price=0;
}







// COMPLETE THIS PART
// ******************
// Define a function, IsHouseEmpty(), to check if a house is empty, which
// receives a struct of a house and returns true if it is empty, otherwise false.
bool IsHouseEmpty(House house)
{
    if(strcmp(house.address,"Not set yet")==0&&strcmp(house.owner,"Not set yet")==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}



// COMPLETE THIS PART
// ******************
// Define a function, PrintOneHouse(), to print the information of a house, which
// receives a struct of a house and prints its information.

void PrintOneHouse(House house)
{
    printf("Address: %s,",house.address);
    printf("Owner: %s,",house.owner);
    printf("Area: %f,",house.area);
    printf("Price: %d\n",house.price);
}






// COMPLETE THIS PART
// ******************
// Define a function, MakeEmptyAllHouses(), to make all houses empty, which
// receives an array of struct of the house, and the array lenght, to make all
// the houses empty.
void MakeEmptyAllHouses(House house[],int size)
{
    for (size_t i = 0; i < size; i++)
    {
        MakeEmptyOneHouse(&house[i]);
    }
    
}






// COMPLETE THIS PART
// ******************
// Define a function, PrintHouses(), to print the information of all houses,
// which receives an array of struct of the house, the array length, and a
// boolean value. The function will print the information of all empty houses if
// the value of the bool parameter is true, and will print the information of all
// occupied houses if the value of the bool parameter is false, same as the
// sample execution outputs.
void PrintHouses(House house[],int size,bool empty)
{
    if(empty==false)
    {
        for (size_t i = 0; i < size; i++)
        {
            if (IsHouseEmpty(house[i])==false)
            {
                printf("%d: ",i+1);
                PrintOneHouse(house[i]);
            }
            
        }
        
    }
    else
    {
        for (size_t i = 0; i < size; i++)
        {
            if (IsHouseEmpty(house[i])==true)
            {
                printf("%d: Empty\n",i+1);
            }
            
        }

    }
}