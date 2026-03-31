here we will be given a sorted array we should remove the duplicates and we should output no of 
duplicates found and the final array.

code:

if(nums.length==0){
  return 0;
}
int i=0;
for(int j=1;j<nums.length;j++){
  if(nums[j] != nums[i]){
    i++;
    nums[i]=nums[j];
  }
}
return i+1;

time complexity is o(n) because we traverse through array once.
space complexity is o(1) because we only intialize some variables like i and j
