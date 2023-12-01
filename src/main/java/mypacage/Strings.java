package mypacage;

public class Strings {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.equals("Hello world"));
        System.out.println(s.equals("Hello"));

        String s2 = "Hello";
        System.out.println(s.equals(s2));
        s = "text";
        s2 = "TEXT";
        System.out.println(s.equalsIgnoreCase(s2)); //ignore register text TEXT
        System.out.println();

        s = "TeXt";
        System.out.println(s); //              TeXt
        System.out.println(s.toLowerCase()); //text
        System.out.println(s.toUpperCase()); //TEXT

        System.out.println();
        System.out.println(s.charAt(1)); //какое значение во 2 символе строкиб чсчет с 0
        System.out.println(s.indexOf("Xt")); //каким по счету символом строки идет текст... счет с 0

        s = "Hello, world!";
        System.out.println(s.contains("Hello")); // строка содержит в себе элемент Hello
        System.out.println(s.contains("text")); // строка не содержит text , false
        System.out.println(s.length()); //длина строки

        System.out.println();
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("!"));
        System.out.println(s.endsWith("Hello"));

       //разбиваем строку
        s = "hello,world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);

        // когда не знаем точных данных
        // %s - строка,  %d - целое число
        String str = "My name is %s! I'm %d years old!";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age)); //заполняет строку str переменными name и age по порядку
        System.out.println(String.format(str,"Vasya", 10)); // заполняет строку str данными прямо из строки печати

        //перевести строку в число
        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a * 3);

        //
        s = "Hello, world!";
        System.out.println(s.substring(1, 5)); //обрезаем со 2 по 5 значение строки
        System.out.println(s.substring(7)); // обрезаем все до 8 значения строки,оставляем  с 8 до конца


        // совмещаем методы
        System.out.println(s.substring(7, s.length() -2));

        // объединение строк, конкатинация

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        str = s1 + s2 + s3;
        System.out.println(str);

        str = s1.concat(s2).concat(s3);
        System.out.println(str);

    }
}
