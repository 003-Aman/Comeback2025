#include<iostream>
int main(){
  std::vector<int> numbers ={2,4,3,6,1,9};
  int totalOdd=0;
  int totalEven=;

  for(int i=0;i<numbers.size();i++){
    if(numbers[i]%2==0){
      totalEven += numbers[i];
    }
    else{totalOdd +=numbers[i];}
  }
}