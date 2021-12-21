// Binary Tree
#include <stdio.h>
#include <stdlib.h>

typedef struct treeNode_struct {
	struct treeNode_struct* leftPtr;
	int data;
	struct treeNode_struct* rightPtr;
} TreeNode;

// A pointers for the root of the binary tree.
TreeNode* rootPtr = NULL;

typedef struct queueNode_struct {
	TreeNode* node;
	struct queueNode_struct* nextPtr;
} QueueNode;

// Two pointers for the head and tail of the queue
QueueNode* headPtr = NULL;
QueueNode* tailPtr = NULL;

// Input/output file pointer declarations
FILE *inPtr;
FILE *outPtr;

// Insert a new element to the binary tree. (This function has already been developed)
void insert(TreeNode** treePtr, int value);

// Enqueue a new element into the queue. (This function has already been developed)
void enqueue(TreeNode* node);

// Dequeue an element from the queue. (This function has already been developed)
TreeNode* dequeue();

// Check if the queue is empty. (This function has already been developed)
int isQueueEmpty();

/*************
 * Develop this function at the bottom of this program
 * In-Order traversal and print out of the binary tree into the output file. (Increasing order)
 */
void inOrder(TreeNode* treePtr);

/*************
 * Develop this function at the bottom of this program
 * Reverse-Order traversal and print out of the binary tree. (Decreasing order)
 */
void reverseOrder(TreeNode* treePtr);

/*************
 * Develop this function at the bottom of this program
 * Level-Order traversal and print out of the binary tree.
 * It first prints the root, then the nodes in the next levels.
 * In each level, from left to right.
 */
void levelOrder();

/*************
 * Develop this function at the bottom of this program
 * Print out the binary tree with 90-degree counterclockwise rotated. 
 * (See the sample output in the problem description.)
 */
void printTree(TreeNode* treePtr, int totalSpaces);

/*************
 * Develop this function at the bottom of this program
 * Search the binary tree for a value and return the result node, NULL otherwise.
 */
TreeNode* searchTree(TreeNode* treePtr, int value);

// main function
int main(void)
{

	/*************
	 * Complete this part:
	 * Open the file "input.txt" as the input file.
	 * If the operation is not successful, print out a 
     * proper message to the screen and terminate the program.
	 */

   	inPtr = fopen("input.txt", "r");
   	if (inPtr == NULL )
    {
        printf( "ERROR! Failed to open input file.\n" ) ;
		return -1;
    }



	/*************
	 * Complete this part:
	 * Open the file "output.txt" as the output file.
	 * If the operation is not successful, print out a 
     * proper message to the screen and terminate the program.
	 */
	outPtr = fopen("output.txt","w");
	if(outPtr == NULL)
    {
        printf( "ERROR! Failed to open output file.\n" ) ;
		return -1;
    }



	/*************
	 * Complete this part:
	 * 1- Print "The numbers being inserted into the binary tree are:" into the output file.
	 * 2- Using a loop:
	 * 	  a- Read every line from the input file. There is one integer number in each line.
	 *    b- Print out the element you read into the output file.
	 *    c- Insert the element into the binary tree.
	 * 3- Close the input file.
	 */

	fprintf(outPtr,"The numbers being inserted into the binary tree are:\n");
    int temp=-1;
   
    while(!feof(inPtr))
    {
		fscanf(inPtr,"%d",&temp);
        fprintf(outPtr,"%d ",temp);
		insert(&rootPtr,temp);
        
    }
	fprintf(outPtr,"\n");



	/*************
	 * Complete this part:
	 * 1- Print "In-Order traversal and print out of the binary tree is:" into the output file.
	 * 2- Call the function inOrder to print out the tree's elements, 
     *    in-order, into the output file. (Increasing order)
	 */

	fprintf(outPtr, "In-Order traversal and print out of the binary tree is: \n");
	inOrder(rootPtr);
	fprintf(outPtr, "\n");


	/*************
	 * Complete this part:
	 * 1- Print "The Binary Tree in reverse (decreasing) order is:" into the output file.
	 * 2- Call the function reverseOrder to print out the tree's elements in 
     *    reverse order, into the output file. (Decreasing order)
	 */

	fprintf(outPtr, "The Binary Tree in reverse (decreasing) order is:\n");
	reverseOrder(rootPtr);
	fprintf(outPtr, "\n");


	/*************
	 * Complete this part:
	 * 1- Print "Level-Order traversal of the binary tree is:" into the output file.
	 * 2- Call the function levelOrder to print out the tree's elements in
     *    level order, into the output file.
	 */
	fprintf(outPtr, "Level-Order traversal of the binary tree is:\n");
	levelOrder(rootPtr);
	fprintf(outPtr, "\n");



	/*************
	 * Complete this part:
	 * 1- Print "Printing the binary tree with 90-degree counterclockwise rotated:" into the output file.
	 * 2- Call th function printTree to print out the tree 
     *    with 90-degree counterclockwise rotated, into the output file.
	 */
	fprintf(outPtr, "Printing the binary tree with 90-degree counterclockwise rotated:\n");
	fprintf(outPtr, "\n");
	printTree(rootPtr,0);
	fprintf(outPtr, "\n");


	/*************
	 * Complete this part:
	 * 1- Print "Searching the binary tree:" into the output file.
	 * 2- Call the function searchTree three times to search the binary tree 
     *    for three values, 6, 25, and 18, separately, 
     *    and print out the results into the output file.
	 */

	fprintf(outPtr,"Searching the binary tree:\n");
	if(searchTree(rootPtr,6)!=NULL) fprintf(outPtr,"6 found\n");
	else
		fprintf(outPtr,"6 not found\n");
	if(searchTree(rootPtr,25) != NULL)fprintf(outPtr,"25 found\n");
		else
		fprintf(outPtr,"25 not found\n");
	if(searchTree(rootPtr,18) != NULL)fprintf(outPtr, "18 found\n");
		else
		fprintf(outPtr,"18 not found\n");

	/*************
	 * Complete this part:
	 * Close the output file.
	 */
	fclose(inPtr);
	fclose(outPtr);

}

