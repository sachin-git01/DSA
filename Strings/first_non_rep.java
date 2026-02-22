class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int freq[]=new int[256];
        for(char c : s.toCharArray()){
            
            freq[c]++;
            
        }
             for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }

        return '$';
    }
}
