#include<stdio.h>
#include<stdlib.h>


typedef struct node{

    int data;
    struct node* next;

}node;

node* head = NULL;
node* tail = NULL;

void createnode(node* newnode)
{
     newnode = (node*)malloc(sizeof(node));
    newnode->data = 9;
    newnode->next = NULL;
    

}
void addNode(node* input)
{
    if(head==NULL)
    {
        head=input;
        tail= input;
    }
    else{
        node* temp = head->next;
        head->next = input;
        input->next = temp;
    }

}
void printNodes()
{
    node* tempnode = NULL;
    tempnode = head;
    while (tempnode!=NULL)
    {
        printf("%d,",tempnode->data);
        tempnode = tempnode->next;
    }
    
    

}

int main()
{
    node* ob1 = NULL;
    createnode(ob1);
    addNode(ob1);

  printNodes(head);
}