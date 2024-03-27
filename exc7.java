class NestingTry {
  public static void main(String args[]) {
    //main try-block
    try {
      //try-block2
      try {
        //try-block3
        try {
          int arr[] = {
            10,
            20,
            30,
            40
          };
         
          System.out.println(arr[10]);
        } catch (ArithmeticException e) {
          System.out.print("Arithmetic Exception");
          System.out.println(" handled in try-block3");
        }
      } catch (ArithmeticException e) {
        System.out.print("Arithmetic Exception");
        System.out.println(" handled in try-block2");
      }
    } catch (ArithmeticException e3) {
      System.out.print("Arithmetic Exception");
      System.out.println(" handled in main try-block");
    } catch (ArrayIndexOutOfBoundsException e4) {
      System.out.print("ArrayIndexOutOfBoundsException");
      System.out.println(" handled in main try-block");
    } catch (Exception e5) {
      System.out.print("Exception");
      System.out.println(" handled in main try-block");
    }
  }
}
