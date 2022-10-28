public class BiggerValue {
    /*
    4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
        Test Data:
        3333, 9999
        Expected Result = 9999
     */
    public int biggerValue(int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
