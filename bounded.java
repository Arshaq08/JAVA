// import java util.Scanner;

// class A<T extends Number>{
//     T a;
//     void fun(T b){
//         a=b;
//         System.out.println(a);
//     }
// }



// public class bounded {
//     public static void main(String[] args) {
//         A<Integer> obj =new A<>();
//         obj.fun(10);
//         A<Float> obj1=new A<>();
//         obj1.fun(1000.20F);

//     }
    
// }
import java.util.Scanner;

class A<T extends Number> {
    T a;

    void fun(T b) {
        a = b;
        System.out.println("Current value: " + a);
    }
    void add(T b) {
        double result = a.doubleValue() + b.doubleValue();
        System.out.println("Addition result: " + result);
    }
}

public class bounded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter an integer 1:");
        int intInput = scanner.nextInt();
        A<Integer> obj = new A<>();
        obj.fun(intInput);
        System.out.println("Enter integer 2:");
        int intToAdd = scanner.nextInt();
        obj.add(intToAdd);

        
        System.out.println("Enter a float 1:");
        float floatInput = scanner.nextFloat();
        A<Float> obj1 = new A<>();
        obj1.fun(floatInput);
        System.out.println("Enter  float 2:");
        float floatToAdd = scanner.nextFloat();
        obj1.add(floatToAdd);

        scanner.close();
    }
}
