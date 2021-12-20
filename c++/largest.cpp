#include<bits/stdc++.h>
using namespace std;
int largest(int arr[],int size,int ans=INT_MIN)
{
    if(size==0)
    {
        return ans;

    }
    else
    {
        if(arr[size-1]>ans)
        {
            ans = arr[size-1];
        }
        return largest(arr,size-1,ans);
    }
}
int main()
{
    int arr[]={1,2,4,5,6,3};
    int size = sizeof(arr)/sizeof(arr[0]);
    cout<<largest(arr,size);
}