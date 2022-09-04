package ComandLine;

import java.util.ArrayList;

public class Args_1 {

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>();
        String n;
        if (args.length > 0) {
            for (String s : args) {
                A.add(s);
            }
            for (int i = A.size() - 1; i >= 0; i--) {
                n = A.get(i);
                System.out.println(n);
            }
        } else {
            System.out.println("Vuelve a intentar");
        }
    }
}
