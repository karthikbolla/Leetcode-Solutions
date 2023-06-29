class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        if (len(s) == 0):
            return 0
        string = s.strip()
        word= string.split(" ")
        return len(word[-1])