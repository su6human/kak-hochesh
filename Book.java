public class Book{
    public String title;
    public String author;
    public int price;
    public int ISBN;
    public Book(String title, String author, int price, int ISBN){
        this.title = title;
        this.author= author;
        this.price = price;
        this.ISBN = ISBN;
    }
    public void displayinfo(){
        System.out.println("title:" +" " +title);
        System.out.println("author:"+ " "+author);
        System.out.println("price:"+ " " +price);
        System.out.println("ISBN:" +" " +ISBN);
    }
}