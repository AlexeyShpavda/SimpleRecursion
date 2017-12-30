public class Main {

    public static void main(String[] args) {
        cycle(new int[]{1, 2, 3, 4}, 0);
    }

    public static void cycle(int[] array, int counter) {
        int i;
        if (counter >= array.length - 1) {
            for(i = 0; i < array.length; ++i) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
        else {
            for(i = counter; i < array.length; ++i) {
                int temp = array[i];
                array[i] = array[counter];
                array[counter] = temp;
                cycle(array, counter + 1);
                temp = array[i];
                array[i] = array[counter];
                array[counter] = temp;
            }
        }
    }
}
