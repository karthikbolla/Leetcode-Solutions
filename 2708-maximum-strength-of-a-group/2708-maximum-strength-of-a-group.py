class Solution:
    def maxStrength(self, nums: List[int]) -> int:
        mn = -9
        c=0
        for i in nums:
            if(i<0):
                c=c+1
                if(i>mn):
                    mn=i
        p=len(list(filter(lambda x: (x >=0), nums)))
        n=len(list(filter(lambda x: (x < 0), nums)))
        if(n==1 and p==0):
            return nums[0]
        if(c%2!=0):
            nums.remove(mn)
        if(nums.count(0)!=0):
            try:
                while True:
                    nums.remove(0)
            except ValueError:
                pass
        if(len(nums)==0):
            return 0
        else:
            r = 1
            for x in nums:
                r = r * x
            return r
            
            
        