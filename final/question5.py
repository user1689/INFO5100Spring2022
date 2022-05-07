from typing import List
import random

class solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        def partition(low, high):
            pivot = random.randint(low, high)
            swap(pivot, low)
            i = low
            j = low + 1
            while (j <= high):
                if (nums[j] > nums[low]):
                    swap(i+1, j)
                    i += 1
                j += 1
            swap(i, low)
            return i

        def swap(i, j):
            nums[i], nums[j] = nums[j], nums[i]

        def quickSelection(left, right):
            while (True):
                idx = partition(left, right)
                if (idx == k - 1):
                    return nums[idx]
                elif (idx > k - 1):
                    right = idx - 1
                else:
                    left = idx + 1
        
        return quickSelection(0, len(nums) - 1)
    
obj = solution()
arr = [1,5,3,2,4,6,7]
ans = obj.findKthLargest(arr, 3)
print(ans)