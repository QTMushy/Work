#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main()
{
    FILE* fp;

    fp = fopen("lmao.txt","r");

    char line[50];
    char word[10];
    int i=0;

    while(!feof(fp))
    {
        //printf("hi");
        fgets(line,50,fp);
        //printf("%s",line);
        
        // for(int j =0;j<strlen(line);j++)
        // {
        //     // if(line[j]=='\\t'|| line[j]=='\0'|| line[j]=='\n')
        //     // {
        //     //    // printf("%c",line[j]);
        //     //     word[i]='\0';
        //     //     //printf("%s\n",word);
        //     //     i=0;
        //     // }
        //     // else

        //     // {
        //     //     printf("%c",line[j]);
        //     //     word[i]=line[j];
        //     //     i++;
        //     // }

            
        // }
        char del[]="\t";
        char* token = strtok(line,del);
        while(token!=NULL)
        {
            printf("%s\n",token);
            token = strtok(NULL,del);
        }
    }
}