class Student{


    int rno;
    int marks;
    String level;

    //setter method for value insertion

    void setter(int rno,int marks,String level){
        this.rno=rno;
        this.marks=marks;
        this.level=level;
    }

    //getter value for print all data in the 

    void getall(){
        System.out.println(rno);
        System.out.println(level);
        System.out.println(marks);
    }
}

// main class

public class Oops1v2{
    public static void main(java.lang.String[] args){
    
        
        // obj create for class student 
        Student hari = new Student();
        Student mani = new Student();
        Student mark = new Student();
        Student peter = new Student();
        
        
        //set value
        hari.setter(13,69,"avg");
        peter.setter(14,46,"imp needed");
        mani.setter(15,96,"very gud");
        mark.setter(16,86,"gud");

        //retrive value from data 
        hari.getall();
        mani.getall();
        peter.getall();
        mark.getall();
    }
}
