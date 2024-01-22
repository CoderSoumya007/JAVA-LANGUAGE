import java.util.Scanner;
public class TAX {
    public static void main(String[]args){
        float salary,tax=0;
    Scanner sc=new Scanner(System.in);
    salary=sc.nextFloat();
    System.out.printf("Your salary is %.2f\n",salary);
    if(salary<=250000){
    System.out.printf("Your payable tax is %.2f\n",tax);
    }
    else if(salary>250000 && salary<=500000){
        tax=tax+((salary-250000)*0.05f);
        System.out.printf("Your payable tax is %f\n",tax);
    }else if(salary>500000 && salary<=1000000){
        tax=(250000*.05f)+((salary-500000)*0.2f);
        System.out.printf("Your payable tax is %f\n",tax);
    }else{
        tax=(250000*.05f)+(500000*0.2f)+((salary-100000)*30/100);
        System.out.printf("Your payable tax is %f\n",tax);
    }
    }
}
