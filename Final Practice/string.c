#include<stdio.h>
#include<string.h>
#include<stdlib.h>


int main()
{
    char temp[] = "i am shubham malhotra shubham malhotra a i am";
    char* w[50];
    for(int i =0;i<50;i++)
    {
        w[i] = NULL;
    }


    int frequency[26]={0};
    int i =0;

    char* word = strtok(temp," ");
    while(word != NULL)
    {
        

        
            w[i] = (char*)malloc(100*sizeof(char));
            strcpy(w[i],word);
            i++;
        

        word = strtok(NULL," ");
    }

    i =0 ;
    

    while(w[i]!=NULL)
    {
        int j =i+1;
        int count = 0;
        while(w[j]!=NULL)
        {
            if(strcmp(w[j]," ")==0)
            {
                j++;
                continue;
            }
             if(strcmp(w[i],w[j])==0)
            {
                count++;
                strcpy(w[j]," ");
                j++;

            }
            else
            {
                j++;
            }
            
        }
        printf("%s->%d\n",w[i],count);
        i ++;
    }
    
}