
//Abstraction

abstract class Hero{
    private String name;
    public Hero(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    abstract void power();//If you try without abstract keyword it will give error
        System.out.println("DC SuperHeros");
    }
}

class WonderWomen extends Hero{
    public WonderWomen(String name){
        super(name);
    }
    @Override
    void power(){
        System.out.println(getname());
    }
}
public class AbstractionDemo3{
    public static void main(String[] args){
        Hero.information();
        Hero h = new WonderWomen("chandu");/* //Abstract class reference can refer to the object of its subclass,
         but we cannot create object of abstract class */
        h.power();
    }
}