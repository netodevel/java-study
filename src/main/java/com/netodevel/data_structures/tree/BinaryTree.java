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

    public BinaryTree postOrderTraversal(Node node) {
        if (node == null) {
            node = this.root;
        }

        if (node.left != null) {
            postOrderTraversal(node.left);
        }
        if (node.right != null) {
            postOrderTraversal(node.right);
        }

        System.out.println(node);
        return this;
    }

    public int height(Node node) {
        if (node == null) {
            node = this.root;
        }
        int hleft = 0;
        int hright = 0;

        if (node.left != null) {
            hleft = height(node.left);
        }
        if (node.right != null) {
            hright = height(node.right);
        }
        if (hright > hleft) {
            return hright + 1;
        }
        return hleft + 1;
    }

}
