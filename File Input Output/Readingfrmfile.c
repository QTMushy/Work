#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct student
{
    char name[50];
    int age;

}student;
typedef struct Node
{
    student* data;
    struct Node* next;
}Node;

Node* createnode(student* input)
{
    Node* newnode = NULL;
    newnode = (Node*)malloc(sizeof(Node));
    newnode->data = (student*)malloc(sizeof(student));
    newnode->data->age=input->age;
    strcpy(newnode->data->name,input->name);
    newnode->next=NULL;
    return newnode;

}
void printnode(Node* input)
{
    printf("%s\n",input->data->name);
}

int main()
{
    

    FILE* read = NULL;
    struct student* list = NULL;
    read = fopen("student.txt","r");
    int size;
    fscanf(read,"%d",&size);
    printf("%d",size);
    list = (struct student*)malloc(size*sizeof(struct student));
    for(int i=0;i<size;i++)
    {
        fscanf(read,"%s",list[i].name);
        
        fscanf(read,"%d",&(list+i)->age);
    }

    

    for(int i=0;i<size;i++)
    {
        printf("%s",(list+i)->name);
    }

    FILE* write = NULL;
    write = fopen("output.txt","w");
    for(int i =0 ;i<size;i++)
    {
        fprintf(write,"%s\n",list[i].name);
        fprintf(write,"%d\n",list[i].age);
    }

   for(int i =0 ;i<size;i++)
    {
       printnode(createnode(&list[i]));
    }
    free(list);
    fclose(read);
}