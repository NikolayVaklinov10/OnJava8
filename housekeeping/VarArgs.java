

class A {}

public class VarArgs {
  static void printArray(Object[] args) {
    for(Object obj : args)
      System.out.print(obj + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    printArray(new Object[]{
      47, (float) 3.14, 11.11});
    printArray(new Object[]{"one", "two", "three" });
    printArray(new Object[]{new A(), new A(), new A()});
  }
}
/* Output:
47 3.14 11.11
one two three
A@19e0bfd A@139a55 A@1db9742
*/
