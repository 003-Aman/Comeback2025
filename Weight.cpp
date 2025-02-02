#include <iostream>

int main() {
  // Add your code below 
  double Eweight;
  double Mweight;
  double g =9.8; 

  std::cout <<"Enter the weight of the item :";
  std::cin >> Eweight;

  Mweight = Eweight * g;

  std::cout<<"The weight in Mars would be "<<Mweight<<" Newtons\n";

}