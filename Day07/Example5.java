package Day07;

class Bank {
    void calculateInterset(){
        System.out.println("Base Internrt Calculation");

    }
    
}

class Branch extends  Bank{
    void  calculateInterset(){
        System.out.println("custom Interest");
            
        
    }
}
