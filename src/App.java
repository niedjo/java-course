import com.niedjo.utils.MaClass;
import java.awt.Point;
import java.util.Arrays;
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
        Point point2 = point1; // pointing to the same object in memory
        point1.x = 3;
        
        obj.sayHello("je suis cool");

        System.out.println("views = " + views + " " + d.toLocaleString());
        System.out.println("To show that the point1 and point2 are the same variable pointing to the same object, let's print the value of point2.x wich is equal to 3. point2.x = " + point2.x);
        System.out.println("x + temperature = " + (x + temperature));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + "\n");
        }


        // ok, let us talk about tabs

        // 1D tabs

        // declaration
        
        int oneDtab[] = new int[5]; // declaration and instantiation with size 5
        int[] oneDtab2 = {1, 2, 3, 4, 5}; // declaration and instantiation

        for (int i = 0; i < oneDtab2.length; i++) {
            oneDtab[i] = oneDtab2[i] * 2;
            System.out.println("oneDtab2[" + i + "] = " + oneDtab2[i]); 
            System.out.println("oneDtab[" + i + "] = " + oneDtab[i]);
        }

        // 2D tabs

        // declaration

        int[][] twoDtab = new int[4][5]; // declaration and instantiation with size 4 x 5 = 20
        int[][] twoDtab2 = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19},
        };

        for (int i = 0; i < twoDtab2.length; i++) {
            for (int j = 0; j < twoDtab2[i].length; j++) {
                System.out.print(twoDtab2[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println(); 
        // renverson un peu ce tableau

        for (int i = 0; i < twoDtab2[0].length; i++) {
            for (int j = 0; j < twoDtab2.length; j++) {
                System.out.print(twoDtab2[j][i] + " ");
            }
            System.out.println();
        }

        
        // 3D tabs

        // declaration

        int[][][] treeDtab = new int[2][3][4]; // 2 blocks 3 lignes 4 rows

        int[][][] tab = { // trois lignes, trois colones et trois blocks
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            },
            {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
            },
            {
                {23, 24, 25, 26},
                {27, 28, 29, 30},
                {31, 32, 33, 34}
            }
        };

        // parcourir le tableau 3D
        for (int i = 0; i < tab.length; i++) {                // blocs
            for (int j = 0; j < tab[i].length; j++) {         // lignes
                for (int k = 0; k < tab[i][j].length; k++) {  // colonnes
                    System.out.print(tab[i][j][k] + " ");
                }
                System.out.println(); // retour ligne après chaque ligne
            }
            System.out.println("----"); // séparation des blocs
        }

        // parcourir le tableau 3D n invrsant
        for (int i = 0; i < tab.length; i++) {                // blocs
            for (int j = 0; j < tab[0][0].length; j++) {         // lignes
                for (int k = 0; k < tab[0].length; k++) {           // colonnes
                    System.out.print(tab[i][k][j] + " ");
                }
                System.out.println(); // retour ligne après chaque ligne
            }
            System.out.println("----"); // séparation des blocs
        }

        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.deepToString(tab)); // pour afficher toutes les arrays

    }
}
