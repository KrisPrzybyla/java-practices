import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Hello Git!");
	    System.out.println("Feature branch #2!"); //conflict here!!
        System.out.println(date.getTime());
    }
}
