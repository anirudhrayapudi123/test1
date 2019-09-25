class BinarySearchTreeNode{
    int val1;
    BinarySearchTreeNode left;
    BinarySearchTreeNode right;
    BinarySearchTreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class New{
    public BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int data){
        if(root==null){
            root = new BinarySearchTreeNode(data);
            return root;
        }
        else{
            if(root.val<data){
                root.right = insertNode(root.right, data);
                //return root;
            }
            else{
                root.left = insertNode(root.left, data);
             //   return root;
            }
        }
        return root;
    }

    public void InOrder(BinarySearchTreeNode root){
        if(root==null)
            return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);


    }
}

public class BST {
    public static void main(String[] args){
        New n = new New();
        BinarySearchTreeNode root = new BinarySearchTreeNode(15);
        //n.insertNode(null,1);
        n.insertNode(root,10);
        n.insertNode(root,17);
        n.insertNode(root,25);
        n.InOrder(root);

    }
}
