class josephus_problelm(object):
    def __init__(self, N, k):
        self.N = N
        self.people = [i for i in range(N)]
        self.kill_position = k
        self.josephus = None

    def _get_position(self):
        person = self.__hypothesis(self.people, self.kill_position)
        print(person)
    
    def __hypothesis(self, people, kill_position):
        print(people, people[kill_position])
        if len(people) == 1:
            self.josephus = people.pop(0)
            return 
        people.pop(kill_position)
        self.__hypothesis(people, (kill_position + self.kill_position-1)%len(people))

N = 40
k = 7
obj = josephus_problelm(N, k)
obj._get_position()
print(obj.josephus)


