class balancedParenthesis(object):
    def __init__(self, N):
        self.N = N
        self.open = N
        self.close = N
        self.result = list()

    def _getPermutations(self):
        self.__hypothesis(self.open, self.close, "")
    
    def __hypothesis(self, open, close, output):
        if open == close == 0:
            self.result.append(output)
            return 

        if open > 0:
            self.__hypothesis(open-1, close, output+"(")
        
        if close > open:
            self.__hypothesis(open, close-1, output+")")
        
N = 2
obj = balancedParenthesis(N)
obj._getPermutations()
print(obj.result)
