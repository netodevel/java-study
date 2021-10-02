package com.netodevel.data_structures.tree;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
    }

    public BinaryTree(Object data) {
        this.root = new Node(data);
    }

    public BinaryTree simetricTraversal(Node node) {
        if (node == null) {
            node = this.root;
        }
        if (node.left != null) {
            simetricTraversal(node.left);
        }
        System.out.println(node);
        if (node.right != null) {
            simetricTraversal(node.right);
        }
        return this;
    }
}
