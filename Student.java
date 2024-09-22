public class Student{
    public String name;
    public String major;
    public int Id;
    public int Gpa;
    public Book(String name, String major, int Id, int Gpa){
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