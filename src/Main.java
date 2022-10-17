public class Main {
    public static final int MAX = 10;
    public static final int MIN = -10;

    public static void main(String[] args) {
        //array creation
        int[] array = new int[MAX];
        //array initialization
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (MAX - MIN)) + MIN;
        }
        //print pair elements
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}