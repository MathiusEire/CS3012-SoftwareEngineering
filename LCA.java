import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class LCA {

	@Test
	void test() {
		{ 
	        // Let us construct the BST shown in the above figure 
	        

			BinaryTree tree = new BinaryTree(); 
	        tree.root = new Node(20); 
	        tree.root.left = new Node(8); 
	        tree.root.right = new Node(22); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.right.left = new Node(10); 
	        tree.root.left.right.right = new Node(14); 
	        //check null
	        Node t =tree.lca(null,1,1);
	        //check filled trees
	        int n1 = 10, n2 = 14; 
	        t = tree.lca(tree.root, n1, n2); 
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
	        assertEquals(12,t.data);
	        n1 = 14; 
	        n2 = 8; 
	        t = tree.lca(tree.root, n1, n2); 
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
	        assertEquals(8,t.data);
	        n1 = 10; 
	        n2 = 22; 
	        t = tree.lca(tree.root, n1, n2); 
	        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
	        assertEquals(20,t.data);
	    } 
	}

}
