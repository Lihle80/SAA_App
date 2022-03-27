import java.util.Scanner;

public class Teller extends Employee{
//GETTERS & SETTERS//

//GETTERS & SETTERS//

//Envoked classes//
Airline airline = new Airline();
Scanner scan = new Scanner(System.in);
Passenger passenger = new Passenger();
//Coding//
//METHOD 1 START//
@Override
public void userNameLogin(String userName){
	while(count < Application.numberOfTellers){

nameCheck = Application.listOfTellers[count];
        if (userName.toUpperCase().equals(nameCheck.toUpperCase())){
                break;

}

count++;
 if (count == Application.numberOfTellers){


	stopIfStatement = 25;

}
}


}
//METHOD 1 END//


//METHOD 2 START//
@Override
public void passwordLogin(String password){
	if (password.startsWith("T") && password.contains("0777")){
	System.out.println("Succesful Login");
} else {
	System.out.println("You have entered an invalid password");
}

}
//METHOD 2 END//

//METHOD 3 START//
public static double refundCalculation(int amountRefundable){
	double penaltyAmount;
	penaltyAmount = 0.35 * amountRefundable;
	double amountToRefund;
	amountToRefund = amountRefundable - penaltyAmount;
	return amountToRefund;
}
//METHOD 3 END//
}
