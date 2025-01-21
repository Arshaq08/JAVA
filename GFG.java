

// import java.util.*;


// class Student{
//     int rollno;
//     String name, address;
//     public Student(int rollno,String name,String address){
//         this.rollno = rollno;
//         this.name = name;
//         this.address = address;
//     }
//     public String toString(){
//         return this.rollno + " " + this.name + " " + this.address;
//     }
// }

// class Sortbyroll implements Comparator<Student>{
//     public int compare(Student a,Student b){
//         return a.rollno - b.rollno;
//     }
// }

// class Sortbyname implements Comparator<Student>{
//     public int compare(Student a,Student b){
//         return a.name.compareTo(b.name);
//     }
// }

// public class GFG {
//     public static void main(String[] args) {
//         ArrayList<Student> ar = new ArrayList<Student>();
//         ar.add(new Student(111, "Rahul", "London"));
//         ar.add(new Student(131, "Anshul", "NYC"));
//         ar.add(new Student(121, "Solanki", "Jaipur"));
//         ar.add(new Student(101, "Aggarwal", "Hongkong"));

//         System.out.println("Unsorted");
//         for(int i=0;i<ar.size();i++){
//             System.out.println(ar.get(i));
//         }

//         Collections.sort(ar, new Sortbyroll());
//         System.out.println("\nSorted by Roll No");

//         for(int i=0;i<ar.size();i++){
//             System.out.println(ar.get(i));
//         }

//         Collections.sort(ar,new Sortbyname());
//         System.out.println("\nSorted by name");

//         for(int i=0;i<ar.size();i++){
//             System.out.println(ar.get(i));
//         }
//     }
// }
// import java.util.*;

// class Student {
//     int rollno;
//     String name, address;

//     public Student(int rollno, String name, String address) {
//         this.rollno = rollno;
//         this.name = name;
//         this.address = address;
//     }

//     public String toString() {
//         return this.rollno + " " + this.name + " " + this.address;
//     }
// }

// class Sortbyroll implements Comparator<Student> {
//     public int compare(Student a, Student b) {
//         return a.rollno - b.rollno;
//     }
// }

// class Sortbyname implements Comparator<Student> {
//     public int compare(Student a, Student b) {
//         return a.name.compareTo(b.name);
//     }
// }

// class Sortbyaddress implements Comparator<Student> {
//     public int compare(Student a, Student b) {
//         return a.address.compareTo(b.address);
//     }
// }

// public class GFG {
//     public static void main(String[] args) {
//         ArrayList<Student> ar = new ArrayList<Student>();
//         ar.add(new Student(111, "Rahul", "London"));
//         ar.add(new Student(131, "Anshul", "NYC"));
//         ar.add(new Student(121, "Solanki", "Jaipur"));
//         ar.add(new Student(101, "Aggarwal", "Hongkong"));

//         System.out.println("Unsorted");
//         for (Student s : ar) {
//             System.out.println(s);
//         }

//         Collections.sort(ar, new Sortbyroll());
//         System.out.println("\nSorted by Roll No");
//         for (Student s : ar) {
//             System.out.println(s);
//         }

//         Collections.sort(ar, new Sortbyname());
//         System.out.println("\nSorted by Name");
//         for (Student s : ar) {
//             System.out.println(s);
//         }

//         Collections.sort(ar, new Sortbyaddress());
//         System.out.println("\nSorted by Address");
//         for (Student s : ar) {
//             System.out.println(s);
//         }
//     }
// }
import java.util.*;

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class Sortbyaddress implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.address.compareTo(b.address);
    }
}

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> ar = new ArrayList<Student>();

        System.out.print("Enter the number of students: ");
        int n = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                n = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.nextLine(); // discard non-integer input
            }
        }
        scanner.nextLine(); // consume newline after number

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int roll = 0;
            while (true) {
                try {
                    roll = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a number for roll number: ");
                    scanner.nextLine(); // discard non-integer input
                }
            }

            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter address for student " + (i + 1) + ": ");
            String address = scanner.nextLine();

            ar.add(new Student(roll, name, address));
        }

        System.out.println("Unsorted");
        for (Student s : ar) {
            System.out.println(s);
        }

        Collections.sort(ar, new Sortbyroll());
        System.out.println("\nSorted by Roll No");
        for (Student s : ar) {
            System.out.println(s);
        }

        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by Name");
        for (Student s : ar) {
            System.out.println(s);
        }

        Collections.sort(ar, new Sortbyaddress());
        System.out.println("\nSorted by Address");
        for (Student s : ar) {
            System.out.println(s);
        }

        scanner.close();
    }
}
