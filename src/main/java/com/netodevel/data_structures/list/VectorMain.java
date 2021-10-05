package com.netodevel.data_structures.list;

import java.util.ArrayList;

public class VectorMain {

    public static void main(String[] args) {
        var vector = new Vector(10);
        vector.add(50);
        vector.add(2);

        System.out.println(vector.size());
        System.out.println(vector.get(3));

    }
}
