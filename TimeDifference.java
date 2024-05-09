import java.util.Scanner;

public class TimeDifference {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide the start time: ");
    String startTime = scanner.nextLine();

    System.out.println("Please provide the end time: ");
    String endTime = scanner.nextLine();

    scanner.close();

   System.out.println("The remaining time is: " + calculateTime(startTime, endTime));
    
}

//method
public static String calculateTime(String startTime, String endTime){

   int startHour = Integer.parseInt(startTime.substring(0 , 2));
   int startMinute = Integer.parseInt(startTime.substring(3, 5));
   int startSecond = Integer.parseInt(startTime.substring(6,8));

   int endHour = Integer.parseInt(endTime.substring(0,2));
   int endMinute = Integer.parseInt(endTime.substring(3, 5));
   int endSecond = Integer.parseInt(endTime.substring(6, 8));

   //calculate the second of each time
   int totalSecondsStart = startHour * 3600 + startMinute * 60 + startSecond;
   int totalSecondsEnd = endHour * 3600 + endMinute * 60 + endSecond;

   int DifferenceSecond = totalSecondsEnd - totalSecondsStart;
   
   //convert the seconds into hours
   int remainingHours = DifferenceSecond / 3600; //divide to sec/hr 
   int remainingMinutes = DifferenceSecond % 3600 / 60;  //get the remaining sec from hrs to divide by 60 secs per min
   int remainingSeconds = DifferenceSecond % 60; // to get the remaining seconds from minutes


   // display the time
   String totalRemainingTime = remainingHours + ":" + remainingMinutes + ":" + remainingSeconds;

  return totalRemainingTime;
}   

}
