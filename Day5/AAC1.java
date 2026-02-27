class Dept{
    String deptName;       
    Dept(String deptName){
        this.deptName= deptName;
    }
}

class College{
    String collegeName;  
    Dept dept;            // we are creating an object of the Dept class in the College class, so that we can access the deptName variable of the Dept class in the display method of the College class.
    College(String collegeName, Dept dept){
        this.collegeName=collegeName;
        this.dept=dept;
    }

    void display(){         
        System.out.println(this.collegeName+" belongs to department "+ dept.deptName);   
    }
}

public class AAC1{
    public static void main(String[] args){
        Dept d = new Dept("Computer Science");
        College c = new College("Sapthagiri NPS University",d);  //why d? because we are passing the object of the Dept class as a parameter to the constructor of the College class, so that we can access the deptName variable of the Dept class in the display method of the College class.
        c.display();   
    }
}
