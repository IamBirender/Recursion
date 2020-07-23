class string_perm(object):
    def __init__(self, str):
        self.str = str 
        self.substr = list()
    
    def _get_sub_str(self):
        self._call_recursion("", self.str)
        return self.substr
    
    def _call_recursion(self, op, ip):
        if len(ip) == 0:
            self.substr.append(op)
            return
        self._call_recursion(op + ip[0], ip[1:])
        self._call_recursion(op, ip[1:])

str = "abc"
sol = string_perm(str)
print(sol._get_sub_str())


        
