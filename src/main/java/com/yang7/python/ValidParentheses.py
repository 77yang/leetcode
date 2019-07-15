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

        if s == "":
            return True
        length = len(s)

        start = s[0]
        if start == "}" or start == "]" or start == ")":
            return False

        temp = []
        for i in range(length):
            ele = s[i]
            if ele == "(" or ele == "{" or ele == "[":
                temp.append(ele)

            max_index = len(temp) - 1

            if max_index < 0 and (ele == "}" or ele == "]" or ele == ")"):
                return False

            if ele == ")":
                result = temp[max_index] == "("
                if not result:
                    return False
                del temp[max_index]

                continue

            if ele == "]":
                result = temp[max_index] == "["
                if not result:
                    return False
                del temp[max_index]

                continue

            if ele == "}":
                result = temp[max_index] == "{"
                if not result:
                    return False
                del temp[max_index]
                continue

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
