class solution:
    def longestSubstringWithoutReapeating(self, s:str) -> int:
        arr = [-1] * 128
        l = 0
        r = 0
        ans = 0
        for r in range(0, len(s)):
            if (arr[ord(s[r]) - ord('a')] > -1):
                l = max(l, arr[ord(s[r]) - ord('a')] + 1)
            arr[ord(s[r]) - ord('a')] = r
            ans = max(ans, r - l + 1)
        return ans

obj = solution()
s = "pwwkew"
ans = obj.longestSubstringWithoutReapeating(s)
print(ans)




 
