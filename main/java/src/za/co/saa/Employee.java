
public abstract class Employee{
private String name;
private String surname;
private int age;
private String idNumber;
private String email;
//GETTER & SETTERS//
public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getSurname(){
return surname;
}

public void setAge(int age){
this.age = age;
}

public int getAge(){
return age;
}

public void setIdNumber(String idNumber){
this.idNumber = idNumber;
}

public String getIdNumber(){
return idNumber;
}

public void setEmail(String email){
this.email = email;
}

public String getEmail(){
return email;
}
//GETTERS & SETTERS END//


//METHOD 1 MEMBERS//
int stopIfStatement = 0;
static String nameCheck = null;
byte count = 0;
byte attempts = 2;
abstract void userNameLogin(String userName);
//METHOD 1 MEMBERS END//


//METHOD 2 MEMBERS//
byte attempts2 = 2;
abstract void passwordLogin(String password);
//METHOD 2 MEMBERS//

//METHOD 3 MEMBERS//

//METHOD 3 MEMBERS END//
}
