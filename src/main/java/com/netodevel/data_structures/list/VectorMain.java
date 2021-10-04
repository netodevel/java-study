package com.netodevel.data_structures.list;

public class VectorMain {

    public static void main(String[] args) {
        var vector = new Vector(10);
        vector.addMoreFast(50);
        vector.addMoreFast(2);

        System.out.println(vector.size());
        System.out.println(vector.get(3));
    }
}
