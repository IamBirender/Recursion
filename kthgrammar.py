class solution(object):
    def __init__(self):
        self.result = None
    
    def _kthGrammar(self, N, K):
        self.result = self.__hypothesis(N)

        return self.result[K-1]

    # hypothesis step  
    def __hypothesis(self, N):
        # Base condition
        if N == 1:
            return '0'

        temp = self.__hypothesis(N-1)
        return self.__induction(temp)

    #induction step    
    def __induction(self, seq):
        res = ""
        for ch in seq:
            if ch == "0":
                res += "01"
            else:
                res += "10"
        return res

N = 1
K = 1
obj = solution()
print(obj._kthGrammar(N, K))

