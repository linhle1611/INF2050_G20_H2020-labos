public class Permutation {

    public static void main (String[] arg){
        int a = 8, b = 3;
        System.out.printf("a = %d, b = %d%n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %d, b = %d%n", a, b);
    }

}
