class MyBinaryTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = null;
            right = null;
        }
    }

    MyBinaryTree(){
        root = null;
    }


    void insert(int data){
        root = insertRec(root, data);
    }

    //recursive insertion
    Node insertRec(Node root, int data){

        if(root == null){
            root = new Node(data);
            return root;
        }

        //traverse left if data is less than root
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        //traverse if data is greater than root
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }


    void printTree(){
        printTreeRec(root);
    }

    //inorder traversal of the tree
    void printTreeRec(Node root){
        if(root != null){
            printTreeRec(root.left);
            System.out.println(root.data);
            printTreeRec(root.right);
        }
    }

    public static void main(String[] args){
        MyBinaryTree tree = new MyBinaryTree();

        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(27);
        tree.insert(11);
        tree.insert(73);

        tree.printTree();
    }

}
