#include <stdio.h>

#include<stdlib.h>

typedef struct student_struct{
    char name[25];
    char lname[25];
    int m1;
    int m2;
    int final;
    
}student;

int main(void) {

   
   student* list[30];
   for(int i=0;i<30;i++)
   {
       list[i]=NULL;
   }
   FILE* file;
   char fname[20];
   //scanf("%s",fname);
   file = fopen("StudentInfo.tsv","r");
   int count = 0;
   while(!feof(file))
   {
       list[count] = (student*)malloc(sizeof(student));

       fscanf(file,"%s\t%s\t%d\t%d\t%d",list[count]->name,list[count]->lname,&list[count]->m1,&list[count]->m2,&list[count]->final);
       count++;
   }
   for(int i=0;i<count;i++)
   {
       printf("%s\n",list[i]->name);
   }

}
