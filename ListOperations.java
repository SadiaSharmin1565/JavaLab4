package com.mycompany.arrayproblem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(0);
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

        arrayList.set(2, 10);
        linkedList.set(2, 10);
        System.out.println("New element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("New element at index 2 in LinkedList: " + linkedList.get(2));

        arrayList.remove(2);  
        linkedList.remove(Integer.valueOf(10)); 
        System.out.println("ArrayList after removing element at index 2: " + arrayList);
        System.out.println("LinkedList after removing value 10: " + linkedList);

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        arrayList.add(1, 15);
        linkedList.add(2, 20);
        System.out.println("ArrayList after adding element at index 1: " + arrayList);
        System.out.println("LinkedList after adding element at index 2: " + linkedList);
    }
}
