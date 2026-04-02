here we will be given a integer array for example [0,1,0,3,12] we need to move all the zereos to last
and the order of non zero elements should be the same.

so let me define 2 variables i and insertPos for tracking and where to insert the non-zero elements

lets intialize i and insertpos at 1st element with index 0 use a for loop and iterate through each 
element if 0 found skip just increment the i if non-zero element found then swap that number with number
at index insertpos and also increment pos

if(nums==null||nums.length==0){
  return;
}
int insertpos=0;
for(int i=0;i<nums.length;i++){
  if(nums[i] != 0){
    if(i != insertpos){
      nums[insertpos] = nums[i];
      nums[i]=0;
    }
    insertpos++;

time complexity of code is o(n) because we iterated through a array of size n at once
space complexity of code is o(1) because we only used extra variable insertpos for helping in swapping.
