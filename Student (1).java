public class Student{
    private String name;
    private  String major;
    private int Id;
    private String Gpa;
    public Student(String name, String major, int Id, String Gpa){
        this.name = name;
        this.major= major;
        this.Id = Id;
        this.Gpa = Gpa;
    }
    public void displayinfo(){
        System.out.println("name:" +" " +name);
        System.out.println("major:"+ " "+major);
        System.out.println("Id:"+ " " +Id);
        System.out.println("Gpa:" +" " +Gpa);
    }
}