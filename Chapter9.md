# Red-Black Trees

## Red-Black Rules

**1.** Every node is either red or black.

**2.** The root is always black.

**3.** If a node is red, its children must be black (although the converse isn'tnessarily true).

**4.** Every path from the root to a leaf, or to a null child, must contain the same number of black nodes.

## Red-Black Tree Tools

- **ROL**
  - _ROL Carries out a left rotation. To rotate a group of nodes, the topmost node of the group to be rotated first. For a left rotation, the top node must have a right child._
- **ROR**
  - _ROR performs a right rotation. to rotate the top node, make sure it has a left child._

## Red-Black Tree Efficency

$$O(log\_{2}(n))$$