// Insert a node into the binary tree. (This function has already been developed.)
void insert(TreeNode** treePtr, int value) {
	// If the tree is empty
	if (*treePtr == NULL) {
		*treePtr = (TreeNode*) malloc(sizeof(TreeNode));
		// If memory allocation was successful
		if (*treePtr != NULL) {
			(*treePtr)->data = value;
			(*treePtr)->leftPtr = NULL;
			(*treePtr)->rightPtr = NULL;
		} else
			printf("%d No more memory is available.\n", value);
	} else { // The tree is not empty
		// The new data is less than the data in the current node
		if (value < (*treePtr)->data)
			insert(&(*treePtr)->leftPtr, value);
		// The new data is greater than the data in the current node
		else if (value > (*treePtr)->data)
			insert(&(*treePtr)->rightPtr, value);
		else  // Duplication will be ignored
			fprintf(outPtr, "%s", "duplicated ");
	}
}

// Insert a node at the queue tail. (This function has already been developed.)
void enqueue(TreeNode* node) {
	QueueNode* newPtr = (QueueNode*) malloc(sizeof(QueueNode));
	if (newPtr != NULL) { // is space available
		newPtr->node = node;
		newPtr->nextPtr = NULL;
		// if queue is empty, insert the node at head
		if (isQueueEmpty(headPtr))
			headPtr = newPtr;
		else
			tailPtr->nextPtr = newPtr;
		tailPtr = newPtr;
	} else
		printf("Not inserted. No memory available.\n");
}

// Remove a node from the queue head. (This function has already been developed.)
TreeNode* dequeue() {
	TreeNode* value = headPtr->node;
	QueueNode* tempPtr = headPtr;
	headPtr = headPtr->nextPtr;
	// if queue is empty
	if (headPtr == NULL)
		tailPtr = NULL;
	free(tempPtr);
	return value;
}

// Return 1 if the queue is empty, 0 otherwise. (This function has already been developed.)
int isQueueEmpty(QueueNode* headPtr) {
	return headPtr == NULL;
}

/*************
 * Develop the function inOrder.
 */
void inOrder(TreeNode* treePtr)
{
	if(treePtr == NULL)
		return;
	inOrder(treePtr->leftPtr);
	fprintf(outPtr,"%d ", treePtr->data);
	inOrder(treePtr->rightPtr);
}

/*************
 * Develop the function reverseOrder.
 */
void reverseOrder(TreeNode* treePtr)
{
	if(treePtr == NULL)
		return;
	reverseOrder(treePtr->rightPtr);
	fprintf(outPtr,"%d ", treePtr->data);
	reverseOrder(treePtr->leftPtr);
}

/*************
 * Develop the function levelOrder.
 */
void levelOrder(TreeNode* treePtr)
{
	enqueue(treePtr);
    while (!isQueueEmpty(headPtr))
    {
        fprintf(outPtr,"%d ",headPtr->node->data);
        if(headPtr->node->leftPtr!=NULL)
            enqueue(headPtr->node->leftPtr);
        if(headPtr->node->rightPtr!=NULL)
            enqueue(headPtr->node->rightPtr);
        dequeue();
    }
}

/*************
 * Develop the function printTree.
 */
void printTree(TreeNode* treePtr, int totalSpaces)
{
	if(treePtr == NULL)
		return;
	printTree(treePtr->rightPtr, totalSpaces+5);
	for(int i=0; i<totalSpaces; i++)	fprintf(outPtr," ");
	fprintf(outPtr,"%d\n",treePtr->data);
	printTree(treePtr->leftPtr,totalSpaces+5);
}


/*************
 * Develop the function searchTree.
 */
TreeNode* searchTree(TreeNode* treePtr, int value)
{
	if(treePtr==NULL)
		return NULL;
	
	if(treePtr->data==value)	return treePtr; 

	if(treePtr->data>value)	return searchTree(treePtr->leftPtr,value);

	return searchTree(treePtr->rightPtr,value);

}
