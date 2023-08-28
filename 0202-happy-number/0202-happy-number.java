class Solution {
   public static boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
           s=squares(s);
           f=squares(squares(f));
        }while(f!=s);
        if(s==1) return true;
        else return false;
    }
    private static int squares(int num){
        int s=0;
        while(num>0){
            int v=num%10;
            s+=v*v;
            num=num/10;
        }
        return s;
    }
}