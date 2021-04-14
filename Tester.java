public class Tester extends Employee
{
  public static void main(String[] args)
  {
    //Employee Tests
    Employee e = new Employee();
    System.out.println(e.getPayRate());
    e.setPayRate(11.0);
    System.out.println(e.getPayRate());
    System.out.println(e.getLastName());
    e.setLastName("White");
    System.out.println(e.getLastName());
    System.out.println(e.toString());

    //7. Tech Employee Tests/Proving method override
    TechEmployee t = new TechEmployee();
    t.setPayRate(12);
    System.out.println(t.getPayRate());
    t.setQual("Test");
    System.out.println(t.getQual());


    System.out.println("Static Test:");
    getCount();
  }
}