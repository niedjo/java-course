import com.niedjo.utils.MaClass;
import java.awt.Point;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        // primitives types
        /**
         * bite 
         * short
         * int
         * long
         * float
         * double
         * char 
         * boolean
         * 
         * */ 

        byte x = 59, temperature = 37;
        int viewCount = 234_32_90;
        long views = 3_123_456_789L;
        float price = 10.99F;
        String y = "hello";
        char z = 'a';

        // reference types
        /**
         * 
         * The reference types are objects and arrays
         * 
         * */ 
        Date d = new Date();

        MaClass obj = new MaClass();

        String name = "nkds";

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 3;
        
        obj.sayHello("je suis cool");

        System.out.println("viewCount = " + viewCount + " " + d.toLocaleString());
        System.out.println("To show that the point1 and point2 are the same variable pointing to the same object, let's print the value of point2.x wich is equal to 3. point2.x = " + point2.x);
        System.out.println("x + temperature = " + (x + temperature));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + "\n");
        }

    }
}
