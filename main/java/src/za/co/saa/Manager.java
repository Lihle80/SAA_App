import java.util.Scanner;

class Manager extends Employee{
//CODING//
Scanner scan = new Scanner(System.in);
Airline airline = new Airline();
Passenger passenger = new Passenger();

//METHOD 1 START//
@Override
public void userNameLogin(String userName){
        while(count < Application.numberOfManagers){

nameCheck = Application.listOfManagers[count];
        if (userName.toUpperCase().equals(nameCheck.toUpperCase())){
                break;

}

count++;
 if (count == Application.numberOfManagers){


        stopIfStatement = 25;

}
}


}
//METHOD 1 END//


//METHOD 2 START//
@Override
public void passwordLogin(String password){
        if (password.startsWith("M") && password.contains("0777")){
        System.out.println("Succesful Login");
} else {
        System.out.println("You have entered an invalid password");
}

}
//METHOD 2 END//

}
