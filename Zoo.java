import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Zoo
{
    private ArrayList<Bird> zooBird;
  public Zoo()
  {
      zooBird = new ArrayList<>();
      zooBird.add(new Bird("blue","blue jay",2));
      zooBird.add(new Bird("red","red cardinal",1));
      zooBird.add(new Bird("blue","red cardinal",1));
      zooBird.add(new Bird("red", "red cardinal",1));
      zooBird.add(new Bird("blue","red cardinal",1));
      zooBird.add(new Bird("blue","red cardinal",1));
      zooBird.add(new Bird("blue","red cardinal",1));
      zooBird.add(new Bird("red", "red cardinal",1));
      zooBird.add(new Bird("red", "red cardinal",1));
  }
  
  int countBlueBirds()
{  
      int countBlueBirds = 0;
      for(Bird b : zooBird){
          if (b.color().equals("blue")){
              countBlueBirds++;
          }
  }
  return countBlueBirds;
}
}