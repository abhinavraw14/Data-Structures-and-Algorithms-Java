package ArrayProject;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How many days' temperature? ");
    int numDays = console.nextInt();

    int [] temps = new int [numDays];
    // record temperature and find average 
    int sum =0;
    for(int i=0; i<numDays; i++){
      System.out.print("Day " + (i + 1) + "'s high temp: " );
      temps[i] = console.nextInt();
      sum+=temps[i];
    }
    double average = sum / numDays;

    // count days above average temperature
    int above = 0;
    for(int i=0; i<temps.length; i++){
      if(temps[i] > average){
        above++;
      }
    }
    System.out.println();
    System.out.println("Average Temperature: " + average);
    System.out.println("Number of days above Average Temperature: " + above);

    
  }
  
}
