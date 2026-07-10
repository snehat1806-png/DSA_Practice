class Solution {
    public String freqAlphabets(String s) {
       StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
              int num=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
              ans.append((char) ('a'+num-1));//same same converted in char hheree so used char
              i-=2;
            }else{
              int num=s.charAt(i)-'0';//convert ascii digit into actual numeric value
                ans.append((char)('a'+num-1));//it is used here because the char convert the digit from the char 
            }
        }
        return ans.reverse().toString();//reverse used coz when i append it is it stored in reversed order that's why here i did reverse 
    }
}
