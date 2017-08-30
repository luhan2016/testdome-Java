class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    
    public boolean search(int value) {
            if (value == this.value)
                  return true;
            else if (value < this.value) {
                  if (left == null)
                        return false;
                  else
                        return left.search(value);
            } else if (value > this.value) {
                  if (right == null)
                        return false;
                  else
                        return right.search(value);
            }
            return false;
      }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {

    if (root == null)
                  return false;
            else
                  return root.search(value);
      
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(contains(n2, 3));
    }
}
