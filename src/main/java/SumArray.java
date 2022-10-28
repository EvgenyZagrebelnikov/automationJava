public class SumArray {
    /*
    3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива
        Test Data:
        {0, 1, 2, 3, 4, 5} → 15
        {-7, -3} → -10
     */
    public int sumArray(int[] numbers) {
        if (numbers != null) {
            int result = 0;

            for (int i : numbers) {
                result += i;
            }

            return result;
        }

        return 0;
    }
}
