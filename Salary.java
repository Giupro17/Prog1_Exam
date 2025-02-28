
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    /*
     * public int salary(int hours, int hourlyWage){
    hourlyWage * hours = salary;
    int taxes = 0.3;
    int deductions = salary * taxes;
    int netPay = salary - deductions;
    System.out.println("The net pay is:" + netPay);
    } 
     */
    
    
public double salary(int hourlyWage, int hours){
    double salary = hourlyWage * hours;
    double taxes = 0.3;
    double deductions = salary * taxes;
    double netPay = salary - deductions;
    System.out.println("The net pay is:" + netPay);
    return netPay;
    } 
}
