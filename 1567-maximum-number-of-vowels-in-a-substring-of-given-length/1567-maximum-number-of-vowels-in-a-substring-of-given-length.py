class Solution(object):
    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        vowels = set("aeiou")
        best = 0
        count = 0
        start = 0

        for end in range(len(s)):
            if s[end] in vowels:
                count += 1

            if end >= k - 1:
                best = max(count, best)
                if s[start] in vowels:
                    count -= 1
                start += 1
        return best
