class Solution {
    public static int reverse(int no){
        int rev=0;
        while(no>0){
            rev=(rev*10)+(no%10);
            no/=10;
        }
        return rev;
    }
    public static Boolean isprime(int i){
        if(i<=1) return false;
        if(i==2) return true;
        if(i%2==0) return false;
        for(int j=3;j*j<=i;j+=2){
            if(i%j==0) return false;
        }
        return true;
    } 
    public int sumOfPrimesInRange(int n) {
        int r=reverse(n);
        
        int low =Math.min(n,r);
        int high=Math.max(n,r);
        int sum=0;
        for(int i=low;i<=high;i++){
            if(isprime(i))
            sum+=i;
        }
        return sum;
    }
}