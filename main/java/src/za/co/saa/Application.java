import java.util.Scanner;

class Application{
        //Called Classes//
        static Passenger passenger = new Passenger();
        static Employee employee;
        static Airline airline = new Airline();
        static TellerMenu tellerMenu = new TellerMenu();
        static ManagerMenu managerMenu = new ManagerMenu();

//MULTIPLE PASSENGER BOOKING DETAILS IN ARRAYS//
static int bookingForNumberOfPeople = 0;
static String bookedPassengerFullNames [] = new String[0];
static String bookedPassengerEmails [] = new String[0];
static int bookedPassengerAges [] = new int [0];
static String bookedPassengerIdNumbers [] = new String[0];
//MULTIPLE PASSENGER BOOKING DETAILS IN ARRAYS//

//EMPLOYEES//
static String [] listOfTellers = {"WELDY","DERRICK", "TANYA", "MEIKIE"};
static int numberOfTellers = listOfTellers.length;
static String [] listOfManagers = {"LIHLE","DAVID"}; 
static int numberOfManagers = listOfManagers.length;
//EMPLOYEES//

public static void main(String [] args){
Scanner scan = new Scanner(System.in);
//Coding//
System.out.println("Hello, Welcome to the South African Airlines Application");

while(true){
System.out.println();
System.out.println("Are you a Teller or Manager?");
String typeOfEmployee = scan.nextLine();

        switch(typeOfEmployee.toUpperCase()) {

            case "TELLER":
employee = new Teller();
System.out.println();
System.out.println("Please login below");
//userNameLogin METHOD START//
tellerMenu.tellerUsernameLogin();
//userNameLogin METHOD LOGIN END//

//passwordLogin METHOD START//
tellerMenu.tellerPasswordLogin();
//passwordLogin METHOD END//

//TELLER OPTIONS START//
                while (true) {
		    System.out.println("Please pick an option to execute below");
                    System.out.println("Please pick the appropriate letter");
                    System.out.println("Teller Options:");
                    System.out.println("A. Book Passengers");
                    System.out.println("B. Check-in Passangers");
                    System.out.println("C. Cancel Booking");
                    System.out.println("D. Customer Refund");
                    System.out.println("E. Reschedule Passenger bookings");
                    String tellerOptionPick = scan.nextLine();
		    System.out.println();

                    switch (tellerOptionPick.toUpperCase()) {
                        case "A":
			tellerMenu.tellerBookingOption();
                            break;

                        case "B":
			tellerMenu.passengerCheckInOption();
                            break;

                        case "C":
			tellerMenu.cancelBookingOption();
                            break;

                        case "D":
                            System.out.println("Please enter amount to refund");
                            int amountRefundable = scan.nextInt();
			    scan.nextLine();
                           System.out.println();
                            System.out.println("The amount is subject to a 35% penalty");
                            System.out.println("The amount refundable is: R" + Teller.refundCalculation(amountRefundable));

                            while (true) {
                                System.out.println();
                                System.out.println("Would you like to continue? Y/N?");
                                String yesOrNo_22 = scan.nextLine();
                                if (yesOrNo_22.toUpperCase().equals("Y")) {
                                    System.out.println("Refund Complete!");
                                    break;
                                } else if (yesOrNo_22.toUpperCase().equals("N")) {
                                    System.out.println("Refund Cancelled!");
                                    break;
                                } else {
                                    System.out.println("You have entered an invalid option, please try again");
                                    continue;
                                }

                            }

                            break;

                        case "E":
               		tellerMenu.reschedulePassengerFlightOption();
                            break;
                    }

//END OF PROGRAM//
System.out.println();
System.out.println("Would you like to perform another action? Y/N?");
String yesOrNo_50 = scan.nextLine();
        if(yesOrNo_50.equalsIgnoreCase("Y")){
        System.out.println();
        continue;
} else {
        System.out.println("Thank you for flying South African Airlines");
        break;
}
//END OF PROGRAM//

}

                    break;//case "TELLER" break

                    case "MANAGER":
employee = new Manager();
System.out.println();
System.out.println("Please login below");

managerMenu.usernameLogin();

managerMenu.passwordLogin();

                        while (true) {
                            System.out.println();
                            System.out.println("Please pick an option to execute below");
                            System.out.println("Please pick the appropriate letter");
                            System.out.println("Manager Options:");
                            System.out.println("A. Add new aircraft destination");
                            System.out.println("B. Add new employee");
                            System.out.println("C. Cancel booking");
                            System.out.println("D. Reschedule passengers booking");
                                String managerOptionPick = scan.nextLine();
                            switch (managerOptionPick.toUpperCase()) {
                                case "A":
				managerMenu.addAircraftDestination();
                                   break;

                                case "B":
				managerMenu.addEmployee();
                                    break;

                                case "C":
				managerMenu.cancelBooking();
                                    break;

                                case "D":
				managerMenu.rescheduleBooking();
				    break;
			           }
//END OF PROGRAM//
System.out.println();
System.out.println("Would you like to perform another action? Y/N?");
String yesOrNo_50 = scan.nextLine();
        if(yesOrNo_50.equalsIgnoreCase("Y")){
        System.out.println();
        continue;
} else {
        System.out.println("Thank you for flying South African Airlines");
        break;
}
//END OF PROGRAM//

                            }//loop

			break;//case "TELLER" break

                        }//main switch
//ReLogIn start//
System.out.println();
System.out.println("Would you like to re-login? Y/N");
String reLogin = scan.nextLine();
if(reLogin.toUpperCase().equals("Y")){
 continue;
} else {
 break;
}
//ReLogin end//
		    }

		}//main method
	}//class
