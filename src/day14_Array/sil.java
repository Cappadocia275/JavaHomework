package day14_Array;

public class sil {
    public static void main(String[] args) {
        //Task 1. write a for loop that finds an maximum for the array
        //Task 2. write a for loop that finds an minimum for the array
        //Task 3. write a for loop that finds an average for the array
        // int[] myArray = {34,5,6,2,3,78,1}
        //OUTPUT: average: (34+5+6+2+3+78+1)/7

//       int max = Integer.MIN_VALUE;
////        for (int i = 0; i < myArray.length; i++) {
////            int currentNumber = myArray[i];
////            if (currentNumber > max){
////
////                max = currentNumber;
////        }
////
////        }
////        System.out.println("max is : " + max);
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i <myArray.length ; i++) {
//            int currentNumber = myArray[i];
//            if (currentNumber < min){
//                min = currentNumber;
//            }
//
//        }
//      //        System.out.println("min is : " + min);
//        int sum = 0;
//        int avarage=0;
//        for (int i = 0; i <myArray.length ; i++){
//            sum+=myArray[i];
//            avarage =sum /myArray.length;
//        }
//        System.out.println(avarage);
        int[] arr = {10, 2, 7, 4, 5, };
        boolean hasOne=false;
        boolean hasTwo=false;
        boolean hasOneAndTwo=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 1) {
                hasOne = true;
            }
            if (arr[i] == 2) {
                hasTwo = true;
            }
        }

        if (hasOne){
            System.out.println("Has one : ");
        }
        if (hasTwo) {
            System.out.println("Has Two : ");
        }
         hasOneAndTwo= hasOne && hasTwo;
        if (hasOneAndTwo){
            System.out.println("has one and two");
        }
    }


}
