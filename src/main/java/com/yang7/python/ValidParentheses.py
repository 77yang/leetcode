# https://leetcode.com/problems/valid-parentheses/

# Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
#
# An input string is valid if:
#
# Open brackets must be closed by the same type of brackets.
# Open brackets must be closed in the correct order.
# Note that an empty string is also considered valid.
#
# Example 1:
#
# Input: "()"
# Output: true
# Example 2:
#
# Input: "()[]{}"
# Output: true
# Example 3:
#
# Input: "(]"
# Output: false
# Example 4:
#
# Input: "([)]"
# Output: false
# Example 5:
#
# Input: "{[]}"
# Output: true
class Solution:
    def isValid(self, s: str) -> bool:
        length = len(s)
        temp = []

        dict = {
            "[": "]",
            "{": "}",
            "(": ")",
        }
        for i in range(length):
            ele = s[i]
            if ele in dict.keys():
                temp.append(ele)
                continue
            if ele in dict.values():
                if len(temp) > 0 and dict[temp.pop()] == ele:
                    continue
                return False
        return len(temp) == 0


print(Solution().isValid("()"))
print(Solution().isValid("()[]{}"))
print(Solution().isValid("(]"))
print(Solution().isValid("([)]"))
print(Solution().isValid("{[]}"))
print(Solution().isValid("[])"))
print(Solution().isValid("["))
print(Solution().isValid("[{"))
print(Solution().isValid("[{}"))
