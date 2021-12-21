// COMPLETE THIS PART
// ******************
// Define a header file guard
#ifndef HOUSE_H
#define HOUSE_H


// COMPLETE THIS PART
// ******************
// Define a c struct, House, to maintain the information of a house, including
// address (fifty characters), owner (20 characters), price (int), and area (double).
typedef struct House_struct
{
    char address[50];
    char owner[20];
    int price;
    double area;
}House;

void initHouse(House* house);







// Write the function prototypes of five functions as follows

// COMPLETE THIS PART
// ******************
// MakeEmptyOneHouse(), which receives a struct pointer to a house

void MakeEmptyOneHouse(House* house);


// COMPLETE THIS PART
// ******************
// IsHouseEmpty(), which receives a struct of a house and
// returns a boolean value.
bool IsHouseEmpty(House house);

// COMPLETE THIS PART
// ******************
// PrintOneHouse(), which receives a struct of a house
void PrintOneHouse(House house);

// COMPLETE THIS PART
// ******************
// MakeEmptyAllHouses(), which receives an array of struct of the house
// and the array lenght.
void MakeEmptyAllHouses(House house[],int size);

// COMPLETE THIS PART
// ******************
// PrintHouses(), which receives an array of struct of the house, the
// array length, and a boolean value.
void PrintHouses(House house[],int size,bool empty);

// COMPLETE THIS PART
// ******************
// End the header file guard
#endif
