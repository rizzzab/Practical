public class IntegerExample {
    public static void main(String[] args) {
        int intValue = 10;
        
        Integer integerValue1 = new Integer(intValue); 
        Integer integerValue2 = Integer.valueOf(intValue); 
        
        \
        int intValue1 = integerValue1.intValue(); 
        int intValue2 = integerValue2; 
        
        System.out.println("intValue1: " + intValue1);
        System.out.println("intValue2: " + intValue2);
        
        // Parsing strings to Integer
        String numberStr = "20";
        Integer parsedInteger = Integer.parseInt(numberStr);
        System.out.println("Parsed Integer: " + parsedInteger);
    }
}
