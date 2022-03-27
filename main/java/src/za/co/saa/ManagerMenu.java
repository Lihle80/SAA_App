import java.util.Scanner;

class ManagerMenu{
 //Called Classes//
        Scanner scan = new Scanner(System.in);

//USERNAME LOGIN START//
public void usernameLogin(){
                        while (true) {
                            System.out.println();
                            System.out.println("Please enter your name");
                            String userName = scan.nextLine();
                            Application.employee.setName(userName);
                            Application.employee.userNameLogin(userName);

                            if (Application.employee.attempts > 0 && Application.employee.stopIfStatement == 25) {

                                System.out.println("The Username you have entered is incorrect");
                                System.out.println("Please enter the correct username");
                                System.out.println("You have " + Application.employee.attempts + " of 3 left");
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

                        }

}
//USERNAME LOGIN END//

//PASSWORD LOGIN START//
public void passwordLogin(){
                        while (true) {
                            System.out.println();
                            System.out.println(Application.employee.getName().toLowerCase() + " please enter your password");
                            String password = scan.nextLine();
                            Application.employee.passwordLogin(password);

                            if (password.startsWith("M") && password.contains("0777")) {

                                System.out.println("Welcome " + Application.employee.getName().toLowerCase());
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
//PASSWORD LOGIN END//

//ADD AIRCRAFT DESTINATION START//
public void addAircraftDestination(){
                                    System.out.println();
                                    System.out.println("Please enter a new destination");
                                    String newDestination = scan.nextLine();
                                    System.out.println();
                                    System.out.println(newDestination + " has been added to your destinations");
                                    System.out.println();
                                    System.out.println("Would you like to view your destinations? Y/N?");
                                    while (true) {
                                        String yesOrNo_43 = scan.nextLine();
                                        System.out.println();
                                        if (yesOrNo_43.toUpperCase().equalsIgnoreCase("Y")) {
                                            System.out.println("CAPE TOWN");
                                            System.out.println("JOHANNESBURG");
                                            System.out.println("DURBAN");
                                            System.out.println(newDestination.toUpperCase());
                                            break;
                                        } else if (yesOrNo_43.toUpperCase().equals("N")) {
                                            break;
                                        } else {
                                            System.out.println("Invalid input, please try again");
                                            continue;
                                        }

                                    }

}
//ADD AIRCRAFT DESTINATION END//

//ADD NEW EMPLOYEE START//
public void addEmployee(){
                                    System.out.println();
                                    System.out.println("Please enter new employee name");
                                    String newEmployeeName = scan.nextLine();
                                    System.out.println();
                                    Application.employee.setName(newEmployeeName);
                                    System.out.println("Please enter employee surname");
                                    String newEmployeeSurname = scan.nextLine();
                                    System.out.println();
                                    Application.employee.setSurname(newEmployeeSurname);
                                    System.out.println("Please enter employee ID number");
                                    String newEmployeeIdNumber = scan.nextLine();
                                    Application.employee.setIdNumber(newEmployeeIdNumber);
                                    System.out.println();
                                    System.out.println(Application.employee.getName().toUpperCase() + " " +  Application.employee.getSurname().toUpperCase() + " has been added to your employees");
                                    System.out.println("Would you like to view your employees? Y/N?");
                                    while (true) {
                                        String yesOrNo_43 = scan.nextLine();
                                        System.out.println();
                                        if (yesOrNo_43.toUpperCase().equalsIgnoreCase("Y")) {
                                            System.out.println("WELDY");
                                            System.out.println("TANYA");
                                            System.out.println("DERRICK");
                                            System.out.println("DAVID");
                                            System.out.println(Application.employee.getName().toUpperCase());
                                            break;
                                        } else if (yesOrNo_43.toUpperCase().equals("N")) {
                                            break;
                                        } else {
                                            System.out.println("Invalid input, please try again");
                                            continue;
				        }

                                    }

}
//ADD NEW EMPLOYEE END//

//CANCEL BOOKING START//
public void cancelBooking(){
                                    System.out.println();
                                    System.out.println("Please enter passenger name");
                                    String passengerNameCancelBooking = scan.nextLine();
                                    System.out.println();
                                    System.out.println("Please enter passsenger ID number");
                                    String passengerIdCancelBooking = scan.nextLine();
                                    System.out.println();

                                    int cancelBookingCount = 0;

try{
                                    if (passengerNameCancelBooking.equalsIgnoreCase(Application.passenger.getName()) && passengerIdCancelBooking.contains(Application.passenger.getIdNumber())) {

                                        System.out.println("The following passenge will be removed");
                                        System.out.println(Application.passenger.getName());
                                        System.out.println(Application.passenger.getSurname());
                                        System.out.println(Application.passenger.getAge());
                                        System.out.println(Application.passenger.getEmail());
                                        System.out.println(Application.passenger.getIdNumber());
                                        System.out.println();
                                        while (true) {
                                            System.out.println("Would you like to continue? Y/N?");
                                            String yesOrNo_20 = scan.nextLine();

                                            if (yesOrNo_20.toUpperCase().equals("Y")) {
                                                Application.passenger.setName(null);
                                                Application.passenger.setSurname(null);
                                                Application.passenger.setAge(0);
                                                Application.passenger.setEmail(null);
                                                Application.passenger.setIdNumber(null);
						System.out.println("Passenger has been removed");
						break;
                                            } else if (yesOrNo_20.toUpperCase().equals("N")) {
                                                System.out.println("Action Cancelled");
                                                break;
                                            } else {
                                                System.out.println("Invalid entry, please try again");
                                                continue;
                                            }

                                        }

                                    }

                                    while (true) {
                                        if (passengerNameCancelBooking.equalsIgnoreCase(Application.bookedPassengerFullNames[cancelBookingCount]) && passengerIdCancelBooking.contains(Application.bookedPassengerIdNumbers[cancelBookingCount])) {
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
                                        }

                                        break;
                                    }

} catch(Exception ex){
System.out.println("No Result(s)");
}

}
//CANCEL BOOKING END//

//RESCHEDULE PASSENGER BOOKING START//
public void rescheduleBooking(){
                                    int rescheduleCount = 0;
try{
                                    while (true) {
                                        System.out.println("Please enter passenger name");
                                        String passengerNameReschedule = scan.nextLine();
                                        System.out.println("Please enter passenger ID number");
                                        String passengerIdReschedule = scan.nextLine();
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
                                                        if (monthPick.toUpperCase().equals("A") || monthPick.toUpperCase().equals("B") || monthPick.toUpperCase().equals("C") && (DateOfMonth > 0 && DateOfMonth < 28)) {
                                                            System.out.println("Flight for " + Application.passenger.getName() + " " + Application.passenger.getSurname() + " has been rescheduled");
                                                            System.out.println(monthPick);
                                                            System.out.println(DateOfMonth);
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

                                        } else if (passengerNameReschedule.equalsIgnoreCase(Application.bookedPassengerFullNames[rescheduleCount]) && passengerIdReschedule.contains(Application.bookedPassengerIdNumbers[rescheduleCount])) {
                                            while (rescheduleCount < 6) {
                                                System.out.println("The following passenger will reschedule their flight:");
                                                System.out.println(Application.bookedPassengerFullNames[rescheduleCount]);
                                                System.out.println(Application.bookedPassengerAges[rescheduleCount]);
                                                System.out.println(Application.bookedPassengerIdNumbers[rescheduleCount]);
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
                        break;
                                   }
} catch (ArrayIndexOutOfBoundsException ex){
System.out.println();
System.out.println("No Result(s)");
System.out.println();
}

}
//RESCHEDULE PASSENGER BOOKING END//

}
