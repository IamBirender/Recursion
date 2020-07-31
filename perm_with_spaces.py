class PermutationWithSpaces(object):
    def __init__(self, string):
        self.string = string
        self.result = list()

    def _perm_with_spaces(self):
        self.__hypothesis(self.string[1:], self.string[0])
        
    def __hypothesis(self, input, output):
        if len(input) == 0:
            self.result.append(output)
            return 

        self.__hypothesis(input[1:],output + input[0] )
        self.__hypothesis(input[1:],output + " " + input[0] )


string = "abc"
obj = PermutationWithSpaces(string)
obj._perm_with_spaces()
print(obj.result)
