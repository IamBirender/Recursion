class TOH(object):
    def __init__(self, N):
        self.N = N
        self.source = "Source"
        self.helper = "Helper"
        self.destination = "Destination"

    def _towerOfHanoi(self):
        self.__hypothesis(self.N, self.source, self.helper, self.destination)

    def __hypothesis(self, numOfPlates, src, helper, dest):
        if numOfPlates == 1:
            # Base condition
            print(f"Moving plate {numOfPlates} from {src} to {dest}")
            return 

        self.__hypothesis(numOfPlates-1, src, dest, helper)
        # Induction
        print(f"Moving plate {numOfPlates} from {src} to {dest}")
        self.__hypothesis(numOfPlates-1, helper, src, dest)
        
numberOfPlates = 5
obj = TOH(numberOfPlates)
obj._towerOfHanoi()