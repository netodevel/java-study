package com.netodevel.data_structures.tree;

public class BinaryTreeMain {

    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        prepareDataToTree(binaryTree);

        System.out.println("----> simetric traversal");
        binaryTree.simetricTraversal(null);

        System.out.println("----> post order traversal");
        binaryTree.postOrderTraversal(null);

        System.out.println("----> height");
        System.out.println(binaryTree.height(null));
    }

    private static void prepareDataToTree(BinaryTree binaryTree) {
        var n1 = new Node('a');
        var n2 = new Node('+');
        var n3 = new Node('*');
        var n4 = new Node('b');
        var n5 = new Node('-');
        var n6 = new Node('/');
        var n7 = new Node('c');
        var n8 = new Node('d');
        var n9 = new Node('e');

        n6.left = n7;
        n6.right = n8;

        n5.left = n6;
        n5.right = n9;

        n3.left = n4;
        n3.right = n5;

        n2.left = n1;
        n2.right = n3;

        binaryTree.root = n2;
    }
}
