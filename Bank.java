


public class Bank{

    int accountNum;
    String firstName;
    String lastName;
    float accountBalance;

    Bank(int accountNum,String firstName,String lastName,float accountBalance){
        this.accountNum=accountNum;
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountBalance=accountBalance;
    }
    void setAcc(int accN){
        this.accountNum=accN;
    }


    int getAcc(){
        return accountNum;
    }
    void setFname(String fn){
        this.firstName=fn;

    }
    String getFname(){
        return firstName;
    }
    void setLname(String ln){
        this.lastName=ln;

    }

    String getLname(){

        return lastName;
    }
    void setaccBalance(float ab){
        this.accountBalance=ab;

    }

    float getaccBalance(){

        return accountBalance;
    }
    public String toString(){
        return "Your account number is "+this.accountNum+". \nAnd your first name is "+firstName+". \nAnd your last name is "+lastName+". \nNow your balance is "+accountBalance;

    }
}