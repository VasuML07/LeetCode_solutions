/*first we will sort array to use 2-pointer efficiently.we will loop through array from index
i to n-2 to fix first set of possible triplets.set 2 ointers left=i+1 and right =n-1'.calculate
sum and update closest sum based on absolute difference b/w currentsum and closest sum.if
exactly found return it immeadiately.if less update left if high update right*/

time complexity is o(n^2)

Arrays.sort(nums);
int n  = nums.length;
int closestsum = nums[o]+nums[1]+nums[2];
for(int i=0;i<n-2;i++){
  int left = i+1;
  int right = n-1;
  while(left<right){
    int currentsum = nums[i]+nums[left]+nums[right];
    if(currentsum == target){
      return currentsum;
    }
    if(Math.abs(currentsum-target) < Math.abs(closestsum-target)){
      closestsum = currentsum;
    }
    if(currentsum < target){
      left++;
    }else{
      right--;
    }
  }
}
return closestsum;
