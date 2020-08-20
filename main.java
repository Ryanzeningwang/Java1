import java.util.LinkedList;
import java.util.Scanner;
public class main{

    public static void main(String args[]){
        LinkedList<Bank> storage=new LinkedList<Bank>();
        String str1="";
        int number=0;
        //
        //
        //
        //
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the following number to choose your service: \n1. insert your account. \n2. search your account. \n3. update your account. \n4. delete.");
            if (scan.hasNext()) {
                str1 = scan.next();
                number=Integer.parseInt(str1);
                //System.out.println("your account number is ：" + (accountNum-1));
            }
            if(number==1){
                storage=insert(storage);

            }else if(number==2){
                search(storage);

            }else if(number==3){
                update(storage);

            }else if(number==4){

                delete(storage);
            }else{
                System.out.println("Wrong number. please try again. ");

            }

        }



    }
    public static LinkedList<Bank> insert(LinkedList<Bank> storage){
        //System.out.println("123");
        int accountNum=0;
        //String fName;
        //String lName;
        float accountBalance=0;
        String str1,str4;
        String str2="";
        String str3="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account：");
        if (scan.hasNext()) {
            str1 = scan.next();
            accountNum=Integer.parseInt(str1);
            //System.out.println("your account number is ：" + (accountNum-1));
        }
        System.out.println("Enter your first name：");
        if (scan.hasNext()) {
            str2 = scan.next();
            //fName=str2;
            //System.out.println("your account number is ：" + str2);
        }
        System.out.println("Enter your last name：");
        if (scan.hasNext()) {
            str3 = scan.next();
            //lName=str3;
            //System.out.println("your account number is ：" + str3);
        }
        System.out.println("Enter your account balance：");
        if (scan.hasNext()) {
            str4 = scan.next();
            accountBalance=Float.parseFloat(str4);
            //System.out.println("your account number is ：" + str4);
        }
        Bank bank=new Bank(accountNum,str2,str3,accountBalance);
        System.out.println(bank.toString());

        //LinkedList<Bank> storage=new LinkedList<Bank>;
        storage.addLast(bank);
        System.out.println("your data is already stored into database. ");
        //System.out.println(storage.size());
        return storage;
    }
    public static void search(LinkedList<Bank> storage){
        String str5="";
        int input=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Start searching...\nEnter your account：");
        if (scan.hasNext()) {
            str5 = scan.next();
            input=Integer.parseInt(str5);
            //System.out.println("your account number is ：" + (input-1));
        }
        for(int i=0;i<storage.size();i++){
            if((storage.get(i).getAcc())==(input)){
                System.out.println("We find your account. ");
                System.out.println(storage.get(i).toString());
                break;
            }else{
                System.out.println("Your account is not exist. ");

            }

        }


    }
    public static void update(LinkedList<Bank> storage){
        String str6="";
        int input1=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Start searching...\nEnter your account：");
        if (scan.hasNext()) {
            str6 = scan.next();
            input1=Integer.parseInt(str6);
            //System.out.println("your account number is ：" + (input-1));

        }
        for(int i=0;i<storage.size();i++){
            if((storage.get(i).getAcc())==(input1)){
                System.out.println("We find your account. ");
                System.out.println("What do you want to change? 1. first name. 2. last name. ");
                if (scan.hasNext()) {
                    str6 = scan.next();
                    input1=Integer.parseInt(str6);
                    if(input1==1){
                        //String fistName=storage.get(i).getFname();
                        System.out.println("what do you want to change: ");
                        if (scan.hasNext()) {
                            str6 = scan.next();
                        }
                        storage.get(i).setFname(str6);
                        System.out.println("mission complete. ");

                    }else if(input1==2){
                        System.out.println("what do you want to change: ");
                        if (scan.hasNext()) {
                            str6 = scan.next();
                        }
                        storage.get(i).setFname(str6);
                        System.out.println("mission complete. ");

                    }else{
                        System.out.println("Wrong number. please try again. ");

                    }
                    //System.out.println("your account number is ：" + (input-1));

                }
                //System.out.println(storage.get(i).toString());
                break;
            }else{
                System.out.println("Your account is not exist. ");

            }

        }


    }
    public static void delete(LinkedList<Bank> storage){
        String str5="";
        int input=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Start searching...\nEnter your account：");
        if (scan.hasNext()) {
            str5 = scan.next();
            input=Integer.parseInt(str5);
            //System.out.println("your account number is ：" + (input-1));
        }
        for(int i=0;i<storage.size();i++){
            if((storage.get(i).getAcc())==(input)){
                System.out.println("We find your account. ");

                storage.remove(i);
                System.out.println("mission complete. ");
                //System.out.println(storage.get(i).toString());
                break;
            }else{
                System.out.println("Your account is not exist. ");

            }

        }

    }


}