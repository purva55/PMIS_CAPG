package Day08;
class example6{

    public static void main(String[] args){
        int balance = 5000;
        int withdraw = 7000;

        try{
            if(withdraw > balance){
                throw new IllegalArgumentException(
                    "Insufficient Balance");
            }
            balance -= withdraw;
            System.out.println("Withdrawal was Successful");
            System.out.println("Remaining Balance: " + balance);
        
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program Completed");
    }

}