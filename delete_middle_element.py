class delete_middle_element(object):
    def __init__(self, arr):
        self.arr = arr
        self.mid = len(arr)//2 + 1
        self.res = list()

    def _del_element(self):
        self.res = self.__recursion(self.arr)
        return self.res
    
    def __recursion(self, arr):
        if len(arr) == self.mid:
            if self.mid:
                return arr[:-1]
            else:
                return arr
        temp = arr[-1]
        arr = self.__recursion(arr[:-1])
        arr.append(temp)
        return arr

arr = [1,2,3,4,5]
delete = delete_middle_element(arr)
delete._del_element()
print(delete.res)