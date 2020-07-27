class Node():
    def __init__(self, val):
        self.left = None
        self.right = None
        self.val = val

#     5
#    / \
#   3   7
#      / \
#     6   8
root =  Node(5)
root.left = Node(3)
root.right = Node(7)
root.right.left = Node(6)
root.right.right = Node(8)
root.right.right.right = Node(9)

class height_of_binary_tree(object):
    def __init__(self, root):
        self.root = root
        self.height = 0
    
    def _get_height(self):
        self.height = self.__recursion(self.root)
        return self.height
    
    def __recursion(self, root):
        if root is None:
            return 0

        return 1 + max(self.__recursion(root.left), self.__recursion(root.right))

height_of_b_tree = height_of_binary_tree(root)
height_of_b_tree._get_height()
print(height_of_b_tree.height)