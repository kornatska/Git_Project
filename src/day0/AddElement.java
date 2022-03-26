package day0;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = addElement(a, 4);
        System.out.println(Arrays.toString(b));

    }

    public static int [] addElement(int [] original, int elementToAdd){
        int [] newArray = new int[original.length + 1];

        for(int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

}
