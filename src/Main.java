import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //условие в комментарии и никакого кода
    //решение без учёта файлов - чтение с клавиатуры и вывод на экран
    //добавляем файлы, если они указаны в задаче
    //разбиваем задачу на методы
    //добавляем try..catch
    //Напишите программу создания небольшого словаря сленговых программерских выражений,
    // чтобы она потом по запросу возвращала значения из этого словаря.
    //Файл dict.txt
    //В первой строке задано одно целое число n — количество слов в словаре.
    //В следующих n строках записаны слова и их определения,
    // разделенные двоеточием и символом пробела.
    //Ввод с клавиатуры
    //В первой строке записано целое число m — количество поисковых слов,
    // чье определение нужно вывести.
    //В следующих m строках записаны сами слова, по одному на строке.
    //Формат выходных данных
    //Для каждого слова, независимо от регистра символов,
    // если оно присутствует в словаре, необходимо вывести на экран его определение.
    //Если слова в словаре нет, программа должна вывести "Не найдено", без кавычек.
    public static void main(String[] args) throws IOException {
        System.out.println("Dictionary");
        Scanner scanner = new Scanner(new File("res/dict.txt"));
        String n = scanner.nextLine();
        System.out.println(" Our dictionary hat " + n + " words");
        System.out.println("Input number of words:");

    }
}