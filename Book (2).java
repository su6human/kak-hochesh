public class Book{
    private String title;
    private String author;
    private int price;
    private int isbn;
    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author= author;
        this.price = price;
        this.isbn = isbn;
    }
    public void displayinfo(){
        System.out.println("title:" +" " +title);
        System.out.println("author:"+ " "+author);
        System.out.println("price:"+ " " +price);
        System.out.println("ISBN:" +" " +isbn);
    }
}