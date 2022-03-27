import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

class TellerMenu{
Scanner scan = new Scanner(System.in);

//USERNAME LOGIN START//
public void tellerUsernameLogin(){
		while (true) {
                    System.out.println();
                    System.out.println("Please enter your name");
                    String userName = scan.nextLine();
                    Application.employee.setName(userName);
                    Application.employee.userNameLogin(userName);

                    if (Application.employee.attempts > 0 && Application.employee.stopIfStatement == 25) {

                        System.out.println("The Username you have entered is incorrect");
                        System.out.println("Please enter the correct username");
                        System.out.println("You have " + Application.employee.attempts + " of 3 attempts left");
                        --Application.employee.attempts;
                        Application.employee.nameCheck = null;
                        Application.employee.count = 0;
                        Application.employee.stopIfStatement = 0;
                        continue;

                    } else if (Application.employee.attempts == 0 && Application.employee.stopIfStatement == 25) {
                        System.out.println("You have no more attempts left");
                        System.out.println("The System has been blocked");
                        System.exit(0);

                    } else if (userName.toUpperCase().equals(Application.employee.nameCheck.toUpperCase())) {

                        break;
                    }

                    scan.nextLine();
                }
}
//TELLER USERNAME LOGIN END//

//TELLER PASSWORD LOGIN START//
public void tellerPasswordLogin(){
                while (true) {
                    System.out.println();
                    System.out.println(Application.employee.getName().toLowerCase() + " please enter your password");
                    String password = scan.nextLine();
                    Application.employee.passwordLogin(password);

                    if (password.startsWith("T") && password.contains("0777")) {

                        System.out.println("Welcome " + Application.employee.getName().toLowerCase());
                        System.out.println();
                        break;

                    } else if (Application.employee.attempts2 == 0) {

                        System.out.println("You have entered the incorrect password multiple times");
                        System.out.println("You have been blocked out of the system");
                        System.exit(0);

                    } else {
                        System.out.println("You have " + Application.employee.attempts2 + " of 3 attempts left");
                        System.out.println("Please try again");
                        --Application.employee.attempts2;
                        continue;


                    }

                }

}
//TELLER PASSWORD LOGIN END//

//BOOK PASSENGERS OPTION START//
String passengerDestination;
public void tellerBookingOption(){
                            System.out.println("Please enter passenger destination");
                            System.out.println("A. Cape Town");
                            System.out.println("B. Durban");
                            System.out.println("C. Johannesburg");
                            System.out.println("Please enter the appropriate letter");
                            String destinationPick = scan.nextLine();
if(destinationPick.equalsIgnoreCase("A")){
passengerDestination = "Cape Town";
} else if(destinationPick.equalsIgnoreCase("B")){
passengerDestination = "Durban";
} else if(destinationPick.equalsIgnoreCase("C")){
passengerDestination = "Johannesburg";
} 
                            System.out.println();
                            System.out.println("How many passengers would you like to book for?");
                            while (true) {
                                int numberOfPassengers = scan.nextInt();
                                Application.bookingForNumberOfPeople = numberOfPassengers;
                                if (numberOfPassengers > 5) {
                                    System.out.println("You are not allowed booking more then 5 people at once");
                                    continue;
                                } else {

                                    break;
                                }

                            }

                            int priceOfFlight = 0;
                            if (destinationPick.toUpperCase().equals("A")) {
                                priceOfFlight = Application.airline.capeTownPrice * Application.bookingForNumberOfPeople;
                                System.out.println("The price of the flight to Cape Town is R" + priceOfFlight);
                            } else if (destinationPick.toUpperCase().equals("B")) {
                                priceOfFlight = Application.airline.durbanPrice * Application.bookingForNumberOfPeople;
                                System.out.println("The price of the flight to Durban is R" + priceOfFlight);
                            } else if (destinationPick.toUpperCase().equals("C")) {
                                priceOfFlight = Application.airline.johannesburgPrice * Application.bookingForNumberOfPeople;
                                System.out.println("The price of the flight to Johannesburg is R" + priceOfFlight);
                            }
                            scan.nextLine();
                            System.out.println("Would you like to continue? Y/N?");
                            String yesOrNo = scan.nextLine();
                            if (yesOrNo.toUpperCase().equals("N")) {
                                System.out.println("Thank you for flying SAA");
                                System.exit(0);
                            }

                            if (Application.bookingForNumberOfPeople == 1) {
                                while (true) {
                                    System.out.println("Please Enter passenger name");
                                    String passengerName = scan.nextLine();
                                    Application.passenger.setName(passengerName);
                                    System.out.println();
                                    System.out.println("Please Enter passenger surname");
                                    String passengerSurname = scan.nextLine();
                                    Application.passenger.setSurname(passengerSurname);
                                    System.out.println();
                                    System.out.println("Please Enter Passenger age");
                                    int passengerAge = scan.nextInt();
                                    scan.nextLine();
                                    Application.passenger.setAge(passengerAge);
                                    System.out.println();
                                    System.out.println("Please enter passenger ID number");
                                    String passengerIdNumber = scan.nextLine();
                                    Application.passenger.setIdNumber(passengerIdNumber);
                                    System.out.println();
                                    System.out.println("Please enter passenger E-mail");
                                    String passengerEmail = scan.nextLine();
                                    Application.passenger.setEmail(passengerEmail);
                                    System.out.println();
                                    System.out.println("Please double check your information");
                                    System.out.println(Application.passenger.getName());
                                    System.out.println(Application.passenger.getSurname());
                                    System.out.println(Application.passenger.getAge());
                                    System.out.println(Application.passenger.getIdNumber());
                                    System.out.println(Application.passenger.getEmail());
                                    System.out.println();
                                    System.out.println("Continue? Y/N?");
                                    String yesOrNo_2 = scan.nextLine();
                                    if (yesOrNo_2.toUpperCase().equals("Y")) {
                                       System.out.println("Passenger has been booked");
				       System.out.println();
				       System.out.println("Reciept:");
				       System.out.println("Name: " + Application.passenger.getName());
                                       System.out.println("Surname: " + Application.passenger.getSurname());
                                       System.out.println("Age: " + Application.passenger.getAge());
                                       System.out.println("ID number: " + Application.passenger.getIdNumber());
                                       System.out.println("E-mail: " + Application.passenger.getEmail());
				       System.out.println("Destination: " + passengerDestination.toUpperCase()); 
				       System.out.println("Amount paid: R" + priceOfFlight);
                                        break;
                                    } else if (!(yesOrNo_2.toUpperCase().equals("Y")) && !(yesOrNo_2.toUpperCase().equals("N"))) {
                                        System.out.println("Please re-enter passenger iformation");
                                        System.out.println();
                                        continue;
                                    } else if (yesOrNo_2.toUpperCase().equals("N")) {
                                        System.out.println("Action Cancelled");
                                        break;
                                    }
                                }

                           } else if (Application.bookingForNumberOfPeople > 1) {

                                if (Application.bookingForNumberOfPeople == 2) {
                                Application.bookedPassengerFullNames = new String[2];
                                Application.bookedPassengerAges = new int[2];
                                Application.bookedPassengerEmails = new String[2];
                                Application.bookedPassengerIdNumbers = new String[2];
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter first passenger name and surname");
                                        String passengerFullNames_1 = scan.nextLine();
                                        Application.bookedPassengerFullNames[0] = passengerFullNames_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger age");
                                        int passengerAge_1 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[0] = passengerAge_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger Email");
                                        String passengerEmail_1 = scan.nextLine();
                                        Application.bookedPassengerEmails[0] = passengerEmail_1;
                                        System.out.println();
                                        System.out.println("Please enter first person ID number");
                                        String passengerIdNumber_1 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[0] = passengerIdNumber_1;
                                        System.out.println();
                                        System.out.println(passengerFullNames_1);
                                        System.out.println(passengerAge_1);
                                        System.out.println(passengerEmail_1);
                                        System.out.println(passengerIdNumber_1);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_4 = scan.nextLine();

                                        if (yesOrNo_4.toUpperCase().equals("Y")) {
                                        System.out.println("Passenger has been booked");
				        System.out.println();
				        System.out.println("Reciept:");
                                        System.out.println("Names: " + passengerFullNames_1);
                                        System.out.println("Age: " + passengerAge_1);
                                        System.out.println("ID number: " + passengerIdNumber_1);
                                        System.out.println("E-mail: " + passengerEmail_1);
                                        System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                        System.out.println("Amount paid: R" + priceOfFlight);

                                            break;
                                        } else if (yesOrNo_4 == "N") {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }


                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter second passenger name and surname");
                                        String passengerFullName_2 = scan.nextLine();
                                        Application.bookedPassengerFullNames[1] = passengerFullName_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger age");
                                        int passengerAge_2 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[1] = passengerAge_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger Email");
                                        String passengerEmail_2 = scan.nextLine();
                                        Application.bookedPassengerEmails[1] = passengerEmail_2;
                                        System.out.println();
                                        System.out.println("Please enter second person ID number");
                                        String passengerIdNumber_2 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[1] = passengerIdNumber_2;
                                        System.out.println();
                                        System.out.println(passengerFullName_2);
                                        System.out.println(passengerAge_2);
                                        System.out.println(passengerEmail_2);
                                        System.out.println(passengerIdNumber_2);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_5 = scan.nextLine();

                                        if (yesOrNo_5.toUpperCase().equals("Y")) {
                                        System.out.println("Passenger has been booked");
			                System.out.println();
                                        System.out.println("Reciept:");
                                        System.out.println("Names: " + passengerFullName_2);
                                        System.out.println("Age: " + passengerAge_2);
                                        System.out.println("ID number: " + passengerIdNumber_2);
                                        System.out.println("E-mail: " + passengerEmail_2);
                                        System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                        System.out.println("Amount paid: R" + priceOfFlight);

                                            break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }

                                } else if (Application.bookingForNumberOfPeople == 3) {
                                Application.bookedPassengerFullNames = new String[3];
                                Application.bookedPassengerAges = new int[3];
                                Application.bookedPassengerEmails = new String[3];
                                Application.bookedPassengerIdNumbers = new String[3];
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter first passenger name and surname");
                                        String passengerFullName_1 = scan.nextLine();
                                        Application.bookedPassengerFullNames[0] = passengerFullName_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger age");
                                        int passengerAge_1 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[0] = passengerAge_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger Email");
                                        String passengerEmail_1 = scan.nextLine();
                                        Application.bookedPassengerEmails[0] = passengerEmail_1;
                                        System.out.println();
                                        System.out.println("Please enter first person ID number");
                                        String passengerIdNumber_1 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[0] = passengerIdNumber_1;
                                        System.out.println();
                                        System.out.println(passengerFullName_1);
                                        System.out.println(passengerAge_1);
                                        System.out.println(passengerEmail_1);
                                        System.out.println(passengerIdNumber_1);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_6 = scan.nextLine();

                                        if (yesOrNo_6.toUpperCase().equals("Y")) {
                                        System.out.println("Passenger has been booked");
                                    	System.out.println();
                                    	System.out.println("Reciept:");
                                    	System.out.println("Names: " + passengerFullName_1);
                                    	System.out.println("Age: " + passengerAge_1);
                                    	System.out.println("ID number: " + passengerIdNumber_1);
                                    	System.out.println("E-mail: " + passengerEmail_1);
                                        System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                  	System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter second passenger name and surname");
                                        String passengerFullName_2 = scan.nextLine();
                                        Application.bookedPassengerFullNames[1] = passengerFullName_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger age");
                                        int passengerAge_2 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[1] = passengerAge_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger Email");
                                        String passengerEmail_2 = scan.nextLine();
                                        Application.bookedPassengerEmails[1] = passengerEmail_2;
                                        System.out.println();
                                        System.out.println("Please enter second person ID number");
                                        String passengerIdNumber_2 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[1] = passengerIdNumber_2;
                                        System.out.println();
                                        System.out.println(passengerFullName_2);
                                        System.out.println(passengerAge_2);
                                        System.out.println(passengerEmail_2);
                                        System.out.println(passengerIdNumber_2);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_7 = scan.nextLine();

                                        if (yesOrNo_7.toUpperCase().equals("Y")) {
                                           System.out.println("Passenger has been booked");
                                    	   System.out.println();
                                    	   System.out.println("Reciept:");
                                    	   System.out.println("Names: " + passengerFullName_2);
                                    	   System.out.println("Age: " + passengerAge_2);
                                    	   System.out.println("ID number: " + passengerIdNumber_2);
                                    	   System.out.println("E-mail: " + passengerEmail_2);
                                           System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                   	   System.out.println("Amount paid: R" + priceOfFlight);
                                                 break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter third passenger name and surname");
                                        String passengerFullName_3 = scan.nextLine();
                                        Application.bookedPassengerFullNames[2] = passengerFullName_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger age");
                                        int passengerAge_3 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[2] = passengerAge_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger Email");
                                        String passengerEmail_3 = scan.nextLine();
                                        Application.bookedPassengerEmails[2] = passengerEmail_3;
                                        System.out.println();
                                        System.out.println("Please enter third person ID number");
                                        String passengerIdNumber_3 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[2] = passengerIdNumber_3;
                                        System.out.println();
                                        System.out.println(passengerFullName_3);
                                        System.out.println(passengerAge_3);
                                        System.out.println(passengerEmail_3);
                                        System.out.println(passengerIdNumber_3);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_8 = scan.nextLine();

                                        if (yesOrNo_8.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
				    	    System.out.println();
                                     	    System.out.println("Reciept:");
                                    	    System.out.println("Names: " + passengerFullName_3);
                                    	    System.out.println("Age: " + passengerAge_3);
                                    	    System.out.println("ID number: " + passengerIdNumber_3);
                                    	    System.out.println("E-mail: " + passengerEmail_3);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                    	    System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }

                                } else if (Application.bookingForNumberOfPeople == 4) {
                                Application.bookedPassengerFullNames = new String[4];
                                Application.bookedPassengerAges = new int[4];
                                Application.bookedPassengerEmails = new String[4];
                                Application.bookedPassengerIdNumbers = new String[4];
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter first passenger name and surname");
                                        String passengerFullName_1 = scan.nextLine();
                                        Application.bookedPassengerFullNames[0] = passengerFullName_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger age");
                                        int passengerAge_1 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[0] = passengerAge_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger Email");
                                        String passengerEmail_1 = scan.nextLine();
                                        Application.bookedPassengerEmails[0] = passengerEmail_1;
                                        System.out.println();
                                        System.out.println("Please enter first person ID number");
                                        String passengerIdNumber_1 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[0] = passengerIdNumber_1;
                                        System.out.println();
                                        System.out.println(passengerFullName_1);
                                        System.out.println(passengerAge_1);
                                        System.out.println(passengerEmail_1);
                                        System.out.println(passengerIdNumber_1);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_9 = scan.nextLine();

                                        if (yesOrNo_9.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_1);
                                            System.out.println("Age: " + passengerAge_1);
                                            System.out.println("ID number: " + passengerIdNumber_1);
                                            System.out.println("E-mail: " + passengerEmail_1);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter second passenger name and surname");
                                        String passengerFullName_2 = scan.nextLine();
                                        Application.bookedPassengerFullNames[1] = passengerFullName_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger age");
                                        int passengerAge_2 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[1] = passengerAge_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger Email");
                                        String passengerEmail_2 = scan.nextLine();
                                        Application.bookedPassengerEmails[1] = passengerEmail_2;
                                        System.out.println();
                                        System.out.println("Please enter second person ID number");
                                        String passengerIdNumber_2 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[1] = passengerIdNumber_2;
                                        System.out.println();
                                        System.out.println(passengerFullName_2);
                                        System.out.println(passengerAge_2);
                                        System.out.println(passengerEmail_2);
                                        System.out.println(passengerIdNumber_2);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_10 = scan.nextLine();

                                        if (yesOrNo_10.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_2);
                                            System.out.println("Age: " + passengerAge_2);
                                            System.out.println("ID number: " + passengerIdNumber_2);
                                            System.out.println("E-mail: " + passengerEmail_2);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter third passenger name and surname");
                                        String passengerFullName_3 = scan.nextLine();
                                        Application.bookedPassengerFullNames[2] = passengerFullName_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger age");
                                        int passengerAge_3 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[2] = passengerAge_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger Email");
                                        String passengerEmail_3 = scan.nextLine();
                                        Application.bookedPassengerEmails[2] = passengerEmail_3;
                                        System.out.println();
                                        System.out.println("Please enter third person ID number");
                                        String passengerIdNumber_3 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[2] = passengerIdNumber_3;
                                        System.out.println();
                                        System.out.println(passengerFullName_3);
                                        System.out.println(passengerAge_3);
                                        System.out.println(passengerEmail_3);
                                        System.out.println(passengerIdNumber_3);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_11 = scan.nextLine();

                                        if (yesOrNo_11.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_3);
                                            System.out.println("Age: " + passengerAge_3);
                                            System.out.println("ID number: " + passengerIdNumber_3);
                                            System.out.println("E-mail: " + passengerEmail_3);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger name and surname");
                                        String passengerFullName_4 = scan.nextLine();
                                        Application.bookedPassengerFullNames[3] = passengerFullName_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger age");
                                        int passengerAge_4 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[3] = passengerAge_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger Email");
                                        String passengerEmail_4 = scan.nextLine();
                                        Application.bookedPassengerEmails[3] = passengerEmail_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth person ID number");
                                        String passengerIdNumber_4 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[3] = passengerIdNumber_4;
                                        System.out.println();
                                        System.out.println(passengerFullName_4);
                                        System.out.println(passengerAge_4);
                                        System.out.println(passengerEmail_4);
                                        System.out.println(passengerIdNumber_4);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_12 = scan.nextLine();

                                        if (yesOrNo_12.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_4);
                                            System.out.println("Age: " + passengerAge_4);
                                            System.out.println("ID number: " + passengerIdNumber_4);
                                            System.out.println("E-mail: " + passengerEmail_4);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }

                                } else if (Application.bookingForNumberOfPeople == 5) {
                                Application.bookedPassengerFullNames = new String[5];
                                Application.bookedPassengerAges = new int[5];
                                Application.bookedPassengerEmails = new String[5];
                                Application.bookedPassengerIdNumbers = new String[5];
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter first passenger name and surname");
                                        String passengerFullName_1 = scan.nextLine();
                                        Application.bookedPassengerFullNames[0] = passengerFullName_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger age");
                                        int passengerAge_1 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[0] = passengerAge_1;
                                        System.out.println();
                                        System.out.println("Please enter first passenger Email");
                                        String passengerEmail_1 = scan.nextLine();
                                        Application.bookedPassengerEmails[0] = passengerEmail_1;
                                        System.out.println();
                                        System.out.println("Please enter first person ID number");
                                        String passengerIdNumber_1 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[0] = passengerIdNumber_1;
                                        System.out.println();
                                        System.out.println(passengerFullName_1);
                                        System.out.println(passengerAge_1);
                                        System.out.println(passengerEmail_1);
                                        System.out.println(passengerIdNumber_1);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_13 = scan.nextLine();

                                        if (yesOrNo_13.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_1);
                                            System.out.println("Age: " + passengerAge_1);
                                            System.out.println("ID number: " + passengerIdNumber_1);
                                            System.out.println("E-mail: " + passengerEmail_1);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter second passenger name and surname");
                                        String passengerFullName_2 = scan.nextLine();
                                        Application.bookedPassengerFullNames[1] = passengerFullName_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger age");
                                        int passengerAge_2 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[1] = passengerAge_2;
                                        System.out.println();
                                        System.out.println("Please enter second passenger Email");
                                        String passengerEmail_2 = scan.nextLine();
                                        Application.bookedPassengerEmails[1] = passengerEmail_2;
                                        System.out.println();
                                        System.out.println("Please enter second person ID number");
                                        String passengerIdNumber_2 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[1] = passengerIdNumber_2;
                                        System.out.println();
                                        System.out.println(passengerFullName_2);
                                        System.out.println(passengerAge_2);
                                        System.out.println(passengerEmail_2);
                                        System.out.println(passengerIdNumber_2);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_14 = scan.nextLine();

                                        if (yesOrNo_14.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_2);
                                            System.out.println("Age: " + passengerAge_2);
                                            System.out.println("ID number: " + passengerIdNumber_2);
                                            System.out.println("E-mail: " + passengerEmail_2);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter third passenger name and surname");
                                        String passengerFullName_3 = scan.nextLine();
                                        Application.bookedPassengerFullNames[2] = passengerFullName_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger age");
                                        int passengerAge_3 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[2] = passengerAge_3;
                                        System.out.println();
                                        System.out.println("Please enter third passenger Email");
                                        String passengerEmail_3 = scan.nextLine();
                                        Application.bookedPassengerEmails[2] = passengerEmail_3;
                                        System.out.println();
                                        System.out.println("Please enter third person ID number");
                                        String passengerIdNumber_3 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[2] = passengerIdNumber_3;
                                        System.out.println();
                                        System.out.println(passengerFullName_3);
                                        System.out.println(passengerAge_3);
                                        System.out.println(passengerEmail_3);
                                        System.out.println(passengerIdNumber_3);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_15 = scan.nextLine();

                                        if (yesOrNo_15.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_3);
                                            System.out.println("Age: " + passengerAge_3);
                                            System.out.println("ID number: " + passengerIdNumber_3);
                                            System.out.println("E-mail: " + passengerEmail_3);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger name and surname");
                                        String passengerFullName_4 = scan.nextLine();
                                        Application.bookedPassengerFullNames[3] = passengerFullName_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger age");
                                        int passengerAge_4 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[3] = passengerAge_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth passenger Email");
                                        String passengerEmail_4 = scan.nextLine();
                                        Application.bookedPassengerEmails[3] = passengerEmail_4;
                                        System.out.println();
                                        System.out.println("Please enter fourth person ID number");
                                        String passengerIdNumber_4 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[3] = passengerIdNumber_4;
                                        System.out.println();
                                        System.out.println(passengerFullName_4);
                                        System.out.println(passengerAge_4);
                                        System.out.println(passengerEmail_4);
                                        System.out.println(passengerIdNumber_4);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_16 = scan.nextLine();

                                        if (yesOrNo_16.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_4);
                                            System.out.println("Age: " + passengerAge_4);
                                            System.out.println("ID number: " + passengerIdNumber_4);
                                            System.out.println("E-mail: " + passengerEmail_4);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }

                                    }
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter fifth passenger name and surname");
                                        String passengerFullName_5 = scan.nextLine();
                                        Application.bookedPassengerFullNames[4] = passengerFullName_5;
                                        System.out.println();
                                        System.out.println("Please enter fifth passenger age");
                                        int passengerAge_5 = scan.nextInt();
                                        scan.nextLine();
                                        Application.bookedPassengerAges[4] = passengerAge_5;
                                        System.out.println();
                                        System.out.println("Please enter fifth passenger Email");
                                        String passengerEmail_5 = scan.nextLine();
                                        Application.bookedPassengerEmails[4] = passengerEmail_5;
                                        System.out.println();
                                        System.out.println("Please enter fifth person ID number");
                                        String passengerIdNumber_5 = scan.nextLine();
                                        Application.bookedPassengerIdNumbers[4] = passengerIdNumber_5;
                                        System.out.println();
                                        System.out.println(passengerFullName_5);
                                        System.out.println(passengerAge_5);
                                        System.out.println(passengerEmail_5);
                                        System.out.println(passengerIdNumber_5);
                                        System.out.println("Is the above information correct? Y/N?");
                                        String yesOrNo_17 = scan.nextLine();

                                        if (yesOrNo_17.toUpperCase().equals("Y")) {
                                            System.out.println("Passenger has been booked");
                                            System.out.println();
                                            System.out.println("Reciept:");
                                            System.out.println("Names: " + passengerFullName_5);
                                            System.out.println("Age: " + passengerAge_5);
                                            System.out.println("ID number: " + passengerIdNumber_5);
                                            System.out.println("E-mail: " + passengerEmail_5);
                                            System.out.println("Destination: " + passengerDestination.toUpperCase()); 
                                            System.out.println("Amount paid: R" + priceOfFlight);

                                                break;
                                        } else {
                                            System.out.println("Please re-enter the information");
                                            System.out.println();
                                            continue;
                                        }
                                    }
                                }
			}
