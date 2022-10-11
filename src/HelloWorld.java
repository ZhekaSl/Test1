import javax.swing.*;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.util.*;
import java.lang.StringBuilder;

public class HelloWorld {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван", 200.3);
        orders.put("Zhenya", 395.2);
        orders.put("Марк", 395.2);
        orders.put("Dima", 4.5);
        orders.put("Sasha",46.7);
        orders.put("Max", 596.6);
        for (String i : orders.keySet()){
            System.out.println(i);
        }
        orders.remove("Иван");
        System.out.println(orders);
        double sum = 0;
        for (Double i : orders.values()) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Сумма: " + sum);

    }

    public static void classHashMap(){
        HashMap<String, Integer> orders = new HashMap<>();

        orders.put("Zhenya", 18);    //put (ключ, значение) - добавление элемента в таблицу
        orders.get("Zhenya");     //get (ключ) - возвращает элемент под ключом
        for (Integer i : orders.values()) {     //values() - в цикле возвращает все элементы без указания ключей
            System.out.println(i);
        }
        for (String i : orders.keySet()) {  //keySet() - выводит все ключи из таблицы
            System.out.println(i);
            System.out.println(i);
        }
        orders.remove("Zhenya"); //remove (ключ) - удаление элемента из таблицы по ключу
        boolean a = orders.containsKey("Zhenya"); //containsKey(key) - возвращает true, если ключ найден
        boolean b = orders.containsValue(18); //containsValue(value) - возвращает true, если элемент найден
        orders.clear();  //clear() - удаление элементов и ключей из таблицы
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/ 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        System.out.println();
    }

    public static void HangMan() {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> used = new ArrayList<>();
        words.add("laptop");
        words.add("glasses");
        words.add("computer");
        words.add("lamp");
        words.add("cat");
        words.add("mouse");
        final int MAX_WRONGS = 5;
        int wrongs = 0;
        String word = words.get(random.nextInt(words.size()));
        StringBuilder encondingWord = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++) {
            encondingWord.append('-');
        }

        System.out.println("Привет, это игра висельница! Ваша цель отгадать слово из: " + word.length() + " букв");
        while (!encondingWord.toString().equals(word) || wrongs == MAX_WRONGS) {
            System.out.println("У вас осталось " + (MAX_WRONGS - wrongs) + " ошибок");
            System.out.println("Использованные буквы: " + used);
            System.out.println("Слово: " + encondingWord);

            System.out.println("Введите букву: ");
            String letter = scanner.next();
            letter = letter.toLowerCase();
            while (used.contains(letter) && letter.length() != 1) {
                System.out.print("Буква уже есть в слове. Возможно вы ввели больше, чем 1 букву. Попробуйте ещё раз: ");
                letter = scanner.next();
            }
            letter = letter.toUpperCase();
            used.add(letter);
            if (encondingWord.toString().contains(letter)) {
                System.out.println("Поздравляем, вы угадали эту букву!");
                char[] chs = encondingWord.toString().toCharArray();

            }
        }
    }



    public static void classArraysList() {
        ArrayList<Integer> speeds = new ArrayList<>();

        speeds.add (5);    //добавление элемента в конец списка
        speeds.add(0, 6);   //добавление элемента в нужную позицию

        speeds.remove(0);  //удалить элемент на позиции 0;
        speeds.remove(Integer.valueOf(9));  //удалить нужный элемент в списке

        speeds.clear();    //Очитить весь лист

        boolean a = speeds.isEmpty(); //возвращает true, если список пустой

        int b = speeds.size();   //возвращает размер списка

        int c = speeds.get(0);  //возвращает значение по заданому индексу

        boolean contains = speeds.contains(5);  //возвращает true, если удолось найти заданое значение

        int index = speeds.indexOf(666);   //возвращает индекс заданного элемента


    }
    public static void classArrays() {
        System.out.println("toString!");
        System.out.println();
        int []array = {1,2,3};
        String str = Arrays.toString(array);
        System.out.println(str);

        int [] array2 = {};
        String str2 = Arrays.toString(array2);
        System.out.println(str2);

        String[] array3 = {"Hello, how are you?"};
        String str3 = Arrays.toString(array3);
        System.out.println(str3);     //toString Method




        System.out.println("deepToString!");
        System.out.println();

        Integer[] array4 = {1,2,3};
        String str4 = Arrays.deepToString(array4);
        System.out.println(str4);

        int[][] array5 = {{1,2}, {3,6},{4,7}};
        String str5 = Arrays.deepToString(array5);
        System.out.println(str5);

        int[][][] array6 = {  {{1,2,3}, {5,6}}, {{}}  };
        String str6 = Arrays.deepToString(array6);
        System.out.println(str6);         //deepToString Method (for multi-arrays)



        int[] array7 = {2,5,2};
        int[] array8 = {2,5,2};
        boolean isEqual = Arrays.equals(array7,array8);

        String[] array9 = {"Hi, how are you?", "Fine"};
        String[] array10 = {"Hi, how are you?" ,"Fine"};
        boolean top = Arrays.equals(array9, array10);
        System.out.println(top);     //equals(arrays comparison)



        int [][] array11 = { {1,2,3}, {1,2,3} };
        int[][] array12 = { {1,2,3}, {1,2,3} };
        System.out.println(Arrays.deepEquals(array11, array12));   //deepEquals Method (for multi-arrays)



        int[] array13 = new int[10];
        Arrays.fill(array13, 2, 5, 99);
        System.out.println(Arrays.toString(array13));

        String[] array15 = new String[4];
        Arrays.fill(array15, "Hello");
        System.out.println(Arrays.toString(array15));      //fill (to fill an array with N values);




        int[] array16 = {5,7,32,57,5,6,6};
        System.out.println(Arrays.toString(array16));
        int[] array17 = Arrays.copyOf(array16, 7);
        System.out.println(Arrays.toString(array17));

        String[] array18 = {"Hi", "How", "Are", "You?"};
        System.out.println(Arrays.toString(array18));
        String[] array19 = Arrays.copyOf(array18, 4);
        System.out.println(Arrays.toString(array19));             //copyOf (to copy the array on another array)



        int [] array20 = {5,6,7,3,7,37,3,64,6};
        System.out.println(Arrays.toString(array20));
        int [] array21 = Arrays.copyOfRange(array20, 3, 7);
        System.out.println(Arrays.toString(array21));



        int[][] resultX = new int[2][];
        int[] arrayX = new int[]{1, 2, 3, 5, 4, 5, 6, 7, 8, 9, 10, 11};
        if (arrayX.length % 2 != 0) {
            resultX[0] = Arrays.copyOfRange(arrayX, 0, arrayX.length / 2 + 1);
            resultX[1] = Arrays.copyOfRange(arrayX, arrayX.length / 2 + 1, arrayX.length);
        }                                                                                             //copyOfRange task
        else {
            resultX[0] = Arrays.copyOfRange(arrayX, 0, arrayX.length / 2);
            resultX[1] = Arrays.copyOfRange(arrayX, arrayX.length / 2, arrayX.length);
        }
        System.out.println(Arrays.deepToString(resultX));



        int[] array22 = {5,6,3,78,2,-7,-5,-2};
        Arrays.sort(array22);
        System.out.println(Arrays.toString(array22));

        int[] array23 = {5,6,2,3,2,-5,7,2,-100};
        Arrays.sort(array23, 0,3);
        System.out.println(Arrays.toString(array23));        //Arrays.sort (По возрастанию)



        int[] array24 = {5,6,7,2,87,100,2,-5,5,6,7};
        Arrays.sort(array24);
        int index1 = Arrays.binarySearch(array24, 100);
        System.out.println(Arrays.toString(array24));
        System.out.println(index1);

    }
    public static void SecondsToDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter seconds to convert to days, hours and minutes: ");
        int seconds = scanner.nextInt();
        int secondsInMinute = 60;
        int secondsInHour = secondsInMinute * 60;
        int secondsInDay = secondsInHour * 24;

        int days = seconds / secondsInDay;
        int hours = (seconds % secondsInDay) / secondsInHour;
        int minutes = ((seconds % secondsInDay) % secondsInHour) / secondsInMinute;
        int leftSeconds = seconds - days * secondsInDay - hours * secondsInHour - minutes * secondsInMinute;

        System.out.println("Дано количество секунд: " + seconds);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);


    }



}