public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {
            String[] array = new String[end - start + 1];

            int number = start; //number это значения в ячейках

            for (int i = 0; i < array.length && number <= end; i++) { //должны пройти по всем индексам равным длинне массива (i номер ячеки)
                if (number % 15 == 0) {
                    array[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    array[i] = "Fizz";
                } else if (number % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);
                }

                number ++;
            }

            return array; //если данные валидные ходим по циклу и возвращаем массив
        }

        return new String[0]; //как только данные выше становятся не валидные возвр нулевой (пустой) массив
    }
}
