class n_bit_binary(object):
    def __init__(self, N):
        self.N = N
        self.result = list()

    def _get_sequences(self):
        self.__hypothesis(self.N, "")
    
    def __hypothesis(self, input, output):
        #base condition
        if input == 0:
            
            self.result.append(output)
            return 

        self.__hypothesis(input-1, output + "0")
        self.__hypothesis(input-1, output + "1")

N = 3
obj = n_bit_binary(N)
obj._get_sequences()
print(len(obj.result))

