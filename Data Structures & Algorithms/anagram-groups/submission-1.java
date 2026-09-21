/**class Solution {
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
}**/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}