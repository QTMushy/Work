#include<stdio.h>
#include<string.h>
#include<stdlib.h>


int main()
{
    char* name[10];
    for(int i=0;i<10;i++)
    {
        name[i] = (char*) malloc (sizeof(char*));

        strcpy(name[i],"shubham");
    }
    strcpy(name[1],"yash");

    char** ptr = NULL;
     ptr = name;

    printf("%s",*(ptr+1));
}