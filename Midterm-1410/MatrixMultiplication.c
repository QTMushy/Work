#include <stdio.h>

// The prototype of the function to compute matrix multiplication of matrices a and b, and put it into matrix c
// m: Number of rows in matrix a
// n: Number of columns in matrix a (and number of rows in matrix b)
// p: Number of columns in matrix b
void matrixMult(int m, int n, int p, int a[m][n], int b[n][p], int c[m][p]);

int main(void) {

	// Declaration of the variables to keep the matrices' dimensions
	// m: Number of rows in matrix a
	// n: Number of columns in matrix a (and number of rows in matrix b)
	// p: Number of columns in matrix b
	int m, n, p;

	// Get the number of rows and columns of matrix a, and number of columns of matrix b
	printf("Please enter the number of rows in matrix a:");
	scanf("%d", &m);
	printf("Please enter the number of columns in matrix a:");
	scanf("%d", &n);
	printf("Please enter the number of columns in matrix b:");
	scanf("%d", &p);

	// COMPLETE THIS PART
	// ******************
	// Declaring three matrices, a, b, and c based on the rows and columns given above
	int a[m][n];
	int b[n][p];
	int c[m][p];



	// ^^^^^^^^^^^^^^^^^^

	// COMPLETE THIS PART
	// ******************
	// Populate matrix a by user entries

	printf("Please Enter a matrix\n");

	for(int i=0;i<m;i++)
	{
		printf("Please Enter data for row %d of a ",i);
		for(int j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}









	// ^^^^^^^^^^^^^^^^^^

	// COMPLETE THIS PART
	// ******************
	// Populate matrix b by user entries
	printf("Please Enter b matrix\n");

	for(int i=0;i<n;i++)
	{
		printf("Please Enter data for row %d of b ",i);
		for(int j=0;j<p;j++)
		{
			scanf("%d",&b[i][j]);
		}
	}









	// ^^^^^^^^^^^^^^^^^^


	// COMPLETE THIS PART
	// ******************
	// Call function matrixMult to compute multiplication of a and b into c

	matrixMult(m,n,p,a,b,c);


	// ^^^^^^^^^^^^^^^^^^

	// COMPLETE THIS PART
	// ******************
	// Print out matrix c
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<p;j++)
		{
			printf("%d  ",c[i][j]);
		}
		printf("\n");
	}









	// ^^^^^^^^^^^^^^^^^^

}

void matrixMult(int m, int n, int p, int a[m][n], int b[n][p], int c[m][p]) {


	// COMPLETE THIS PART
	// ******************
	// Compute the multiplication of matrix a and matrix b and store the result into matrix c
	// You can use a nested for loop, including three for loops.

	int i,j,flag;
	for(i=0;i<m;i++)
	{
		for(j=0;j<p;j++)
		{
			c[i][j]=0;
			for(flag=0;flag<n;flag++)
			{
				c[i][j]+=(a[i][flag]*b[flag][j]);
			}
		}
	}














	// ^^^^^^^^^^^^^^^^^^

}
