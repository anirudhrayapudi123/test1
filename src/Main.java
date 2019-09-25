import java.util.*;
//aaaaaaaaaaaaaaaaa
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    static TreeNode root=null;
    public static void levelorder(TreeNode root){
        Queue<TreeNode> quu=new LinkedList<>();
        List<List<Integer>> big_l=new LinkedList<>();
        List<Integer> small_l=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!(q.isEmpty())){
            TreeNode t=q.remove();

            if(t==null){
                big_l.add(small_l);
                small_l =new  LinkedList();
                if(!(q.isEmpty())) {
                    q.add(null);
                }


            }
            else
            {
                small_l.add(t.data);
                //System.out.print(t.data+" ");
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }

            }


            //System.out.println();
        }
        for(int i=0;i<big_l.size();i++){
            System.out.println(big_l.get(i));
        }


    }
}
public class Main {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.left.left=new TreeNode(5);
        root.left.left.right=new TreeNode(6);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(8);
        root.right.left.left=new TreeNode(9);;
        root.right.left.right=new TreeNode(10);;
        root.right.right.left=new TreeNode(11);
        root.right.right.right=new TreeNode(12);;

        BinaryTree.root=root;
        BinaryTree.levelorder(root);

    }
}
