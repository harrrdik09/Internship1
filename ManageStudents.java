import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudents {







    public static void main(String[] args) {

        ArrayList<student> st=new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        //Adding a Student

         void  addStudent()
        {
            System.out.println("Enter Id");
            int id= sc.nextInt();
        }

    }

}

class student
{
    int Id;
    String Name;
    String Grade;


    student(int Id,String Name,String Grade)
    {
        this.Id = Id;
        this.Name = Name;
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "id " + Id + "Name" + Name + "Grade" + Grade ;
    }



}
