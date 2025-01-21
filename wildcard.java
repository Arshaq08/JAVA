// import java.util.*;

// class Animal{
//     void fun(){
//         System.out.println("Animal is eating food");
//     }
// }
// class Dog extends Animal{
//     void fun(){
//         System.out.println("Dog is eating predigree");
//     }
// }
// class Cat extends Animal{
//     void fun(){
//         System.out.println("cat is eating fish");
//     }
// }
// class Rat{
//     void fun(){
//         System.out.println("Rat is eating  waste food");
//     }
// }
// public class wildcards {
//     public static void feed( List <? extends  Animal>list) {
//         for(Animal i:list){
//             i.fun();
//         }
//     }
//     public static void main(String[] args) {
//         ArrayList<Animal> animal =new ArrayList<>();
//         animal.add(new Animal());
//         animal.add(new Animal());
//         ArrayList<Dog> dog =new ArrayList<>();
//         dog.add(new Dog());
//         dog.add(new Dog());
//         ArrayList<Cat> cat =new ArrayList<>();
//         cat.add(new Cat());
//         cat.add(new Cat());
//         ArrayList<Rat> rat =new ArrayList<>();
//         rat.add(new Rat());
//         rat.add(new Rat());

//         feed(animal);
//         feed(dog);
//         feed(cat);
//     }
// }
import java.util.*;
class Animal {
    void eat (){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void eat (){
        System.out.println("Dog is eating");
    }
}
class Cat  extends Animal{
    void eat (){
        System.out.println("Cat is eating");
    }
}
class Rat {
    void eat (){
        System.out.println("Rat is eating");
    }
}
public class wildcard {
    public static void feed(List<? extends Animal>list)
    {
        for(Animal i:list)
        {
            i.eat();
        }
    }
    public static void feedlower(List<? super Cat>list)
    {
        for(Object i:list)
        {
            ((Animal)i).eat();
        }
    }



    public static void main(String[] args) {
        ArrayList<Animal> animal =new ArrayList<>();
        animal.add(new Animal());
        animal.add(new Animal());

        ArrayList<Dog> dog =new ArrayList<>();
        dog.add(new Dog());
        dog.add(new Dog());

        ArrayList<Cat> cat =new ArrayList<>();
        cat.add(new Cat());
        cat.add(new Cat());

        ArrayList<Rat> rat =new ArrayList<>();
        rat.add(new Rat());
        rat.add(new Rat());

        feed(animal);
        feed(dog);
        feed(cat);
       // feed(rat);
       feedlower(animal);
     //  feedlower(dog);
       feedlower(cat);

    }
    
}