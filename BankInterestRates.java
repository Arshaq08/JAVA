import java.util.Scanner;

class RBI {  // Base class for banks
    void ROI() {
        System.out.println("---------RBI-----------");  // Existing functionality
    }
}

class SBI extends RBI {
    void ROI() {
        float interestRate = 8.8F;
        System.out.println("---SBI----");
        System.out.println("Rate of interest of SBI: " + interestRate);
    }
}

class PNB extends RBI {
    void ROI() {
        float interestRate = 9.3F;
        System.out.println("---PNB----");
        System.out.println("Rate of interest of PNB: " + interestRate);
    }
}

class HDFC extends RBI {
    void ROI() {  // Correction: Missing a colon (:) after the method declaration
        float interestRate = 4.2F;
        System.out.println("---HDFC----");
        System.out.println("Rate of interest of HDFC: " + interestRate);
    }
}

class ICICI extends RBI {
    void ROI() {
        float interestRate = 7.6F;
        System.out.println("---ICICI----");
        System.out.println("Rate of interest of ICICI: " + interestRate);
    }
}

class HelloWorld { // Maintains the original class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bank code (1 - SBI, 2 - PNB, 3 - HDFC, 4 - ICICI): ");
        int bankCode = sc.nextInt();

        RBI bank; // Declare a reference variable of type RBI

        switch (bankCode) {
            case 1:
                bank = new SBI();
                break;
            case 2:
                bank = new PNB();
                break;
            case 3:
                bank = new HDFC();
                break;
            case 4:
                bank = new ICICI();
                break;
            default:
                System.out.println("Invalid bank code entered.");
                bank = null; // Set bank to null for invalid code
        }

        if (bank != null) { // Check if a valid bank was selected
            bank.ROI();
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
