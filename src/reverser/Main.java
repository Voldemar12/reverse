package reverser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //String line = scanner.nextLine();
        //String str = scanner.findInLine("yes");

        //StringReverser reverser = new StringReverser();
        StringReverser reverser1 = new StringReverser() {
            @Override
            public String reverse(String str) {
                String[] massive = str.split("");
                String result = "";
                for(int i = massive.length-1; i >= 0; i--) {
                  result = result + massive[i];
                }
                return result;
            }
     };
        System.out.println(reverser1.reverse("line"));

    }
}