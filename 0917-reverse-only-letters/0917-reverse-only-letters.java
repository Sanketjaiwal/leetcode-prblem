class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(!Character.isLetter(ch[i]))
            i++;
            else if(!Character.isLetter(ch[j]))
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