class solution:
    def checkParenthesis(self, s:str) -> bool:
        stack = []
        for char in s:
            if (char == '(' or char == '[' or char == '{' ):
                stack.append(char)
            else:
                if (not stack):
                    return False
                else:
                    if (stack[-1] == '(' and char != ')'):
                        return False
                    elif (stack[-1] == '[' and char != ']'):
                        return False
                    elif (stack[-1] == '{' and char != '}'):
                        return False
                stack.pop()
        return len(stack) == 0
    
obj = solution()
example = "{}["
res = obj.checkParenthesis(example)
print(res)