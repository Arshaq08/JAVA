
// import java.util.TreeSet;

// class MyClass implements Comparable<MyClass>{
//     private int value;
//     public MyClass(int value){
//         this.value=value;
//     }
//     public int getValue(){
//         return value;
//     }
//     public int compareTo(MyClass other){
//         return Integer.compare(this.value,other.value);
//     }

// }
// public class comparable {
//     public static void main(String[] args) {
//         TreeSet<MyClass>myTreeSet=new TreeSet<>();
//         myTreeSet.add(new MyClass(10));
//         myTreeSet.add(new MyClass(15));
//         myTreeSet.add(new MyClass(45));
//         System.out.println("Elements in TreeSet: ");
//         for(MyClass obj:myTreeSet){
//             System.out.println(obj.getValue());
//         }


//     }
// }
// import java.util.TreeSet;
// import java.util.ArrayList;

// class MyClass implements Comparable<MyClass> {
//     private int value;

//     public MyClass(int value) {
//         this.value = value;
//     }

//     public int getValue() {
//         return value;
//     }

//     public int compareTo(MyClass other) {
//         return Integer.compare(this.value, other.value);
//     }
// }

// public class comparable {
//     public static void main(String[] args) {
//         TreeSet<MyClass> myTreeSet = new TreeSet<>();
//         myTreeSet.add(new MyClass(100));
//         myTreeSet.add(new MyClass(115));
//         myTreeSet.add(new MyClass(45));

        
//        ArrayList<MyClass> myList = new ArrayList<>(myTreeSet);

//         System.out.println("Elements in TreeSet:");
//         for (MyClass obj : myTreeSet) {
//             System.out.println(obj.getValue());
//         }

//         System.out.println("\nElements in ArrayList:");
//         for (MyClass obj : myList) {
//             System.out.println(obj.getValue());
//         }
//     }
// }

