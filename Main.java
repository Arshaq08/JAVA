public class Main {
    public static void main(String[] args) {
        // Test input string
        String inputString = "hello";
        
        StringBuilder uppercaseResult = new StringBuilder();
        StringBuilder lowercaseResult = new StringBuilder();
        
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 == 0) {
                // Convert character at even index to uppercase for uppercaseResult
                uppercaseResult.append(Character.toUpperCase(inputString.charAt(i)));
                // Keep character at even index as is for lowercaseResult
                lowercaseResult.append(inputString.charAt(i));
            } else {
                // Keep character at odd index as is for uppercaseResult
                uppercaseResult.append(inputString.charAt(i));
                // Convert character at odd index to lowercase for lowercaseResult
                lowercaseResult.append(Character.toLowerCase(inputString.charAt(i)));
            }
        }
        
        // Output the results
        System.out.println("Uppercase Operation Result: " + uppercaseResult);
        System.out.println("Lowercase Operation Result: " + lowercaseResult);
    }
}
