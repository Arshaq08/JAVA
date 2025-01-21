class Sharma extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello mahn!");
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print stack trace for debugging
            }
        }
    }
}

class Varma extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Heyyyy budddyyy!");
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print stack trace for debugging
            }
        }
    }
}

public class Print {
    public static void main(String[] args) {
        Sharma obj = new Sharma();
        Varma obj1 = new Varma();
        obj.start();
        obj1.start();
    }
}
