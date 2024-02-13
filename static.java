    public class StaticBlock1  
    {  
      
    // Constructor of the class StaticBlock1  
    StaticBlock1()   
    {  
    System.out.println("Inside the constructor of the class.");  
    }  
      
    // 1st static block  
    static  
    {  
    System.out.println("Inside the static block. - 1");   
    }  
      
    // foo() method of the StaticBlock class  
    public static void foo()   
    {  
    System.out.println("Inside the method foo.");  
    }  
      
    // 2nd static block  
    static  
    {  
    System.out.println("Inside the static block. - 2");   
    }  
      
    // 3rd static block  
    static  
    {  
    System.out.println("Inside the static block. - 3");   
    }  
      
    // main method  
    public static void main(String[] args)   
    {  
      
    // instantiating the class StaticBlock1  
    StaticBlock1 sbObj = new StaticBlock1();  
    sbObj.foo(); // invoking the foo() method  
      
    // invoking the constructor inside the main() method  
    new StaticBlock1();  
      
    }  
    }  
