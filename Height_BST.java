#To find height of a Binary Tree.

Class Node{
	int data;
	Node left,right;

	Node(int item){
		int item = data;
		Node left,right = null;
	}

	int height(Node node){

		if (node == null){
			return 0;
		}
		else{
			int l = height(node.left);
			int r = height(node.right);
		
			if (l>r){
				return (1+l);
			}
			else{
				return (1+r);
			}
		}
	}
	
}