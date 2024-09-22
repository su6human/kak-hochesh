public class Book{
    private String title;
    private String author;
    private int price;
    private int ISBN;
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