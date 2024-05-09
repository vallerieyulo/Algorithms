public class TimeConversion {

public static void main(String[] args) {
    
    String startTime = "11:20:34PM";
    timeConvert(startTime);
}

//method
public static void timeConvert(String startTime){

    int hour = Integer.parseInt(startTime.substring(0 , 2));
    int minute = Integer.parseInt(startTime.substring(3, 5));
    int second = Integer.parseInt(startTime.substring(6,8));
    String AmPm = startTime.substring(8, 10);



    //verify if the hour is AM
    if ((AmPm.equals("PM")) && hour !=12){
        hour += 12;
    } else if (AmPm.equals("AM") && hour ==12){
        hour = 0;
    }else if (AmPm == "AM" && hour != 12){
        System.out.println("It's still morning!");
    }

    String time24Hour = hour + ":" + minute + ":" + second;

    System.out.println("The converted 24-hour format for time is: " + time24Hour);

}


}
