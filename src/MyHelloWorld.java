public class MyHelloWorld {
    public static void main(String[] args) {
        int i;
        for ( i = 0; i < 10; i+=3){
            System.out.println(i + " ");
        }
        System.out.println("At last i is " + i);
        System.out.println("The man's name is " + args[0]);
    }
}