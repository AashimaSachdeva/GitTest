import java.util.*;

class HeartRatesTest{

 public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); 
        HeartRates[] hr = new HeartRates[2];  // array defined and initialised

        for ( int counter=0 ; counter <2 ; counter++){
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter BirthDate: ");
         int day=input.nextInt();
         int month=input.nextInt();
         int year=input.nextInt();
 
        HeartRates hr1 = new HeartRates(firstName, lastName,day,month,year); 
        System.out.println("Name: "+ firstName +", " + lastName);
        System.out.println("Age in years: "+hr1.getAge());
        System.out.println("Maximum Heartrate: "+ hr1.maximumHeartRate());
        hr1.getBirthDate();   
        hr1.targetHeartRate();
    }
 
    }
}