class perm_with_case_change(object):
    def __init__(self, string):
        self.string = string
        self.result = list()

    def _get_permutations(self):
        self.__hypothesis(self.string, "")

    # 
    def __hypothesis(self, input, output):
        if len(input) == 0:
            self.result.append(output)
            return 

        self.__hypothesis(input[1:], output+input[0] )
        self.__hypothesis(input[1:], output+input[0].upper())
    
string = "abcd"
obj = perm_with_case_change(string)
obj._get_permutations()
print(obj.result)
