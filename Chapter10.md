# 2-3-4 Trees and External Storage

## 2-3-4 Trees
* Nodes contain up to three data items
* Each data item can have two children
* Number of children is always one more than number of data items in the node
* A 2-node has 2 children
* A 3-node has 3 children
* If you don't know how many children a 4-node has, I don't know how to help you
* New data items are always inserted into leaves
* Top-down splitting prevents ripple effect up through the tree

### Node Splitting
* Need to split a node once it's full
* Steps:
    * Create new, empty node, right sibling of node being split
    * Item C moves into the new node
    * Item B moves to the splitting node's parent
    * Item A stays in the node that is splitting

### Splitting the Root
* Create new root node, containing Item B only from old root
* Item A remains where it is
* Item C becomes right child of Item A in new root (new sibling node)
