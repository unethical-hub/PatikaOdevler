// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] list = {3, 6, 8, 4, 3, 7, 3, 1, 4, 9, 6, 8};
        int[] dublicateDouble = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = 0; j < list.length; j++) {

                    if ((i != j) && (list[i] == list[j])) {
                        if (!isFound(dublicateDouble, list[i])) {
                            dublicateDouble[startIndex++] = list[i];
                        }
                    }
                }
            }
        }

        for (int value : dublicateDouble) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }

    static boolean isFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }

        return false;
    }
}
