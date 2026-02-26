

public class SuperHero1 {
    
    private String name;
    private String power;
    public void  setName(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public void setPower(String power){
        this.power = power;
    }
    public String getPower(){
        return power;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
    }
    public static void main(String[] args) {
        SuperHero1 hero=new SuperHero1();
        hero.setName("Superman");
        hero.setPower("Heat Vision");
        hero.display();
        System.out.println("Name: " + hero.getName());
        System.out.println("Power: " + hero.getPower());
    }
}