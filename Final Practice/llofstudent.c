#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct Student_struct
{
    char name[20];
}Student;


typedef struct Node_struct
{
    Student* data;
    struct Node_struct* next;
}Node;

Node* head = NULL;
Node* tail = NULL;

//Student Functions

Student* initStudent()
{
    Student* temp = (Student*)malloc(sizeof(Student));
    strcpy(temp->name,"Default");
    return temp;
}
void setName(Student* input,char* name)
{
    if(input==NULL)
    {
        return;
    }
    else
    {
        strcpy(input->name,name);
        
    }
}

///Node Functions

Node* CreateNode()
{
    Node* input = (Node*)malloc(sizeof(Node*));
    input->data = initStudent();
    input->next = NULL;
    return input;
}

void addNode(Node* input)
{
    if(head==NULL)
    {
        head=input;
        tail= input;
    }
    else{
        Node* temp = head->next;
        head->next = input;
        input->next = temp;
    }

}

void printData()
{
    Node* temp = head;
    while(temp != NULL)
    {
        printf("Heallo");
        printf("%s",temp->data->name);
        temp = temp->next;
    }
    
}

int main()
{
  Node* list[10];
  for(int i =0;i<10;i++)\
  {
      list[i] = NULL;
      list[i] = CreateNode();
      addNode(list[i])
  }
   
   

   


    printData();
    
}
