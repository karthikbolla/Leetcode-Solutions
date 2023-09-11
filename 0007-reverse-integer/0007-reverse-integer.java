class Solution {
    public int reverse(int x) {
        int val=0;
        int revnum = 0;
        if (x < 0) {
            x *= -1;
            val= reversing(x,revnum)*-1;
        } else {
            val=reversing(x,revnum);

        }
        if(val<Math.pow(-2,31) || val>Math.pow(2,31)-1){
            return 0;
        }
        else return val;
    }
    public int reversing(int x,int revnum){
        while (x > 0) {
            if(revnum>Integer.MAX_VALUE/10 || revnum<Integer.MIN_VALUE/10){
                return 0;
            }
            int last = x % 10;
            x /= 10;
            revnum = (revnum * 10) + last;
        }
        return revnum;
    }
}