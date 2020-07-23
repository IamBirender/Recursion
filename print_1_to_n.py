class print_1_to_n(object):
    def __init__(self, num):
        self.num = num
    
    def _print(self):
        self._recursion(num)
        return True

    def _recursion(self, num):
        if num == 0:
            return 
        self._recursion(num-1)
        print(num)

#input
num = 10
#output -> 1,2,3,4,5,6,7...10

print_1 = print_1_to_n(num)
print_1._print()
