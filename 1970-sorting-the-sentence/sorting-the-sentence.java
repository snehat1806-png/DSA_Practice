class Solution {
    public String sortSentence(String s) {
        String[] ans = new String[10];   // position 1-9 tak ho sakti hai
        String word = "";
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                int len = word.length();
                int index = word.charAt(len - 1) - '1';
                ans[index] = word.substring(0, len - 1);
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
     String result = "";
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != null) {
                if (result.length() > 0)
                    result += " ";
                result += ans[i];
            }
        }
        return result;
    }
}