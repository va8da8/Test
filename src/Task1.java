
/*
Круговой массив - массив из элементов, в котором по достижению конца массива следующим
элементом будет снова первый. Mассив задается числом n, то есть представляет собой числа от 1
до n.
Пример кругового массива для n=3:
n[0]=1,n[1]=2,n[2]=3,n[3]=1,n[4]=2,n[5]=3,n[6]=1
Напишите программу, которая выводит путь, по которому, двигаясь интервалом длины m по
заданному массиву, концом будет являться первый элемент.
Началом одного интервала является конец предыдущего. Путь - массив из начальных элементов
полученных интервалов.
Пример 1:
n = 4, m = 3
Решение:
Круговой массив: 1234 При длине обхода 3 получаем интервалы: 123, 341
Полученный путь: 13
Пример 2:
n = 5, m = 4
Решение:
Круговой массив: 123456 При длине обхода 4 получаем интервалы: 1234, 4512, 2345, 5123, 3451
Полученный путь: 14253
Параметры передаются в качестве аргументов командной строки.
Например, для последнего примера на вход подаются аргументы: 5 4
Ожидаемый вывод в консоль: 14253

В ТЗ ОШИБКА!!! В ПРИМЕРЕ 2, ДОПУЩЕНА ОШИБКА -> КРУГОВОЙ МАССИВ: 123456 (НЕ ДОЛЖЕН СОДЕРЖАТЬ ЦИФРУ 6, Т.К. ВВОДИМЫЙ
АРГУМЕНТ n РАВЕН 5) РЕЗУЛЬТАТ ВЫВОДА "Полученный путь: 14253" НЕВЕРЕН.
*/

class Task1 {
    public static void main(String... args) {
        int[] arr;
        int n,m;
        n = Integer.parseInt(args[0]);
        arr = new int[n];
        m = Integer.parseInt(args[1]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(i);
            i = 1 + (i + m - 3) % n;
        }
    }
}
