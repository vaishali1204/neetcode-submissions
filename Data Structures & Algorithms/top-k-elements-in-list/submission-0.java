class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Step 2: Store map entries in a list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Step 3: Sort the list based on frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Step 4: Store first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}