import java.util.Scanner;
public class labtask4
{
    public static void main(String[] args){
        int marks[] = new int[6];
        int i;
        float total=0;
        float avg;
        Scanner scanner=new Scanner(System.in);

        for(i=0; i<6; i++){
            System.out.println("Enter Marks of subject"+(i+1)+": ");
            marks[i] = scanner.nextInt();
            total=total+marks[i];
        }
        scanner.close();
        avg=total/6;
        System.out.println("the student Grade i: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if (avg>=60 && avg<80)
        {
            System.out.println("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
    }
}
