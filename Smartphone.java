public class Smartphone{
    public String brand;
    public String model;
    public int Id;
    public String colour;
    public Book(String brand, String model, int Id, String colour){
        this.brand = brand;
        this.model= model;
        this.Id = Id;
        this.colour = colour;
    }
    public void displayinfo(){
        System.out.println("brand:" +" " +brand);
        System.out.println("major:"+ " "+model);
        System.out.println("Id:"+ " " +Id);
        System.out.println("colour:" +" " +colour);
    }
}