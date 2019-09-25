import java.util.*;
class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTreeHeapEquivalent{
    private BinaryNode root;
    public void insert(int data){
        BinaryNode temp=new BinaryNode(data);
        if(this.root==null){
            this.root=temp;
            return ;
        }
        //else {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(this.root);
            while (!queue.isEmpty()) {
                BinaryNode front = queue.remove();
                if (front.left != null) {
                    queue.add(front.left);
                } else {
                    front.left = temp;
                    return ;
                }
                if (front.right != null) {
                    queue.add(front.right);
                } else {
                    front.right = temp;
                    return ;
                }
            }
       // }
        return ;
    }
    public void levelOrder(BinaryNode root){
        if(root == null){
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode front = queue.remove();
            System.out.println(front.data);

            if(front.left != null){
                queue.add(front.left);
            }
            if(front.right != null){
                queue.add(front.right);
            }
        }
    }

    public BinaryNode getRoot() {
        return this.root;
    }

}
public class BinaryTreeEx {
    public static void main(String[] args){
        BinaryTreeHeapEquivalent b=new BinaryTreeHeapEquivalent();
        b.insert(10);
        b.insert(11);
        b.insert(12);
        b.insert(13);
        BinaryNode t=b.getRoot();
        b.levelOrder(t);
    }
}
