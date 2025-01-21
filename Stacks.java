import java.util.LinkedList;

public class Stacks{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        
        if (!list.isEmpty()) {
            list.removeFirst(); 
        }
        if (!list.isEmpty()) {
            list.removeLast();
        }

       
        System.out.println("Remaining elements:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
