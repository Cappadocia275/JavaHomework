package day9_ifElseSwitch;

public class Homework {


//
//    public static class Test {
//        public static void main(String[] args)
//        {
//            for (;;)
//                System.out.println("TECHNO");
//        }
//    }
////Options:
////1.TECHNO
////2.Compile time error
////3.Run time Exception
////4.TECHNO (Infinitely)   (Answer)
//
//    class Test {
//        public
//        static void main(String[] args)
//        {
//            for (int i = 0; i < 3)
//            System.out.println("TECHNO");
//        }
//    }
////Options:
////1.TECHNO TECHNO TECHNO
////2.Compile time error (Answer)
////3.TECHNO (Infinitely)
////4.No output
//
static class Test {
        public static void main(String[] args)
        {
            boolean b = true;
            if (b = false) {
                System.out.println("HELLO");
            } else {
                System.out.println("BYE");
            }
        }
    }
////Option:
////1.HELLO
////2.BYE     (Answer)
////3.Compile time error: re- initialization
////4.No output
//
//    public class Test {
//        public
//        static void main(String[] args)
//        {
//            int a = 10, b = 20;
//            if (a < b) {
//                if (a > b) {
//                    System.out.println("HELLO TECHNO");
//                } else {
//                    System.out.println("WELCOME");
//                }
//            }
//        }
//    }
////Option:
////1.HELLO TECHNO
////2.WELCOME
////3.Compile time error  (Answer)
////4.HELLO TECHNO WELCOME
//
//    class Test {
//        public static void main(String[] args)
//        {
//            for (int i = 0;; i++) {
//                System.out.println("HIII");
//            }
//            System.out.println("BYE");
//        }
//    }
////Options:
////1. HIII
////2. HIII(infinitely)
////3. BYE
////4. Compile time error   (Answer)


}
