package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTasks {
//    https://beginnersbook.com/2013/12/hashset-class-in-java-with-example/
    
//1. Write a Java program to append the specified element to the end of a hash set.

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
//
//
//2. Write a Java program to iterate through all elements in a hash list.
        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(10);
        numbers1.add(5);
        numbers1.add(5);
        numbers1.add(5);
        numbers1.add(5);
        numbers1.add(5);
        System.out.println(numbers1);

        System.out.println("1. way ------------------------------");
        for (Integer number : numbers1) {
            System.out.println(number);
        }

        System.out.println("\n2. way ------------------------------");
        Iterator<Integer> iterator = numbers1.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
//
//
//3. Write a Java program to get the number of elements in a hash set.
        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(10);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(5);
        System.out.println(numbers2);

        System.out.println(numbers2.size());

//
//
//4. Write a Java program to empty an hash set.
        HashSet<Integer> numbers3 = new HashSet<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(10);
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(5);
        System.out.println(numbers3);
        //part1
        // numbers.clear();
        // System.out.println(numbers); //=> []

        //part 2, remove only 1 and 2 using .removeAll method
        // Hint: create second HashSet with 1 and 2
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(1);
        s2.add(2);
        numbers3.removeAll(s2);
        System.out.println(numbers3); //=> [3, 5, 10]
//
//
//5. Write a Java program to test a hash set is empty or not.
        HashSet<Integer> numbers4 = new HashSet<>();
        numbers4.add(1);
        numbers4.add(2);
        numbers4.add(3);
        numbers4.add(10);
        numbers4.add(5);
        numbers4.add(5);
        numbers4.add(5);
        numbers4.add(5);
        numbers4.add(5);

        System.out.println(numbers4.isEmpty());
        //part2 if it is empty, print => its empty
        // else print numbers in set
        if (numbers4.isEmpty()) {
            System.out.println("Its empty");
        } else {
            System.out.println(numbers4);
        }
//
//
//6. Write a Java program to clone a hash set to another hash set.
//
//
//7. Write a Java program to convert a hash set to an array.
        HashSet<Integer> numbers5 = new HashSet<>();
        numbers5.add(1);
        numbers5.add(2);
        numbers5.add(3);
        numbers5.add(10);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);
        numbers5.add(5);

        int size = numbers5.size();
        Integer[] array = new Integer[size];
        numbers5.toArray(array);
        System.out.println("New ARRAYS ELEMENTS ");

        for (Integer elements : array) {
            System.out.println(elements);
        }
//
//
//8. Write a Java program to convert a hash set to a tree set.
//
//
//9. Write a Java program to convert a hash set to a List/ArrayList.
//
//
//10. Write a Java program to compare two hash set.
//
//
//11. Write a Java program to compare two sets and retain elements which are same on both sets.
//
//
//12. Write a Java program to remove all of the elements from a hash set.

//13. Write a Java Program to find duplications
    }
}
