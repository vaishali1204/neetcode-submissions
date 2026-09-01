class Solution {

    // Encode
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    // Decode
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of current string
            int len = Integer.parseInt(str.substring(i, j));

            // Move after '#'
            j++;

            // Extract the original string
            list.add(str.substring(j, j + len));

            // Move to next encoded string
            i = j + len;
        }

        return list;
    }
}