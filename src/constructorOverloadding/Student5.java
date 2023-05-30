package constructorOverloadding;

public class Student5
{
    int ID;
    int age;
    String name;
    Student5(int i,String n)
    {
        ID=i;
        name= n;
    }
    Student5(int i, int a,String s)
    {
        ID=i;
        age=a;
        name=s;
    }
    public  void display()
    {
        System.out.println(ID+" "+name+" "+age);
    }

    public static void main(String[] args)
    {
        Student5 s1 =new Student5(111,"kapil");
        Student5 s2= new Student5(222,27,"swapnil");
        s1.display();
        s2.display();
    }
}
