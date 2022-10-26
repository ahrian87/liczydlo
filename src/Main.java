public class Main {
    public static void main(String[] args) {
        int [] numsTable= new int[] {2, 3, 7, 3, 3, 5, 2};

        int counter = 0;

        for (int num: numsTable) {
            if (num == 3) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}