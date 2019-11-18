package day17_2DArray;

public class Homework {
    //part4, as homework
    //USING TWO LOOP print names and surnames
    //ex:
    //Bayram Guney
    //Micheal Jackson
    public static void main(String[] args) {
        //part1
        String[][] arr = {
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };
        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j] [i] + " ");

            }
            System.out.println();


        }
    }
}
