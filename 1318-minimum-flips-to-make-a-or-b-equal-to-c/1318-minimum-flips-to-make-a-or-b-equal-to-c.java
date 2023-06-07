class Solution {
    public int minFlips(int a, int b, int c) {
        int flag=0;
        while(a!=0 || b!=0 || c!=0){
            int av=a&1;
            int bv=b&1;
            int cv=c&1;
            if((av|bv) != cv){
                if(av==1 && bv==1)
                    flag+=2;
                else
                    flag+=1;
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return flag;
    }
}