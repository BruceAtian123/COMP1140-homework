package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        StringBuffer dest = new StringBuffer();
        if (source.equals(" ")) {
            System.out.println(" ");
        } else {
            for (int i = 0; i < source.length(); i++) {
                int runLength = 1;
                while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1)) {
                    runLength++;
                    i++;
                }
                if (runLength == 1) {
                    dest.append(source.charAt(i));
                } else {
                    dest.append(source.charAt(i));
                    dest.append(runLength);
                }
            }
            System.out.println(dest.toString());
        }
    }
}
