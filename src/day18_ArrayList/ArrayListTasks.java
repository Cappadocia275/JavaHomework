package day18_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTasks {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);

////3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Yellow");
        System.out.println(colors);
//
//2. Write a Java program to iterate through all elements in a array list.

        ArrayList<String> colors1 = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);

        System.out.println("1. way -----------------------------------");
        //for-each
        for (String color : colors1) {
            System.out.println(colors1);
        }
//
//


//
//
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

        ArrayList<String> colors2 = new ArrayList<>();
        colors.add("Red"); //0
        colors.add("White");//1
        colors.add("Black");//2
        colors.add("Green");//3
        System.out.println(colors2);

        //write you code here
        //Hint: print third element in arrayList.
        // => Black
        System.out.println("third element in arrayList: " + colors2.get(2));

//
//
//5. Write a Java program to update specific array element by given element.
        ArrayList<String> colors3 = new ArrayList<>();
        colors3.add("Red"); // 0
        colors3.add("White");// 1
        colors3.add("Black"); // 2
        colors3.add("Green");
        System.out.println(colors);
        //Hint: for example change black to blue
        // Black => Blue
        // .set(index, value);
        colors.set(2, "Blue");
        System.out.println(colors);

//
//
//6. Write a Java program to remove the third element from a array list.

        ArrayList<String> colors4 = new ArrayList<>();
        colors4.add("Red"); // 0
        colors4.add("White");// 1
        colors4.add("Black"); // 2
        colors4.add("Green"); // 3
        System.out.println(colors4);

        System.out.println("1. way");
        colors4.remove(2);
        System.out.println(colors4);
//
//
//7. Write a Java program to search an element in a array list.
        boolean containsBlack1 = false;
        for (String color : colors) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }
//
//
//8. Write a Java program to sort a given array list.
        ArrayList<String> letters = new ArrayList<>();
        letters.add("D"); // 0
        letters.add("C");// 1
        letters.add("A"); // 2
        letters.add("B");
        System.out.println("List before sort: " + letters);

        Collections.sort(letters);
        System.out.println("List after sort: " + letters);

//
//
//9. Write a Java program to copy one array list into another.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: " + list1);

        ArrayList<String> list2 = new ArrayList<>(3);
        // write code here
        System.out.println("HARDCODE");
        String element0 = list1.get(0);
        list2.add(element0);
        list2.add(list1.get(1));
        System.out.println("1. way");
        // Hint: use loop and .get(), .add() methods
        for (String element : list1) {
            list2.add(element);
        }
        System.out.println("List 2: " + list2);
        list1.remove(0); // when we remove item from list1, list2 should not change
        System.out.println("List 2 again: " + list2);
//
//
//10. Write a Java program to shuffle elements in a array list.[advanced]
//
//
//11. Write a Java program to reverse elements in a array list.
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Red"); // 0
        list3.add("White");// 1
        list3.add("Black"); // 2
        list3.add("Green");
        System.out.println("List 1: " + list3);
        // code here
        // Hint: you can .add() while going reverse,
        // use extra arrayList to do it
        // System.out.println("1. way");
        // Collections.reverse(list1);

        System.out.println("2. way");
        ArrayList<String> list4 = new ArrayList<>();
        for (int i = list3.size() - 1; i >= 0; i--) {
            String element = list3.get(i);
//            System.out.println(element);
            list2.add(element);
        }
        list3 = list4;
        // end code
        System.out.println("List 1 reverse : " + list3);
//
//
//12. Write a Java program to extract a portion of a array list.
//
//
//13. Write a Java program to compare two array lists.
//
//
//14. Write a Java program of swap two elements in an array list.
//
//
//15. Write a Java program to join two array lists.
//
//
//16. Write a Java program to clone an array list to another array list.
//
//
//17. Write a Java program to empty an array list.
//
//
//18. Write a Java program to test an array list is empty or not.
//
//
//19. Write a Java program to trim the capacity of an array list the current list size.
//
//
//20. Write a Java program to increase the size of an array list.
//
//
//21. Write a Java program to replace the second element of a ArrayList with the specified element.
//
//
//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
    }
}