LocalDate dateOfBooking = LocalDate.now();
String formatedDate = dateOfBooking.format(DateTimeFormatter.ISO_DATE);
System.out.println("Date: " + formatedDate);
LocalTime lT = LocalTime.now();
System.out.println("Time: " + lT);
}
//BOOK PASSENGERS OPTION END//

//CHECK-IN PASSENGERS START//
public void passengerCheckInOption(){
                            while (true) {
                                int count = 0;
                                System.out.println("Please enter passenger name");
                                String passengerNameCheckIn = scan.nextLine();
                                System.out.println("Please enter passsenger ID number");
                                String passengerIdCheckIn = scan.nextLine();
                                if (!(passengerNameCheckIn.equalsIgnoreCase(Application.passenger.getName()) && passengerIdCheckIn.contains(Application.passenger.getIdNumber()))){
                                    System.out.println("The passenger you have entered is not available on the system");
                                    System.out.println("Would you like to re-enter details? Y/N?");
                                    String yesOrNo_30 = scan.nextLine();
                                    if (yesOrNo_30.toUpperCase().equals("Y")) {
                                        continue;
                                    } else {
                                        break;
                                    }

                                } else if (passengerNameCheckIn.equalsIgnoreCase(Application.passenger.getName()) && passengerIdCheckIn.contains(Application.passenger.getIdNumber())){
                                    System.out.println("The following passenger has been checked-in");
                                    System.out.println(Application.passenger.getName().toUpperCase());
                                    System.out.println(Application.passenger.getSurname().toUpperCase());
                                    System.out.println(Application.passenger.getAge());
                                    System.out.println(Application.passenger.getIdNumber());
                                } else {
                                    while (count < 6) {
                                        if (Application.bookedPassengerFullNames[count].equalsIgnoreCase(passengerNameCheckIn) && Application.bookedPassengerIdNumbers[count].contains(passengerIdCheckIn)){
                                            System.out.println("The following passenger has been checked-in");
                                            System.out.println(Application.bookedPassengerFullNames[count].toUpperCase());
                                            System.out.println(Application.bookedPassengerAges[count]);
                                            System.out.println(Application.bookedPassengerIdNumbers[count]);
                                            count = 0;
                                            break;
                                        } else {
                                            count++;
                                        }

                                    }

                                }
                                break;
                            }
System.out.println("Time of check-in:");
LocalDateTime timeOfCheckIn = LocalDateTime.now();
String formattedTimeOfCheckIn = timeOfCheckIn.format(DateTimeFormatter.ISO_DATE_TIME);
System.out.println(formattedTimeOfCheckIn);
}
//CHECK-IN PASSENGERS END//

