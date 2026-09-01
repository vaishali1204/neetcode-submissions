class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean visited[] = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();

            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted1 = new String(ch);

            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j])
                    continue;

                char ch1[] = strs[j].toCharArray();
                Arrays.sort(ch1);
                String sorted2 = new String(ch1);

                if (sorted1.equals(sorted2)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}