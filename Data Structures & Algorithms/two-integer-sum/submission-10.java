class Solution {
    public int[] twoSum(int[] nums, int target)
    {

        HashMap<Integer, Integer> map = new HashMap();
        int[] k = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            int look_for_value = target - nums[i];

            if(map.containsKey(look_for_value))
            {
                k[1] = i;
                k[0] = map.get(look_for_value);
                return k;
            }

            map.put(nums[i], i);
        }
        return k;
    }
}
