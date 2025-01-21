public class Calculator<T extends Number> {
    private T value;

    public Calculator(T value) {
        this.value = value;
    }

    public T add(T other) {
        return convert(value.doubleValue() + other.doubleValue());
    }

    public T subtract(T other) {
        return convert(value.doubleValue() - other.doubleValue());
    }

    public T multiply(T other) {
        return convert(value.doubleValue() * other.doubleValue());
    }

    public T divide(T other) {
        if (other.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return convert(value.doubleValue() / other.doubleValue());
    }

    // Helper method to convert a double back to T
    @SuppressWarnings("unchecked")
    private T convert(double value) {
        if (this.value instanceof Integer) {
            return (T) Integer.valueOf((int) value);
        } else if (this.value instanceof Double) {
            return (T) Double.valueOf(value);
        } else if (this.value instanceof Float) {
            return (T) Float.valueOf((float) value);
        } else if (this.value instanceof Long) {
            return (T) Long.valueOf((long) value);
        } else {
            throw new IllegalArgumentException("Unsupported number type.");
        }
    }
}

public class cal {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<>(5);
        System.out.println("Integer Addition: " + intCalculator.add(2)); // 7
        System.out.println("Integer Multiplication: " + intCalculator.multiply(3)); // 15

        Calculator<Double> doubleCalculator = new Calculator<>(5.5);
    }
}

