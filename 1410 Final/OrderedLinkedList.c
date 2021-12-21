// Ordered Doubly-LinkedList
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct listNode
{
    char data[15];
    struct listNode* nextPtr;
    struct listNode* prevPtr;
} ListNode;

// Two global pointers to keep the start and end of the list.
ListNode* startPtr = NULL;
ListNode* endPtr = NULL;

// Print the list (This function has already been developed)
void printList();

// Check if the list is empty (This function has already been developed)
int isEmpty();

// Selection menu (This function has already been developed)
void menu(void);

/*************
 * Develop this function at the bottom of this program
 * Set the node's data, using a string value.
 */
void setData(ListNode* node, char* value);

/*************
 * Develop this function at the bottom of this program
 * Insert a new node into the list in its correct location.
 */
void insert(ListNode* newPtr);

/*************
 * Develop this function at the bottom of this program
 * It recieves a string to delete the very first node equal to it, if found.
 * If found, it returns the string value of the deleted node, Otherwise, returns "" (empty string).
 */
char* delete (char* value);

/*************
 * Develop this function at the bottom of this program
 * Print the list in the reverse order (from the end of the list to the beginning of the list).
 */
void printListReverse();

// main function
int main(void)
{
    ListNode* newPtr = NULL;
    char item[15];

    // Creating the starting/ending node.
    startPtr = (ListNode*)malloc(sizeof(ListNode));
    setData(startPtr, "#");
    endPtr = startPtr;
    puts("An empty ordered Doubly-LinkedList created.");
    puts("********************************************");

    menu();
    printf("%s", "? ");
    unsigned int choice; // user's choice
    scanf("%u", &choice);
    fflush(stdin);

    while (choice != 5)
    {
        switch (choice)
        {
        case 1:
            /*************
 			 * Complete this part:
 			 * 1- Prompt the user to input a character.
			 * 2- Read the user's input.
 			 * 3- Insert the input character into the list.
 			 * 4- Print the linkedlist.
 			 */
            printf("%s", "Enter a name (Maximum 14 characters):\n");
            scanf("%s", item);
            newPtr = (ListNode*)malloc(sizeof(ListNode));
            setData(newPtr, item);
            insert(newPtr);
            printList();









            break;
        case 2:
            /*************
  			 * Complete this part:
  			 * 1- If the list is empty, print out a proper message and skip this case.
  			 *    Otherwise, prompt the user to input a string.
 			 * 2- Read the user's input (Assume that user inputs no more than 14 characters).
  			 * 3- Delete the node that has the input string from the list, 
             *    and Print the linkedlist. If not found, show a proper message.
  			 */
              if(isEmpty())
              {
                  printf("Sorry the List is Empty\n");
              }
              else{

                  char temp[15];
                  printf("Enter character to be deleted:\n");
                  scanf("%s",temp);
                  char* ret = delete(temp);
                  if(ret=="")
                  {
                      printf("%s not found\n",temp);
                      printList();
                  }
                  else
                  {
                      printf("%s deleted\n",temp);
                      printList();
                  }
                  



              }


















            break;
        case 3:
            /*************
   			 * Complete this part:
   			 * 1- If the list is empty, print out a proper message,
   			 *    Otherwise, print the linkedlist from the BEGINNING of the list.
   			 */
               if(isEmpty())
               {
                   printf("List is empty\n");
               }
               else
               {
                   printList();
               }




            break;
        case 4:
            /*************
			 * Complete this part:
			 * 1- If the list is empty, print out a proper message,
			 *    Otherwise, print the linkedlist from the END of the list.
			 */
            if(isEmpty())
            {
                printf("List is empty\n");
            }
            else
            {
                printListReverse();
            }




            break;
        default:
            puts("Invalid choice.\n");
            break;
        } // end switch

        menu();
        printf("%s", "? ");
        scanf("%u", &choice);
        fflush(stdin);
    }
    puts("End of run.");
}

// Print the list. (This function has already been developed.)
void printList()
{
    ListNode* currentPtr = startPtr->nextPtr;
    puts("The list is:");
    printf("%s", "NULL <--> ");
    // while not the end of the list
    while (currentPtr != NULL)
    {
        printf("%s <--> ", currentPtr->data);
        currentPtr = currentPtr->nextPtr;
    }
    puts("NULL\n");
}

// Return 1 if the list is empty, 0 otherwise. (This function has already been developed.)
int isEmpty()
{
    return startPtr->nextPtr == NULL;
}

// Display the menu options. (This function has already been developed.)
void menu(void)
{
    puts("Enter your choice:\n"
         "   1 to insert an element into the list.\n"
         "   2 to delete an element from the list.\n"
         "   3 to print the list from the beginning.\n"
         "   4 to print the list from the end.\n"
         "   5 to end.");
}

/*************
 * Develop function setData.
 */
void setData(ListNode* node, char* value)
{
    strcpy(node->data, value);
    node->nextPtr = NULL;
    node->prevPtr = NULL;
    
}


/*************
 * Develop function insert.
 */
void insert(ListNode* newPtr)
{
    if(startPtr->nextPtr == NULL)
    {
        startPtr->nextPtr = newPtr;
        newPtr->prevPtr = startPtr;
        endPtr = newPtr;
       
     }
     else
     {
        ListNode* currentPtr = startPtr->nextPtr;
        while(currentPtr != NULL)
        {
            if(strcmp(currentPtr->data, newPtr->data) > 0)
            {
                newPtr->nextPtr = currentPtr;
                newPtr->prevPtr = currentPtr->prevPtr;
                currentPtr->prevPtr->nextPtr = newPtr;
                currentPtr->prevPtr = newPtr;
                break;
            }
            currentPtr = currentPtr->nextPtr;
        }
        if(currentPtr == NULL)
        {
            endPtr->nextPtr = newPtr;
            newPtr->prevPtr = endPtr;
            endPtr = newPtr;
        }
     }

}


/*************
 * Develop function delete.
 
 */

char* delete (char* value)
{
    ListNode* currentPtr = startPtr->nextPtr;
    while(currentPtr != NULL)
    {
        if(strcmp(currentPtr->data, value) == 0)
        {
            if(currentPtr == endPtr)
            {
                endPtr = currentPtr->prevPtr;
                endPtr->nextPtr = NULL;
                free(currentPtr);
                return "ok";
                break;
            }
            else
            {
                currentPtr->prevPtr->nextPtr = currentPtr->nextPtr;
                currentPtr->nextPtr->prevPtr = currentPtr->prevPtr;
                free(currentPtr);
                return "ok";
                break;
            }
        }
        currentPtr = currentPtr->nextPtr;
    }
    return "";
}



/*************
 * Develop function printListReverse.
 */
void printListReverse()
{
    ListNode* currentPtr = endPtr;
    puts("The list in reverse order is:");
    printf("%s", "NULL <--> ");
    
    while (currentPtr->prevPtr != NULL)
    {
        printf("%s <--> ", currentPtr->data);
        currentPtr = currentPtr->prevPtr;
    }
    puts("NULL\n");
}


