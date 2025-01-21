// import java.util.*;


// public class generic {
//     public static void main(String[] args){
//         List<String> list1=new ArrayList<String>();
//         list1.add("HELLO");
//         list1.add('A');
//         list1.add(20);
//         list1.add(20.5);
        


//         String A=list1.get(0);
//         //or
//         //String A=(String) list1.get(0);
//     }
// }
// class A<T , U>{
//     T a;
//     U d;
//     void fun(T b,U c){
//         a=b;
//         d=c;
//         System.out.println(a+" "+c);
//     }
// }
// public class generic{
//     public static void main(String[] args) {
//         A<Integer,String> ob=new A<Integer,String>();
//         A<Integer,String> ob1=new A<Integer,String>();
//         ob.fun(20,"MUKESH");
//         ob1.fun(50,"HELLO");
//     }
// }
public class AverageCalculator<T extends Number> {
    
    public T calculateAverage(T[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("Data array cannot be empty");
        }

        double sum = 0.0;  
        for (T value : data) {
            sum += value.doubleValue();  
        }
        return (T) Double.valueOf(sum / data.length);
    }

    public static void main(String[] args) {
        AverageCalculator<Integer> intCalculator = new AverageCalculator<>();
        Integer[] intData = {1, 2, 3, 4};
        System.out.println("Integer average: " + intCalculator.calculateAverage(intData));

        AverageCalculator<Double> doubleCalculator = new AverageCalculator<>();
        Double[] doubleData = {1.5, 2.7, 3.9, 4.2};
        System.out.println("Double average: " + doubleCalculator.calculateAverage(doubleData));
    }
}
