public class Smartphone{
    private String brand;
    private String model;
    private int Id;
    private String colour;
    public Smartphone(String brand, String model, int Id, String colour){
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