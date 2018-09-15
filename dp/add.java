import java.util.Scanner;

public class add {
    public static void main(String... args) throws Exception {
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
            System.out.println(cin.nextInt()+cin.nextInt());
        }
    }
}
