#include<stdio.h>
#include<string.h>
#include<stdlib.h>


typedef struct node{
    int data;
    struct node* next;
    struct node* prev;
}node;


node** head2 = NULL;
node** tail2 = NULL;





void createnode(node** newnode,int data)
{
    *newnode = (node*)malloc(sizeof(node));
    (*newnode)->data = data;
    (*newnode)->next = NULL;
    (*newnode)->prev = NULL;
}

void addnode(node* newnode)
{
    if(head2==NULL)
    {
        head2 = &newnode;
        tail2 = &newnode;
    }
    else{

      (*head2)->prev = newnode;
      newnode->next = (*head2);
      head2 = &newnode;
    }
}
void addlast(node** tail,node** head,node* newnode)
{
    if(*tail==NULL)
    {
        *tail = newnode;
        *head = newnode;

    }
    else{

        (*tail)->next = newnode;
        newnode->prev = *tail;
        (*tail) = newnode;
    }
}
void addnodeafter(node* currnode,node* newnode,node** tail)
{
   newnode->prev = currnode;
   if(currnode->next == NULL)
   {
       currnode->next = newnode;
       (*tail)= newnode;
   }
   else
  { newnode->next = currnode->next;
   currnode->next->prev = newnode;
   currnode->next = newnode;}
}
void printnode()
{
    node* temp = (*head2);
    while(temp != NULL)
    {
        printf("%d,",temp->data);
        temp = temp->next;
    }
}

int main()
{
    node* head = NULL;
    node* tail = NULL;
    node* ob1 = NULL;
    node* ob2 = NULL;
    node* ob3 = NULL;
    node* ob4 = NULL;
    

    createnode(&ob1,5);
    createnode(&ob2,7);
    createnode(&ob3,8);
    createnode(&ob4,10);

    printf("hi");
    addnode(ob1);
    addnode(ob2);
    addnode(ob3);

    
   
    

    

    
    
    
    

    
    
    
    

    

    

    printnode();

   


    
}