//5,1,4,2,8
//1,5,4,2,8
//1,4,5,2,8
//1,4,2,5,8
//1,4,2,5,8
//1,2,4,5,8
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={5,1,4,2,8};
    int len = 5;
    for(int i = 0;i<len-1;i++)
{
   
    for(int j=0;j<(len-1)-i;j++)
    {
        cout<< arr[j];
        if(arr[j]>arr[j+1])
        {

            //swap(arr[j],arr[j+1]);
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            
            
        }
    }
    cout<<endl;
}
for(int i=0;i<len;i++)
{
    cout<<arr[i];
}
}


,5,1,4,2,8
5  1,4,2,8
1,5 4,2,8
1,4,5 2,8
1,2,4,5,8

i=1
j=0


for (int i=1;i<len;i++){
    j=i-1
    temp=arr[i]
    whilej>=0 &&temp<arr[j]){
        swap(arr[i],arr[j])
        j--
    }
}