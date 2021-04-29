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


    //delete data

    void deleteData(int data){
        root = deleteDataRec(root, data);
    }

    Node deleteDataRec(Node root,int data){

        //base case empty tree
        if(root == null){
            return root;
        }

        //traverse tree to find the data value
        if(data < root.data){
            root.left = deleteDataRec(root.left, data);
        }
        else if(data > root.data){
            root.right = deleteDataRec(root.right, data);
        }


        //key is found
        else {
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            //two children of the found node
            //find smallest number on the right.
            //replace root with that data
            //then delete the replacement data from the right
            root.data = minimumRight(root.right);

            root.right = deleteDataRec(root.right, root.data);
        }





        return root;
    }

    int minimumRight(Node root){
        int minimumValue = root.data;

        //smallest value is the furthest left
        while(root.left != null){
            minimumValue  = root.left.data;
            root = root.left;
        }

        return minimumValue;
    }


    void printTree(){
        printTreeRec(root);
    }

    //inorder traversal of the tree
    void printTreeRec(Node root){
        if(root != null){
            printTreeRec(root.left);
            printTreeRec(root.right);
            System.out.println(root.data);
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
        //tree.printTree();

        tree.deleteData(50);
        tree.printTree();
    }

}
