package binarysearchtree;

public class Main {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        
        bst.insert(27);
        
        System.out.println("Root = " + bst.root.value);
        System.out.println(bst.root.left.right.value);
        System.out.println(bst.contain(47));
    }
}
