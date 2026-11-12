class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        String vowel="aeiouAEIOU";
        int i=0,j=ch.length-1;
        while(i<j){
            if(vowel.indexOf(ch[i])==-1)
            i++;
            else if(vowel.indexOf(ch[j])==-1)
            j--;
            else{
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}