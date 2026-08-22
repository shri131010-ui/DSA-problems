class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int multi=1;
        int k=n;
        int j;
        int s;
        while(n>0){
            j=n%10;
            sum=sum+j;
            multi=multi*j;
           n=n/10;
        }
        s=sum+multi;
        if(k%s == 0){
            return true;
        }
        else {
            return false;
        }
    }
}