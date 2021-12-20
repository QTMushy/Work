#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char name[100];
    cin>>name;
    int length = strlen(name);
    //cout<<length;
    int distinct=0;

    for(int i = 0; i < (length);i++)
    {
        int flag = 0;
        for(int j = i+1;j<length;j++)
        {
            if(name[i]==name[j])
            {
                flag++;
                break;
            }

        }
        if (flag==0)
        {
            distinct++;
        }
        

    }
    //cout<<"distinct elements\t"<<distinct<<endl;
    
    if(distinct%2!=0)
    {
        cout<<"IGNORE HIM!";

    }
    else
    {
        cout<<"CHAT WITH HER!";
    }

}