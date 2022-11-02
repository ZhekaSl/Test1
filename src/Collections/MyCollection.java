package Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyCollection {
    private String[] array;
    private int size;

    public MyCollection() {
        this.array = new String[10];
        this.size = 0;
    }

    public void add(String s) {
        if (array.length == 10) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = s;
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else return "Индекс не найден!";
    }

    public void print() {
        if (size == 0) {
            System.out.println("Нет данных!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void clear () {
        for (int i = 0; i < size; i++) {
            remove(i);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCollection that)) return false;
        MyCollection fd = (MyCollection) o;
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(fd.array[i])) {
                result++;
            }
            else break;
        }
        return result == size;

    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }


    public static void main(String[] args) {
        MyCollection myCollection1 = new MyCollection();
        MyCollection myCollection2 = new MyCollection();

        myCollection1.add("Вася");
        myCollection1.add("Петя");
        myCollection1.add("Женя");
        myCollection1.add("Антон");
        myCollection1.print();
        System.out.println();
        myCollection2.add("Вася");
        myCollection2.add("Петя");
        myCollection2.add("Женяя");
        myCollection2.add("Антон");
        myCollection2.print();
        myCollection2.clear();
        myCollection2.print();
        System.out.println(myCollection2.getSize());
        ArrayList<Integer> arrad = new ArrayList<>();


    }
}
