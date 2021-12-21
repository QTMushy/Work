// Include all the required header files 
// Number of lines in the input text 
#include <stdio.h>
#include <string.h>
#include<ctype.h>
#define SIZE 4 
// Prototype of the function that will print out the array of char pointers (String), line by line 

void printText(char *lines[]); 

int main(void) 
{     
    // The text content is stored in an array of pointers to characters (String)     
    char *lines[SIZE] = {"Hi programmer. My name is c.",                          
    "This is a program to evaluate your capability programming in C.",                          
    "Please develop a C program to extract and show the frequency of the letters in a text.",
    "Then, try it on this text. It is a very easy job. Good luck!"};

    // Declaration and initialization of an array to store the letter frequency (Consider letters as no case-sensitive)     
    int frequency[26] = {0};     
    
    printText(lines);
    
    int len=0;
    for(int i=0; i<SIZE; i++)
    {
        len+=strlen(lines[i]);
    }

    char line[len]; 

    for(int i=0; i<SIZE; i++)
    {
        strcat(line,lines[i]);
    }

    char *word=strtok(line," ,.!");
    while( word != NULL ) {
        for(int i=0; i<strlen(word); i++)
        {
            frequency[toupper(word[i])-'A']++;

        }        
        word = strtok(NULL, lines);
    } 
    
    
    for(int i=0; i<26; i++)
    {
        printf("%c: %d\n",'A'+i,frequency[i]);
    }

} 
void printText(char *lines[]) 
{     
    for(int i=0; i<SIZE; i++)
    {
        for(int j=0; lines[i][j]!='\0'; j++)
        {
            printf("%c",lines[i][j]);
        }
        printf("\n");
    }
}
