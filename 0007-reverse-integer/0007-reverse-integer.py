class Solution:
    def reverse(self, x: int) -> int:
        s=str(x)
        if s[0] == '-':
         num= int('-' + s[-1:0:-1])
         if num >= -2147483648 and num<= 2147483647:
            return num
         else:
            return 0
        else:
            num = int(s[::-1])
            if num >= -2147483648 and num<= 2147483647:
               return num
            else:
               return 0