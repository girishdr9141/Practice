class Teacher{
    String Name;        //if we use static here, then we have to call them by the class name
    Teacher(String Name){
        this.Name= Name;
    }
}

class Student{
    public String Name;  //we can directly access this variable in the main method because it is public, but it is not a good practice to make it public. It is better to use getter and setter methods to access the variable.
    Student(String Name){
        this.Name=Name;
    }

    void display(Teacher t){         // we are passing the object of the Teacher class as a parameter to the display method of the Student class, so that we can access the Name variable of the Teacher class in the display method.
        System.out.println(this.Name+" is taught by "+t.Name);   
    }
}

public class AAC{
    public static void main(String[] args){
        Teacher t = new Teacher("Nirmal");
        Student s = new Student("Shekhar");
        System.out.println(s.Name+" is taught by "+t.Name);
        s.display(t);   
    }
}