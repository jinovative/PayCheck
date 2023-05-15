package pack;
import java.text.DecimalFormat;

public class PayCheck {
  // A PayCheck constructor that takes the employee name, rate, and hours worked
  // as parameters and calculates (and stores) the total pay for the week.
  private final String employeeName;
  private final double rate;
  private final double hoursWorked;

  public PayCheck(String employeeName, double rate, double hoursWorked) {
    this.employeeName = employeeName;
    this.rate = rate;
    this.hoursWorked = hoursWorked;
  }

  public double getTotalPay() {
    double total;
    if (hoursWorked >= 40) {
      total = rate * hoursWorked;
    } else {
      double overtime = hoursWorked - 40;
      total = (40 * rate) +(overtime * rate * 1.5);
    }
    return total;
  }

  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("$#.##");
    return decimalFormat.format(getTotalPay());
  }
}


// A toString method for BOTH classes, allowing Employee objects
// to be represented by the employee name, and PayCheck objects by the totalPay
// (in proper dollars/cents $xxx.yy format).
