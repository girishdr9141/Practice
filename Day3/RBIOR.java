public class RBIOR {
    double rateOfInterest() {
        return 6.5;
    }

    
}
class ICICI extends RBIOR {
    @Override
    double rateOfInterest() {
        return 7.2;
    }
}

class HDFC extends RBIOR {
    @Override
    double rateOfInterest() {
        return 7.8;
    }
}
class Demo1 {
    public static void main(String[] args) {
        RBIOR r1 = new RBIOR();
        RBIOR r2 = new ICICI();//Hybrid mode , as ICICI is child class of RBIOR and we are creating object of ICICI class using RBIOR reference variable
        RBIOR r3 = new HDFC();//The reference doesnt matter , te object type matters
        System.out.println("RBI rate of interest: " + r1.rateOfInterest());
        System.out.println("ICICI rate of interest: " + r2.rateOfInterest());
        System.out.println("HDFC rate of interest: " + r3.rateOfInterest());
    }
}