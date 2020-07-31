class print_all_subs(object):
    def __init__(self, string):
        self.string = string
        self.result = list()
    
    def _print_all_subsequence(self):
        self.__hypothesis(self.string, "")
        print(self.result)
    
    # hypothesis
    def __hypothesis(self, string, temp_str):
        # Base condition
        if len(string) == 0:
            self.result.append(temp_str)
            return ""
                
        # induction
        self.__hypothesis(string[:-1], temp_str)
        self.__hypothesis(string[:-1], string[-1] + temp_str)

string = "abc"
obj = print_all_subs(string)
obj._print_all_subsequence()