#include<bits/stdc++.h>
using namespace std;
int * merge_sort(int arr1[],int size1)
{
    if(size1==1)
}







































// vector<int> merge_sort(vector<int> arr,int size,int start)
// {
//     if(size==1)
//     {
//         return arr;
//     }

//     vector<int> larr[size/2];
//     vector<int> rarr[int(ceil(size/2))];
//     int i=0;
//     for(i;i<size/2;i++)
//     {
//         larr[i]=arr[i];
//     }
//     for(int j=0;j<ceil(size/2);j++)
//     {
//       rarr.insert = 
//     }
//    vector<int> l=merge_sort(larr,size/2,start/2);
//    vector<int> r=merge_sort(rarr,ceil(size/2),start/2);
    
//     return (merge(l,r))

// // 2 10 11       0 1 50 19
// // 2 10   11    0 1     50 19  
// //2  10     11   0   1    50    19 
// // 2 10 11         0 1  19 50

// // 0 1 2 10 11 19 50
// }
// vector<int> merge(vector<int> arr1,vector<int> arr2,int size1,int size2)
// {
//     cout<<"Merge sort";
//     vector<int> ans(size1+size2-1);
//     int i=0;
//     int j=0;
//     int k=0;
//     while(i<size1&&j<size2)
//     {
//         cout<<i<<j<<k<<size1<<size2<<endl;
        
//         if(arr1[i]<arr2[j])
//         {
//             ans[k]=arr1[i];
//             i++;
//         }
//         else
//         {
//             ans[k]=arr2[j];
//             j++;
//         }
//         k++;
//     }
//     if(i<size1)
//     {
//         while(i<size1)
//         {
//             ans[k]=arr1[i];
//             k++;
//             i++;

//         }
//     }
//     if(j<size2){
//         for(j;j<size2;j++)
//         {
//             ans[k]=arr2[j];
//             k++;
//         }
//     }
    
//     return ans;

    
// }


// //5,1,10    2,6,8

// //5,10,1      8,6,2
// //5   10,1     8   6,2
// //5  10  1       



// //5    1,10    8   2,6
// //1,5,10     2,6,8
// //1,2,5,6,8,10
// int main()
// {
//     int arr1[]={1,2,4,7};
//     int size = 4;
//     int arr2[] = {4,5,8,9};
//     int size2 = 4;
//     vector<int> ans=merge(arr1,arr2,size2,size);
//     cout<<"back"<<endl;
//     for(int i=0;i<=ans.size();i++)
//     {
//         cout<<ans[i];
//         cout<<endl;
//     }

// }