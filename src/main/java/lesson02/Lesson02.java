package lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        // 1.Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Test 1");
        System.out.println("An array:");
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]+"  ");

        System.out.println();
        System.out.println("Modified array:");
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }

        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + "  ");

        System.out.println();
    // 2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println();
        System.out.println("Test 2");
        System.out.println("An array:");
        int[] arr2 = new int[8];

        arr2[0] = 0;

        for(int i = 1; i< arr2.length; ++i) {
            arr2[i] = arr2[i-1] + 3;
}
        for(int i : arr2) System.out.print(i + "  ");

        System.out.println();
    // 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println();
        System.out.println("Test 3");
        int arr3[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("An array:");
        for (int i : arr3) System.out.print(i + "  ");
        System.out.println();
        System.out.println("Modified array:");
        for(int i = 0; i < arr3.length; ++i) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + "  ");
        }
    // 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int arr4[][] = new int[3][3];
        int number = 1;
        if (arr4.length % 2 == 0)
            for(int i = 0, j = 0; i < arr4.length; ++i, ++j){ //i проходим по строкам. j индекс элемента
                arr4[i][j] = 1;
                arr4[i][arr4.length - 1 - j] = 1;
            }
        else
            for(int i = 0, j = 0; i < arr4.length; ++i, ++j) //i проходим по строкам. j индекс элемента
                if (j == arr4.length-1-j)  arr4[i][j] = 1;
                else {
                    arr4[i][j] = 1;
                    arr4[i][arr4.length - 1 - j] = 1;
                }

    // 5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    // (без помощи интернета);
        System.out.println();
        System.out.println();
        System.out.println("Test 5");
        int arr5[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i< arr5.length; ++i) {
            if (arr5[i] > max) max = arr5[i];
            if (arr5[i] < min) min = arr5[i];
        }

        System.out.print("Min: "+ min);
        System.out.println();
        System.out.print("Max: "+ max);
        System.out.println();
    //6. тест
        System.out.println();
        System.out.println("Test 6");
        boolean isThere = checkBalance(arr5);
        System.out.println(isThere);
    //7. тест
        System.out.println();
        System.out.println("Test 7");
        System.out.println("An array:");
        for(int i = 0; i < arr5.length; ++i)
            System.out.print(arr5[i]+"  ");
        System.out.println();
        changingArray(arr5, 5);
        System.out.println("Modified array:");
        //System.out.println();
        for(int i = 0; i < arr5.length; ++i)
            System.out.print(arr5[i]+"  ");
    }
    //6.** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.
    public static boolean checkBalance(int arr6[]) {
    int summLeft = arr6[0];
    int summRight = arr6[arr6.length - 1];
    for(int i = 0, j = arr6.length - 1; i != j; )
          if (summLeft == summRight) {
              ++i; --j; summLeft += arr6[i]; summRight += arr6[j];
          } else if (summLeft > summRight) {
              ++i; summLeft += arr6[i];
          } else {
            --j; summRight += arr6[j];
            }
        return summLeft == summLeft;
    }
    //7.**** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void changingArray(int arr7[], int n) {
        if (n > 0)
                    for(int count = 0; count < n; ++count) {
                        int lastElement = arr7[arr7.length-1];
                        for(int i = arr7.length-1; i > 0; --i)
                            arr7[i] = arr7[i-1];
                        arr7[0] = lastElement;
                    }

         else if (n < 0)
                    for(int count = 0; count < n; ++count) {
                        int firstElement = arr7[0];
                        for(int i = 0; i < arr7.length-1; ++i)
                            arr7[i] = arr7[i+1];
                        arr7[arr7.length-1] = firstElement;
                    }
    }
}
