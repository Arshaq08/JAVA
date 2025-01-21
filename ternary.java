public class ternary{
    public static void main(String[]args){
        int a=10;
        int b=20;
        int c=30;

        int d=(a>b)&&(b>c)?a:(b>a)&&(b>c)?b:c;
        System.out.println("THE VALUE"+" " +d);
        

    }
}