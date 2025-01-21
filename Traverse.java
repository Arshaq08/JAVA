// import java.util.HashMap;
// import java.util.Map;

// public class Traverse {
//     public static void main(String[] args) {
//         HashMap<String,Integer>map=new HashMap<>();
//         map.put("Vishal",10);
//         map.put("Akash",20);
//         map.put("Sachin",30);

//         for(Map.Entry<String,Integer>e:map.entrySet())
//         System.out.println("Key: "+e.getKey()+" Value "+ e.getValue());

//     }
// }
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// public class Traverse {
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter number of entries:");
//         int numberOfEntries = Integer.parseInt(scanner.nextLine());  

//         for (int i = 0; i < numberOfEntries; i++) {
//             System.out.println("Enter name for entry " + (i + 1) + ":");
//             String name = scanner.nextLine();  

//             System.out.println("Enter value for " + name + ":");
//             int value = Integer.parseInt(scanner.nextLine());  
//             map.put(name, value); 
//         }

        
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//         }

//         scanner.close();  
//     }
// }

// import java.util.TreeSet;
// public class Traverse{
//     public static void main(String[] args) {
//       TreeSet<Integer>obj=new TreeSet<>();
//       obj.add(10);
//       obj.add(1000);
//       obj.add(5);
//       obj.add(500);
//       obj.add(50);
//       obj.add(100);
//       obj.add(10);
//       obj.remove(10);
//       System.out.println(obj);
//     }
// }
import java.util.TreeSet;

public class Traverse {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(10);
        obj.add(1000);
        obj.add(5);
        obj.add(500);
        obj.add(50);
        obj.add(100);
        obj.add(10);  
        obj.remove(10);  

        
        Integer largest = obj.pollLast();  
        System.out.println("Largest element removed: " + largest);

        
        System.out.println(obj);
    }
}
