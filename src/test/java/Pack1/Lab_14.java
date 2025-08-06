package Pack1;
	import java.time.ZoneId;
	import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;

	public class Lab_14 {

	    public static void CurrentDateTime(String zoneIdStr) {
	        try {
	  
	            ZoneId zoneId = ZoneId.of(zoneIdStr);
	            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
	            System.out.println("Current date and time in " + zoneIdStr + ": " + zonedDateTime.format(formatter));
	        } catch (Exception e) {
	            System.out.println("Invalid Zone ID: " + zoneIdStr);
	        }
	    }

	    public static void main(String[] args) {
	       
	        CurrentDateTime("America/New_York");
	        CurrentDateTime("Europe/London");
	        CurrentDateTime("Asia/Tokyo");
	        CurrentDateTime("US/Pacific");
	        CurrentDateTime("Africa/Cairo");
	        CurrentDateTime("Australia/Sydney");

}}
