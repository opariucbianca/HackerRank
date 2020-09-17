#include <bits/stdc++.h>

using namespace std;
int arr[100000],n,k,unfairness=100000;

int main()
{
    cin>>n>>k;
    for(int i=1;i<=n;i++)
        cin>>arr[i];
    sort(arr+1,arr+1+n);
    for(int i=1;i<=n-k+1;i++)
        if(arr[i+k-1]-arr[i]<unfairness)
        unfairness=arr[i+k-1]-arr[i];
    cout<<unfairness;
    return 0;
}
