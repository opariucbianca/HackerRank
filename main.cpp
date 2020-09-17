#include <bits/stdc++.h>

using namespace std;


int criteriu(int a,int b)
{
    if(a<b) return 1;
    else
       return 0;
}

long int n,i,ultimul,k,s=0,x=0,S[1000];
int main()
{
    int a,b;
    cin>>n>>k;
    for(i=1;i<=n;i++)
    {
        cin>>a>>b;
        s+=a;
        if(b==1)
            S[++x]=a;
    }
    sort(S+1,S+x+1,criteriu);
    x-=k;
   for(i=1;i<=x;i++)
   {
      s-=2*S[i];
   }
   cout<<s<<endl;

    return 0;
}
