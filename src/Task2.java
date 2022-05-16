import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Напишите программу, которая рассчитывает положение точки относительно окружности.
Координаты центра окружности и его радиус считываются из файла1(F1.txt).
Пример:
1 1
5
Координаты точек считываются из файла2(F2.txt).
0 0
1 6
6 6
Пример:
Файлы передаются программе в качестве аргументов. Файл с координатами и радиусом
окружности - 1 аргумент, файл с координатами точек - 2 аргумент.
Координаты в диапазоне float.
Количество точек от 1 до 100
Вывод каждого положения точки заканчивается символом новой строки.
Соответствия ответов:
0 - точка лежит на окружности
1 - точка внутри
2 - точка снаружи

В ТЗ ОШИБКА!!! ЕСЛИ "Количество точек от 1 до 100", ТО ОТВЕТ НЕ МОЖЕТ НАЧИНАТЬСЯ "Соответствия ответов:
0 - точка лежит на окружности", ОН БУДЕТ НАЧИНАТЬСЯ С 1.
*/

class Task2 {
    public static void main(String... args) throws IOException {
        int i;
        File f1 = new File(args[0]);
        Scanner s1 = new Scanner(f1);
        float x, y, r;
        while (s1.hasNext()) {
            x = s1.nextInt();
            y = s1.nextInt();
            r = s1.nextInt();
            File f2 = new File(args[1]);
            Scanner s2 = new Scanner(f2);
            for (i = 1; i <=100; i++) {
                if (i == 101) break;
                while (s2.hasNext()) {
                    String a1 = s2.next(), b1 = s2.next();
                    float a2 = Integer.parseInt(a1), b2 = Integer.parseInt(b1);
                    if ((a2 - x) * (a2 - x) + (b2 - y) * (b2 - y) == r * r) {
                        System.out.println(i + " - точка лежит на окружности ");
                        i++;
                    } else if ((a2 - x) * (a2 - x) + (b2 - y) * (b2 - y) < r * r) {
                        System.out.println(i + " - точка внутри ");
                        i++;
                    } else {
                        System.out.println(i + " - точка снаружи ");
                        i++;
                    }
                }
            }
        }
    }
}
