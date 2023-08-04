class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        lst=[]
        for i in nums:
            lst.append(i)
        for i in nums:
            lst.append(i)
        return lst
        
        
        
        