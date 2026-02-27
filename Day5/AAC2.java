class Engine{
    String type;
    Engine(String type){
        this.type=type;
    }
}

class car{
    Engine engine;
    car(String engineType){
        this.engine=new Engine(engineType);
    }
    void show(){
        System.out.println("Car has Engine "+engine.type);
    }
}

public class AAC2{
    public static void main(String[] args){
        car c = new car("Petrol Engine");
        c.show();
    }
}