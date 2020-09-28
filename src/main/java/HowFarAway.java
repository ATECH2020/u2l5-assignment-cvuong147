import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
       double startLat;
       double startLong;
       double endLat;
       double endLong;
       double result;
 
       Scanner scanner = new Scanner(System.in);
 
       System.out.print("Enter the latitude of the starting location: ");
       startLat = scanner.nextDouble();
       System.out.print("Enter the longitude of the starting location: ");
       startLong = scanner.nextDouble();
       System.out.print("Enter the latitude of the ending location: ");
       endLat = scanner.nextDouble();
       System.out.print("Enter the longitude of the ending location: ");
       endLong = scanner.nextDouble();
 
       GeoLocation geo1 = new GeoLocation(startLat, startLong);
       GeoLocation geo2 = new GeoLocation(endLat, endLong);
      
       result = geo1.distanceFrom(geo2);
       System.out.print("The distance is " + result + " miles.");
    }
}