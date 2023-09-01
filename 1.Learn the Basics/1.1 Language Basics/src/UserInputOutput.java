import java.util.Scanner;

public class UserInputOutput {
            public static void main(String[] args) {
                java.util.Scanner in = new java.util.Scanner(System.in);
                String ch = in.next();
                if (ch.charAt(0)>=65 && ch.charAt(0)<=90){
                    System.out.println(1);
                }
                else if (ch.charAt(0)>=97 && ch.charAt(0)<=122){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
