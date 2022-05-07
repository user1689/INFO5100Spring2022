class solution:
    def compressString(self, s):
        i = 0
        j = 0
        res = ""
        n = len(s)
        while (i < n):
            j = i
            cnt = 0
            while (j < n and s[i] == s[j]):
                j+=1
                cnt+=1
            res += s[i]
            res += str(cnt)
            i = j 
        return res if  len(res) < len(s) else s

obj = solution()
s =  "ab"
res = obj.compressString(s)
print(res)