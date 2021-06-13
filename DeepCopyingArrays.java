package com.java.Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepCopyingArrays {
	public static void main(String[] args) {
		int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));
    }
}
