public class OddIndices {
    /*
    2. Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных
        индексов
        Test Data:
        Input = {-45, 590, 234, 985, 12, 68}
        Expected Result =  {590, 985, 68}

     */

    public int[] oddIndices(int[] numbers) {
        if (numbers != null && numbers.length > 0) {
            int j = 0;
            int[] num = new int[numbers.length / 2];

            for (int i = 1; i < numbers.length; i += 2) { // а если нужны четные то начинаем с 0 и +1
                num[j] = numbers[i];
                j++;
            }
            return num;

        }
        return new int[0];
    }
}