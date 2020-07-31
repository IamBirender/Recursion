class letterCasePerm(object):
    def __init__(self, string):
        self.string = string
        self.result = list()
    
    def _getPermutations(self):
        self.__hypothesis(self.string, "")

    def __hypothesis(self, input, output):
        if len(input) == 0:
            self.result.append(output)
            return

        if input[0].isdigit():
            self.__hypothesis(input[1:], output + input[0])
        else:
            self.__hypothesis(input[1:], output+input[0].lower())
            self.__hypothesis(input[1:], output+input[0].upper())

string = "1A2b3c"
obj = letterCasePerm(string)
obj._getPermutations()
print(obj.result)