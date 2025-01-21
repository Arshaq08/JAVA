package nestedclass.java;
class A{
    void func(){
        class Mukesh{
            void mukeshfun(){
                System.out.println("Hello mukesh");
            }
        }
        Mukesh obj=new Mukesh();
        obj.mukeshfun();

    }

}
public class nested{
    public static void main(String[] args){
        A obj =new A();
        obj.func();
    }
}
