package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class PayCalculator
{
    private static final int OVERTIME_THRESHOLD = 40;
    private double payAmount;
    private String EmployeeFullName;

    public PayCalculator(double payAmount, String EmployeeFullName)
    {
        this.payAmount = payAmount;
        this.EmployeeFullName = EmployeeFullName;
    }

    public double calculatePay(boolean salaried, int hours)
    {
        if (salaried)
        {
            return payAmount;
        }
        else
        {
            double total = hours * payAmount;

            if (hours > OVERTIME_THRESHOLD)
            {
                total += hours * (0.5 * payAmount);
            }

            return total;
        }
    }

    public void printEmployee()
    {
        System.out.println(EmployeeFullName);
    }

    @Override
    public String toString()
    {
        return "PayCalculator{" +
                "payAmount=" + payAmount +
                ", EmployeeFullName='" + EmployeeFullName + '\'' +
                '}';
    }
}