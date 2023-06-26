class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        rx=x[::-1]
        if(x==rx):
            return True
        else:
            return False
        