class Solution {
    public static boolean isprime(int num){
       if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        String s= String.valueOf(num);
        int n= s.length();
        for(int i=1;i<=n;i++){
            int nu=Integer.parseInt(s.substring(0, i));
            if(!isprime(nu))
            return false;

        }
        for(int i=0;i<n;i++){
            int nu=Integer.parseInt(s.substring(i, n));
            if(!isprime(nu))
            return false;

        }
        return true;
    }
}