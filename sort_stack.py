class sort_stack_with_recursion(object):
    def __init__(self, arr):
        self.stack = arr
        self.result = list()

    def _sort_stack(self):
        self.result = self.__recursion(self.stack)
        return self.result
    
    def __recursion(self, arr):
        if len(arr) == 1:
            return arr
        temp = arr[-1]
        arr = self.__recursion(arr[:-1])
        arr.append(temp)
        res =  self.__insert(arr[:-1], arr[-1])
        return res
    
    def __insert(self, arr, num):
        if len(arr) == 0 or num > arr[-1]:
            arr.append(num)
            return arr
        temp = arr[-1]
        arr = self.__insert(arr[:-1], num)
        arr.append(temp)
        return arr

arr = [4,5,2,3,1,8,9]
sort_stack = sort_stack_with_recursion(arr)
sort_stack._sort_stack()
print(sort_stack.result)



