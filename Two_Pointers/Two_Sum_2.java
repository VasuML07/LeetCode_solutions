/*since array is sorted.intialize 2 pointers left starting at index 0 and right stating at end of 
array.calculate sum of 2 elements and compare with target .if equal return index+1 for both pointers.
if less than target sum is small so move left pointer if sum is greater than targey sum is too
large  move the write pointer.*/

time complexity is o(n) where n is length of array
space complexity is o(1) since we use only 2 pointers only

int left = 0;
int right = numbers.length-1;
while(left<right){
  int sum = numbers[left]+numbers[right];
  if(sum == target){
    return new int[]{left+1;right+1};
  }else if(sum < target){
    left++;
  }else {
    right--;
 }
}
return new int[]{-1,-1};
    
