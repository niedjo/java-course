import green.red.yellow.RedClass;

public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = { "Apple", "Google", "Facebook", "horizon"};
 
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        RedClass rd = new RedClass();

        rd.sayHello(); 
    }
}
