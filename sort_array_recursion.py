class sort_an_array(object):
    def __init__(self, arr):
        self.arr = arr
        self.result = list()

    def _sort_array(self):
        self.result = self.__recursion(self.arr)
        return self.result

# hypothesis -> __recursion will return the array in sorted order
    def __recursion(self, arr):
        if len(arr) == 1:
            return arr
        mid = len(arr)//2
        l = self.__recursion(arr[:mid])
        r = self.__recursion(arr[mid:])
        
        i, j = 0,0
        result = list()
        while i < len(l) and j < len(r):
            if l[i] <= r[j]:
                result.append(l[i])
                i += 1
            else:
                result.append(r[j])
                j += 1

        if i == len(l) and j != len(r):
            result.extend(r[j:])
        elif j == len(r) and i != len(l):
            result.extend(l[i:])

        return result

arr = [8,3,5,4,13,2,1,7,6]

sort_using_recursion = sort_an_array(arr)
sort_using_recursion._sort_array()
print(sort_using_recursion.result)
