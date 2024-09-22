public class Main
{
	public static void main(String[] args) {
		Book bok = new Book("The Daughter of the Commandant", "Aleksandr Sergeevich Pushkin", 200, 84984984);
            bok.displayinfo();
        System.out.println("   ");
		Student stud = new Student("Aktan", "IT", 2548921, "99.9");
            stud.displayinfo();
		System.out.println("   ");

		Smartphone smart = new Smartphone("Iphone", "13 pro max", 500, "purple");
            smart.displayinfo();}
}