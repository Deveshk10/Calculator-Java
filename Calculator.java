import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        while (true){
            System.out.print("Enter operator:");
            char op=sc.next().trim().charAt(0);
            if(op=='+' ||op=='-' ||op=='*' ||op=='/' ||op=='%'){
                System.out.println("Enter two numbers");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                    System.out.println("Answer is: "+ans);;
                } if (op=='-') {
                    ans=num1-num2;
                    System.out.println("Answer is: "+ans);;
                }
                if (op=='*') {
                    ans=num1*num2;
                    System.out.println("Answer is: "+ans);;
                }if (op=='/') {
                    if(num2!=0){
                        ans=num1/num2;
                        System.out.println("Answer is: "+ans);;
                    }
                    else{
                        System.out.println("Undefined divide by zero");
                        System.out.println("Answer is: "+ans);;
                    }

                }if (op=='%') {
                    ans=num1%num2;
                    System.out.println("Answer is: "+ans);;
                }
            }
            else if (op=='x'||op=='X') {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Thank you for using calculator");
    }
}
