import java.util.Arrays;

public class ArrayInverterTest2 {
    public static void main(String[] args) { // Main
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }
}

// Существует массив {1, 2, 3, 4}
// и его надо развернуть (или инвертировать) и получить массив {4, 3, 2, 1}.