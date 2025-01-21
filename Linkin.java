


import java.util.LinkedList;

public class Linkin {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(500);
        numbers.add(30);
        numbers.add(70);
        numbers.add(100);
        numbers.add(25);

        int size = numbers.size();
        int middleIndex = size / 2; 
        if (size % 2 != 0) {
            middleIndex = (size - 1) / 2; 
        }

        numbers.remove(middleIndex); 

        System.out.println(numbers);
    }
}


