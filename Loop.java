public class Loop{
    public static void main(String[]args){
        int num[]={1,2,3,4,5,6,7,8,9,10};
        for(int i: num){
            if(i%2==0){
                System.out.println(i +" is even");
            }
            else{
                System.out.println(i +"is odd");
            }
        }
    }
}