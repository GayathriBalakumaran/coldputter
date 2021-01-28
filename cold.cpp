#include<iostream>
using namespace std;
int main(){
  int temp,N,cnt=0;
  cin>>N;
  for(int i=1;i<=N;i++){
    cin>>temp;
    if(temp<0){
      cnt++;
    }
  }cout<<cnt<<endl;

}