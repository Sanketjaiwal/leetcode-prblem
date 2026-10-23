class Solution {
    public static boolean isvowel(char c){
        return "aeiou".indexOf(c)>=0;
    }
    public int maxVowels(String s, int k) {
        int max=0,count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))) count++;
        }
        max=Math.max(max,count);
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i-k))) count--;
            if(isvowel(s.charAt(i))) count++;
            max=Math.max(max,count);
        }
        return max;
    }
}