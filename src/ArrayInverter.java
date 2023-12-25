public class ArrayInverter {
    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}

// Существует массив {1, 2, 3, 4} и его надо развернуть (или инвертировать) и получить массив {4, 3, 2, 1}.
// Находим середину массива - array.length / 2.
// Перебираем элементы массива от начала до середины и
// одновременно меняем местами элементы с индексом i и array.length - i - 1.
// Для обмена значениями используем вариант с введением временной переменной
