package com.netodevel.data_structures.tree;

public class Node {

    public Object data;
    public Node left;
    public Node right;

    public Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return String.format("Node { data = '%s'} ", this.data);
    }
}
