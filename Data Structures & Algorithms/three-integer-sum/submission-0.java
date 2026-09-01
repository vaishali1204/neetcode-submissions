class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list1 = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate values of i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                // Skip duplicate values of j
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < nums.length; k++) {

                    // Skip duplicate values of k
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> list = new ArrayList<>();

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        list1.add(list);
                    }
                }
            }
        }

        return list1;
    }
}