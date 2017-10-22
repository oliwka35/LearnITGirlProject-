

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner number = new Scanner(System.in);
    double fnum, snum, answer;
        System.out.println("Enter equation:");
        fnum = number.nextDouble();
        String operation = number.next();
        snum = number.nextDouble();
        answer = 0;


        switch (operation){
            case "+":
                answer = fnum + snum;
                break;


            case "-": answer = fnum - snum;
            break;

            case "/": answer = fnum/snum;
            break;
            case "*": answer = fnum*snum;
            break;

        }

        System.out.println("The answer is:" + (answer));
    }
}
