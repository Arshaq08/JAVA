// class A<M>{
//     M a;
//     void fun(M b){
//         a=b;
//         System.out.println(a);
//     }
// }



// public class generic {
//     public static void main(String[] args) {
//         A<Integer> obj=new A<>();
//         obj.fun(10);
//         A<String> obj1=new A<>();
//         obj1.fun("HELLO");
//         A<Float> obj2=new A<>();
//         obj2.fun(10.99F);
//         A<Double> obj3=new A<>();
//         obj3.fun(10.9);
        
//     }
// }
// class B<M,T>{
//       M k;
//       T s;
//       void func(M k,T s){
//         System.out.println(k+" "+s);
//       }
// }
// public class generic {
//     public static void main(String[] args) {
//         B<Integer,String> obj=new B<>();
//         obj.func(10,"HELLO");
//         B<String,Float> obj1=new B<>();
//         obj1.func("HELLO",10.5F);
       
//     }
// }

// interface A<T> {
//      Integer fun(T a);
    
// }
// public class generic implements A<Integer>{
//     public Integer fun(Integer a){
//         System.out.println(a);
//         return a;
//     }
//     public static void main(String[] args) {
//         generic obj=new generic();
//         obj.fun(10);
//     }
// }
interface A<T>{
    T fun(T a);
}
public class generic <T> implements A<T>{
    public T fun(T a){
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        generic<Integer> obj=new generic<>();
        obj.fun(10);
        generic<String> obj1=new generic<>();
        obj1.fun("MUKESH");
    }
}
