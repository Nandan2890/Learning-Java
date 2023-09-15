package binarysearchtree;

public class BinarySearchTree {
    public Node root;
    
    class Node{
        int value;
        Node left;
        Node right;
        
        Node(int value){
            this.value = value;
        }
    }
    
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value)
                return false;
            
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    
    public boolean contain(int value){
        Node temp = root;
        if(root == null){
            return false;
        }
        
        while(temp != null){
            if(value < temp.value){
                if(temp.left == null){
                    return false;
                }
                temp = temp.left;
            } else if(value > temp.value){
                if(temp.right == null){
                    return false;
                }
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }
}
