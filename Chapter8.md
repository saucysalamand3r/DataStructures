# Binary Trees


### Edges and Nodes:

![alt text](./images/image1.jpg)

### More Tree terms:

![alt text](./images/image2.jpg)

### Unbalanced Tree:

![alt text](./images/image4.jpg)

### Tree Logic:

![alt text](./images/image3.jpg)

### Traversing the Tree:

![alt text](./images/image5.jpg)
![alt text](./images/image6.jpg)

## Nodes
* First node added to tree is root
* A node is either a left or right child of the parent node (Unless it is the root node)
* A node with no children is called a leaf
* Nodes are objects
* Create objects leftChild and rightChild of type node
* Links connecting nodes are called edges

## Tree
* Trees are also objects
* Need find(), insert(), and delete() methods

## Efficiency
* O(logN) if balanced
* Can get as abad as O(N) if unbalanced

## Tree Traversal

### InOrder Traversal
* Goes left until it hits a null, then works its way right
* Finds nodes in oreder of lowest to highest

### Minimum and Maximum Nodes
* Find minimum by going left until getting null
* Find maximum by going right until getting null

