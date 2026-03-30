we will be given a senternce and we should tell wherther it is a palindrome or not.so first we will strip
all the leading spaces then convert all chars to whitespaces then firsly we will check whether current char 
is digit or char if not char move the pointers.if okay then comapare the chars at both pointers and return
the boolean.

int left=0,right = s.length()-1;
while(left<right){
  if(!Character.isLetterOrDigit(s.charAt(left)){
    left++;
  }else if(!Character.isLetterOrDigit(s.charAt(right)){
    right--;
  }else{
    if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
      return false;
    }
    left++;
    right--;
  }
}
return true

Time complexity is o(n) n is length of string
Space complexity is o(1) using pointers.
