#include <stdlib.h>
#include <stdio.h>
#include <string.h>

const int MAX_NAME_SIZE = 50; 


// TODO: Write function to create and output all permutations of the list of names.
void AllPermutations(char **permList, int permSize, char **nameList, int nameSize) {
    if(nameSize == 0)
    {
        for(int i=0;i<permSize;i++)
        {
            printf("%s",(permList)[i]);
        }
        puts("");
    }

    for(int i = nameSize-1 ; i>=0;i--)
    {
        strcpy((permList)[permSize],(nameList)[i]);
        AllPermutations(permList,permSize+1,nameList,nameSize--);
        
    }
}



int main(void) {
   int size;
   int i = 0;
   char name[MAX_NAME_SIZE];
   scanf("%d", &size);
   char *nameList[size];
   char *permList[size];

   for(i = 0; i < size; ++i) {
      nameList[i] = (char *)malloc(MAX_NAME_SIZE);
      scanf("%s", name);
      strcpy(nameList[i], name);
   }

   for(int j=0;j<size;i++)
   {
        permList[j] = (char *)malloc(MAX_NAME_SIZE);

   }

   AllPermutations(permList, 0, nameList, size);
   
   return 0;
}



