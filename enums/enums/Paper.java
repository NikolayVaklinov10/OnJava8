
package enums;
import static enums.Outcome.*;

public class Paper implements enums.Item {
  @Override public enums.Outcome compete(enums.Item it) {
    return it.eval(this);
  }
  @Override
  public enums.Outcome eval(Paper p) { return DRAW; }
  @Override
  public enums.Outcome eval(enums.Scissors s) { return WIN; }
  @Override
  public enums.Outcome eval(enums.Rock r) { return LOSE; }
  @Override public String toString() {
    return "Paper";
  }
}
