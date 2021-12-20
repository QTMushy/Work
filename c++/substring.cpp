
#include<bits/stdc++.h>
using namespace std;
int main()
{
    string big;
    cin>>big;
    string small;
    cin>>small;
    
    int i=0;
    int j=0;
    while(i<big.length())
    {
        if(small[j]==big[i])
        {
            int k=i;
            j++;
            k++;
           while(j<small.length()&&small[j]==big[k])
           {
               j++;
               k++;


           }
           if (j==small.length()){
               cout<<"found";
               return 0;

           }
           else{
               j=0;
               

           }
            
        }
        i++;

    }
    cout<<"Not Found";
}




0,1,2,3,4,5

-1,0,1,2,3,4



