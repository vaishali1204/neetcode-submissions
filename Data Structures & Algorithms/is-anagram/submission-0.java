class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;

        }
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)){
            return true;
        }
        return false;
    }
}
