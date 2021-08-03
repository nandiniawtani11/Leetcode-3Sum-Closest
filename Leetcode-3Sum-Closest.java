class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minsum=100000;
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(target-sum);
                if(diff<minsum)
                {
                    sum1=sum;
                    minsum=diff;
                }
                
                if(sum>target)
                {
                    right--;
                }
                else if(sum<target)
                {
                    left++;
                }
                else
                    return target;
            }
        }
        return sum1;
    }
}
