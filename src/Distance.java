import java.util.Scanner;

public class Distance {
    public static void main(String[] args)
    {
        //Calculate distance

            System.out.println("Enter the value of x and y");
            Scanner sc=new Scanner(System.in);
            int xCoordinate= sc.nextInt();
            int yCoordinate=sc.nextInt();
            System.out.println("X Coordinate:"+xCoordinate);
            System.out.println("Y Cordinate:"+yCoordinate);
            double  distance;
            distance=Math.sqrt((xCoordinate)*(xCoordinate) + (yCoordinate)*(yCoordinate));
            System.out.println("Distance is:"+distance);
        }
    }

