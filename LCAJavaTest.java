import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LCAJavaTest {

  /*  @Test
    void testFindLCA(){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.right.right = new Node(8);
		root.right.right.right.left = new Node(9);

		LCAJava.findLCA(root, root.right.left.left, root.right.right);
		LCAJava.findLCA(root, root.right.left.left, new Node(10));
		LCAJava.findLCA(root, root.right.left.left, root.right.left.left);
		LCAJava.findLCA(root, root.right.left.left, root.right.left);
		LCAJava.findLCA(root, root.left, root.right.left);
    }
*/
    @Test
    void testFindLCASucessors(){
		Node root = new Node(1);
		root.Successors[0] = new Node(2);
		root.Successors[1] = new Node(3);
		root.Successors[0].Successors[1] = new Node(4);
		root.Successors[1].Successors[0] = new Node(5);
		root.Successors[1].Successors[1] = new Node(6);
		root.Successors[1].Successors[0].Successors[0] = new Node(7);
		root.Successors[1].Successors[1].Successors[1] = new Node(8);
		root.Successors[1].Successors[1].Successors[1].Successors[0] = new Node(9);

		LCAJava.findLCA(root, root.Successors[1].Successors[0].Successors[0], root.Successors[1].Successors[1]);
		LCAJava.findLCA(root, root.Successors[1].Successors[0].Successors[0], new Node(10));
		LCAJava.findLCA(root, root.Successors[1].Successors[0].Successors[0], root.Successors[1].Successors[0].Successors[0]);
		LCAJava.findLCA(root, root.Successors[1].Successors[0].Successors[0], root.Successors[1].Successors[0]);
		LCAJava.findLCA(root, root.Successors[0], root.Successors[1].Successors[0]);
    }
}