//CANCEL BOOKING START//
public void cancelBookingOption(){
                           System.out.println("Please enter passenger name");
                            String passengerNameCancelBooking = scan.nextLine();
                            System.out.println();
                            System.out.println("Please enter passsenger ID number");
                            String passengerIdCancelBooking = scan.nextLine();
                            System.out.println();
try{
                            if (passengerNameCancelBooking.equalsIgnoreCase(Application.passenger.getName()) && passengerIdCancelBooking.contains(Application.passenger.getIdNumber())){
                                System.out.println("The following passenge will be removed off the system");
                                System.out.println(Application.passenger.getName());
                                System.out.println(Application.passenger.getSurname());
                                System.out.println(Application.passenger.getAge());
                                System.out.println(Application.passenger.getEmail());
                                System.out.println(Application.passenger.getIdNumber());
                                System.out.println();
                                    System.out.println("Would you like to continue? Y/N?");
                                    String yesOrNo_20 = scan.nextLine();

                                    if (yesOrNo_20.toUpperCase().equals("Y")) {
                                        Application.passenger.setName(null);
                                        Application.passenger.setSurname(null);
                                        Application.passenger.setAge(0);
                                        Application.passenger.setEmail(null);
                                        Application.passenger.setIdNumber(null);
                                        System.out.println("Passenger has been removed");
                                    } else if (yesOrNo_20.toUpperCase().equals("N")) {
                                        System.out.println("Action Cancelled");
                                    }

                           }
                        while(true){
                                int cancelBookingCount = 0;
                             if (passengerNameCancelBooking.equalsIgnoreCase(Application.bookedPassengerFullNames[cancelBookingCount]) && passengerIdCancelBooking.contains(Application.bookedPassengerIdNumbers[cancelBookingCount])){
                                    System.out.println("The following passenger will be removed off the system");
                                    System.out.println(Application.bookedPassengerFullNames[cancelBookingCount]);
                                    System.out.println(Application.bookedPassengerAges[cancelBookingCount]);
                                    System.out.println(Application.bookedPassengerIdNumbers[cancelBookingCount]);
                                    System.out.println(Application.bookedPassengerEmails[cancelBookingCount]);
                                        while (true) {
                                        System.out.println();
                                        System.out.println("Would you like to continue? Y/N?");
                                        String yesOrNo_21 = scan.nextLine();
                                        if (yesOrNo_21.toUpperCase().equals("Y")) {

                                            Application.bookedPassengerFullNames[cancelBookingCount] = null;
                                            Application.bookedPassengerAges[cancelBookingCount] = 0;
                                            Application.bookedPassengerIdNumbers[cancelBookingCount] = null;
                                            Application.bookedPassengerEmails[cancelBookingCount] = null;
                                            System.out.println();
                                            System.out.println("DONE");
                                            break;

                                        } else if (yesOrNo_21.toUpperCase().equals("N")) {

                                            System.out.println("Action Cancelled");
                                            break;
                                        } else {
                                            System.out.println("Invalid entry, please try again");
                                            continue;

                                        }

                                        }

                                } else if (cancelBookingCount > 5) {
                                    System.out.println("error: The details you have entered are not available on the system");
                                    break;
                                } else {

                                    cancelBookingCount++;
                                    continue;

                                }
                        break;
                                }
} catch (ArrayIndexOutOfBoundsException ex){
System.out.println("No Result(s)");
}

}
//CANCEL BOOKING END//

