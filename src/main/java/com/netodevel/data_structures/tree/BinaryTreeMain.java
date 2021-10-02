package com.netodevel.data_structures.tree;

public class BinaryTreeMain {

    //ler em ordem simetrica
    //regra para inserir registros em uma arvore;

    public static void main(String[] args) {
/*
        var binaryTree = new BinaryTree(7);
        binaryTree.root.left = new Node(18);
        binaryTree.root.right = new Node(14);
        System.out.println(binaryTree.root);
*/

        var binaryTree = new BinaryTree();
        prepareDataToTree(binaryTree);
        binaryTree.simetricTraversal(null);
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
