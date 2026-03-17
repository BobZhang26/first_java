//public class InfiniteLoop {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10){ /* having while here will cause an infinite loop,
//                           because i is not being updated inside the loop */
//            if (i == 5){
//                continue;
//            }
//            System.out.println(i + " ");
//            i ++;
//        }
//    }
//}
public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println(i + " ");
            i ++;
            if (i == 5) {
                continue;
            }
        }
    }
}