//RESCHEDULE OPTION START//
public void reschedulePassengerFlightOption(){
                            int rescheduleCount = 0;
                                System.out.println("Please enter passenger name");
                                String passengerNameReschedule = scan.nextLine();
                                System.out.println("Please enter passenger ID number");
                                String passengerIdReschedule = scan.nextLine();
try{
                                if (passengerNameReschedule.equalsIgnoreCase(Application.passenger.getName()) && passengerIdReschedule.contains(Application.passenger.getIdNumber())) {
                                    System.out.println("The following passenger will reschedule their flight:");
                                    System.out.println(Application.passenger.getName());
                                    System.out.println(Application.passenger.getSurname());
                                    System.out.println(Application.passenger.getAge());
                                    System.out.println(Application.passenger.getIdNumber());
                                    while (true) {
                                        System.out.println();
                                        System.out.println("Please enter passenger destination");
                                        String passengerDestinationReschedule = scan.nextLine();
                                        if (passengerDestinationReschedule.toUpperCase().equals("CAPE TOWN") || passengerDestinationReschedule.toUpperCase().equals("JOHANNESBURG") || passengerDestinationReschedule.toUpperCase().equals("DURBAN")) {
                                            System.out.println("Please Choose a month to reschedule your flight for");
                                            System.out.println("A. October");
                                            System.out.println("B. November");
                                            System.out.println("C. December");
                                            String monthPick = scan.nextLine();
                                            while (true) {
                                                System.out.println();
                                                System.out.println("Please enter date of the month");
                                                System.out.println("NOTE: SAA does not allow reschedules from the 28th day of the month forward");
                                                int DateOfMonth = scan.nextInt();
                                                scan.nextLine();
                                                if (monthPick.toUpperCase().equals("A") && (DateOfMonth > 0 && DateOfMonth < 28)) {
                                                    System.out.println("Flight for " + Application.passenger.getName() + " " + Application.passenger.getSurname() + " has been rescheduled to:");
                                                    System.out.println("October");
                                                    System.out.println(DateOfMonth);
                                                    break;
                                                } else if(monthPick.toUpperCase().equals("B") && (DateOfMonth > 0 && DateOfMonth < 28)){
                                                    System.out.println("Flight for " + Application.passenger.getName() + " " + Application.passenger.getSurname() + " has been rescheduled to:");
                                                    System.out.println("November");
                                                    System.out.println(DateOfMonth);
                                                    break;

                                                } else if(monthPick.toUpperCase().equals("C") && (DateOfMonth > 0 && DateOfMonth < 28)){
                                                    System.out.println("Flight for " + Application.passenger.getName() + " " + Application.passenger.getSurname() + " has been rescheduled to:");
                                                    System.out.println("December");
                                                    System.out.println(DateOfMonth);
                                                    break;

                                                } else {
                                                    continue;
                                                }

                                            }

                                            break;

                                        } else {
                                            System.out.println("Invalid destination, please try again");
                                            continue;
                                        }

                                    }

                                } else if (passengerNameReschedule.equalsIgnoreCase(Application.bookedPassengerFullNames[rescheduleCount]) && passengerIdReschedule.contains(Application.bookedPassengerIdNumbers[rescheduleCount])) {
                                    while (rescheduleCount < 6) {
                                        System.out.println("The following passenger will reschedule their flight:");
                                        System.out.println(Application.bookedPassengerFullNames[rescheduleCount]);
                                        while (true) {
                                            System.out.println();
                                            System.out.println("Please enter passenger destination");
                                            String passengerDestinationReschedule_1 = scan.nextLine();
                                            if (passengerDestinationReschedule_1.toUpperCase().equals("CAPE TOWN") || passengerDestinationReschedule_1.toUpperCase().equals("JOHANNESBURG") || passengerDestinationReschedule_1.toUpperCase().equals("DURBAN")) {
                                                System.out.println("Please Choose a month to reschedule your flight for");
                                                System.out.println("A. October");
                                                System.out.println("B. November");
                                                System.out.println("C. December");
                                                String monthPick_1 = scan.nextLine();
                                                while (true) {
                                                    System.out.println();
                                                    System.out.println("Please enter date of the month");
                                                    System.out.println("NOTE: SAA does not allow reschedules from the 28th day of the month forward");
                                                    int DateOfMonth_1 = scan.nextInt();
                                                    if (monthPick_1.toUpperCase().equals("A") || monthPick_1.toUpperCase().equals("B") || monthPick_1.toUpperCase().equals("C") && (DateOfMonth_1 > 0 && DateOfMonth_1 < 28)) {

                                                        System.out.println("Flight for " + Application.bookedPassengerFullNames[rescheduleCount] + " has been rescheduled to:");
                                                        System.out.println(monthPick_1);
                                                        System.out.println(DateOfMonth_1);
                                                        break;
                                                    } else {
                                                        System.out.println("Invalid details entered, please try again");
                                                        continue;
                                                    }

                                                }

                                                break;

                                            } else {
                                                System.out.println("Invalid destination, please try again");
                                                continue;
                                            }

                                        }
                                        rescheduleCount++;
                                    }
			      }
}catch(ArrayIndexOutOfBoundsException ex){
System.out.println("No Result(s)");
}

}
//RESCHEDULE OPTION END//

}
