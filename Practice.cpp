// #include <iostream>

// // Define needs_water() here:
// std::string needs_water(int days,bool is_succulent){
//   if(is_succulent ==false && days>3){
//     return "Time to water the plant.";
//   }
//   else if(is_succulent == true && days ==12){
//     return "Don't water the plant!";
//   }
//   else if(is_succulent == true && days>=13){
//     return "Go ahead and give the plant a little water.";
//   }
//   else{
//     return "Don't water the plant!";
//   }
// }


// int main() {
  
//   std::cout << needs_water(10, false) << "\n";
  
// }

bool is_palindrome(std::string text) {
  std::string reversed_text = "";
  
  // Reverse the text
  for (int i = text.size() - 1; i >= 0; i--) {
    reversed_text += text[i];
  }
  
  // Check if the reversed text is the same as the original
  if(text == reversed_text){return true;}
  else{return false;}
}




int main() {
  
  std::cout << is_palindrome("madam") << "\n";
  std::cout << is_palindrome("ada") << "\n";
  std::cout << is_palindrome("lovelace") << "\n";
  
}