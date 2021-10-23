
package enums;
import static enums.SpicinessEnum.*;

public class Burrito2 {
  enums.SpicinessEnum degree;
  public Burrito2(enums.SpicinessEnum degree) {
    this.degree = degree;
  }
  @Override public String toString() {
    return "Burrito is "+ degree;
  }
  public static void main(String[] args) {
    System.out.println(new Burrito2(NOT));
    System.out.println(new Burrito2(MEDIUM));
    System.out.println(new Burrito2(HOT));
  }
}
/* Output:
Burrito is NOT
Burrito is MEDIUM
Burrito is HOT
*/
