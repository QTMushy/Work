#include<stdio.h>
#include<string.h>

int main()
{
    
    FILE* fptr = fopen("tabfile.txt","r");
    int num;
    char line[100];
    char word[100];

    while(!feof(fptr))
    {
        fgets(line,100,fptr);
        
        
        

        printf("%d",strlen(line));

        
    }

    fclose(fptr);
    
}
[1,2,3]
[],[1,2,3]
[1],