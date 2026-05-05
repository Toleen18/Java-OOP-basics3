public class Student {
    private String name ;
    private int ID;
    private double grade;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void positive (int ID){
        if(ID > 0){
            System.out.println("positive ID");
        } else {
            System.out.println("Error");
        }
    }

    public void positiveGrade (int grade){
        if(grade>=0&&grade<=100){
            System.out.println("positive Grade");
        } else {
            System.out.println("error");
        }
    }

    public boolean isPassing (int grade){
        if(grade>55){
            return true;
        } else {
            return false;
        }
    }
    // empty cons..
    public Student(){

    }
    // with paramater
    public Student(String name , int ID,int grade){
        this.ID=ID;
        this.name=name;
        this.grade=grade;
    }

    public Student (Student other){
        this.grade=other.grade;
        this.name=other.name;
        this.ID=other.ID;
    }

    public String toString() {
        return "Student Details: [Name: " + name + ", ID: " + ID + ", grade: " + grade + "]";
    }



}