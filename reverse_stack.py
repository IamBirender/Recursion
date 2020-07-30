# Reverse a stack with O(1) space complexity
class reverse_a_stack(object):
    def __init__(self):
        self.result = list()

    def _reverse(self, stack):
        self.result = self._recursion(stack)
    
    def _recursion(self, stack):
        if len(stack) == 0:
            return stack
        temp = stack[-1]
        self._recursion(stack[:-1])
        print("stack - ", stack, temp)
        stack = self._recursion2(stack[:-1], temp)
        print("reversed ", stack)
        return stack
    
    def _recursion2(self, stack, num):
        if len(stack) == 1:
            return [num]
        temp = stack[-1]
        stack = self._recursion2(stack[:-1], num)
        stack.append(temp)
        return stack
        

stack = [5,4,3,2,1]
print(stack)
solution = reverse_a_stack()
solution._reverse(stack)
print(solution.result)