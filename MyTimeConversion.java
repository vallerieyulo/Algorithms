public class MyTimeConversion {



    public static String timeConversion(String s){

        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        String amPm = s.substring(8,10);

        String convertedTime = "";

        if (hour < 12 && amPm.equalsIgnoreCase("PM")){
            hour = hour + 12;
           
        }else if (hour == 12 & amPm.equalsIgnoreCase("AM")){
            hour = 0;
            
        }

        String convertedHour = String.format("%02d", hour);
        String convertedMinute = String.format("%02d", minute);
        String convertedSecond = String.format("%02d", second);


        convertedTime = convertedHour + ":" + convertedMinute + ":" + convertedSecond;

        return convertedTime;
    }






public static void main(String[] args) {
    
    String s = "13:23:32Pm";
    String convert = timeConversion(s);
    System.out.println("The converted time is: " + convert);
}


}
