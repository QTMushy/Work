#include<stdio.h>
#include<stdlib.h>


typedef struct node{
	int data;
	struct node *next;
}node;

void createnode(node** newnode,int data){
	*newnode = (node*)malloc(sizeof(node));
	(*newnode)->data = data;
	(*newnode)->next = NULL;

}

void pushnode(node** head,node* newnode){
	newnode->next = *head;
	*head = newnode;
}

void printnodes(node** head){
	node* temp = (*head);
	while(temp!=NULL){
		printf("%d ",temp->data);
		temp = temp->next;
	}
}

void delduplicates(node** head)
{
	node* temp = (*head);
	while(temp!=NULL&&temp->next!=NULL)
	{
		node* temp2 = temp->next;
		node* prev = temp;
		while(temp2!=NULL)
		{
			if(temp->data == temp2->data)
			{
				node* del = temp2;
				prev->next = temp2->next;
				free(del);
				temp2 = prev->next;
			}
			else
			{
				prev = temp2;
				temp2 = temp2->next;
			}
		}
		temp = temp->next;
	}
}

int main(){
	node* head = NULL;
	node* ob[8];
	int temp;
	int i =0;
	

	FILE* fp = fopen("input.txt","r");

	while(fscanf(fp,"%d",&temp)!=EOF){
		createnode(&ob[i],temp);
		pushnode(&head,ob[i]);
		i++;
	}


	

	delduplicates(&head);

	printnodes(&head);
}