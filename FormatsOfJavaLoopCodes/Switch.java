import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Your age");
        age = sc.nextInt();
        switch(age){
            case 18->System.out.println("You are going ---adult");
            case 23->
            System.out.println("You are going ----job");
            case 60->System.out.println("You are going to----retired");
            default->System.out.println("Enjoy your life");
            }
    }
}