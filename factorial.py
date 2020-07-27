class factorial(object):
    def __init__(self, val):
        self.val = val
        self.result = 1
    
    def _calculate_factorial(self):
        self.result = self.__recursion(self.val)
        return self.result
    
    def __recursion(self, num):

        if num == 1:
            return 1

        return num * self.__recursion(num-1)
        

num = 5
fact = factorial(5)
print(fact._calculate_factorial())