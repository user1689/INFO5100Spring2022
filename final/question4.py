class solution:
    def sumZero(sefl, n):
        if (n & 1):
            res = [0]
        else:
            res = []
        for i in range(1, n//2+1):
            res.append(i)
            res.append(-i)
        return res
        
obj = solution()
n = 12
n2 = 3
res = obj.sumZero(n2)
print(res)