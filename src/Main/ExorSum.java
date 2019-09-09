package Main;
import java.lang.*;
import java.util.Scanner;

public class ExorSum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        if((n1^n2) == (n1 | n2) ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}