import statistics
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        lst=[]
        lst=nums1+nums2
        lst.sort()
        val=statistics.median(lst)
        return val
        
            