we need to find the triplets means numbers in array whose sum is 0 and also 3 numbers hsould not be equal
sp first sort the array for better execeution .next fix a no in array and the no should be upto n-2
beacuse we need to have place for remaining 2 numbers and also duplication.next do 2-pointer approach
if i is 1st no left pointer is i+1 and right is n-1 and do 2 sum approach.

Code:

List<List<Integer>> res = new ArrayList<>();
Arrays.sort(nums);
int n = nums.length;
for(int i=0;i<n-2;i++){
  if(nums[i]>0){
    break;
  }
  if(i>0 && nums[i]==nums[i-1]){
    continue;
  }
  int left=i+1;
  int right=n-1;
  while(left<right){
    int sum = nums[i]+nums[left]+nums[right];
    if(sum==0){
      res.add(Arrays.asList(nums[i],nums[j],nums[k]));
      left++;
      right--;
      while(left < right && nums[left]==nums[left-1]){
        left++;
      }
      while(left<right && nums[right]==nums[right+1]){
        right--;
      }
    }else if(sum<0){
      left++;
    }else{
      right--;
    }
  }
}

time complexity is o(n^2) and space complexity is o(n^2)

    
