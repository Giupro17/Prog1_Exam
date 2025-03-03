
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025;
    
    // public int getAge(int yearOfBirth){
        // age = currentYear - yearOfBirth;
        // if (age >= 16){
            // System.out.println("Able to drive");
        // }
        // else{
      // 16 - age = yearsToWait;
        // System.out.println("User has to wait," + yearsToWait + "years");
    // }
    
// }
  public int getAge(int yearOfBirth, int age){
   age = currentYear - yearOfBirth;
   int yearsToWait = 16 - age;
         if (age >= 16){
            System.out.println("Able to drive");
         }
         else{
            System.out.println("User has to wait," + yearsToWait + "years");
    }
    return yearsToWait;
 }
}