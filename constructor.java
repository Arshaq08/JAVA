class construct {
    int num1;
    int num2;
    int num3;
    construct(int num1,int num2,int num3){
        if(num1 >num2 && num1>num3){
            System.out.println(num1);
        }
        else if(num2>num1 && num2 > num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }   
}
public class constructor{
    public static void main(){
        construct sc = new construct(25,50,32);
    }
}
