class Solution {
    public static boolean isprime(int num){
        if(num<=1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false; 
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        if(num>=10){
            String s=Integer.toString(num);
            char[] ch=s.toCharArray();
            int i=0,j=ch.length-1;
            while(i<j){
                if(ch[i]!=ch[j]){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
    public int primePalindrome(int n) {
        int result;
        while(true){
            if (100_000 < n && n < 1_000_000) {
                n = 1_000_000; 
            }
            if (10_000_000 < n && n < 100_000_000) {
                n = 100_000_000; 
            }

            if(isprime(n)){
                result=n;
                break;
            }
            n++;
        }
        return result;
    }
}