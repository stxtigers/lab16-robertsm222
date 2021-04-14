public class Employee
{
  protected static int numOfEmployees;
  protected String lastName;
  protected double payRate;
  Employee(){};

  public static void getCount()
  {
    System.out.println(numOfEmployees);
  }

  public void setLastName(String name)
    {
      lastName = name;
    }

    public String getLastName()
    {
      return lastName;
    }

    public void setPayRate(double pr)
    {
      payRate = pr;
    }

    public double getPayRate()
    {
      return payRate;
    }

    public String toString()
    {
      String str = "Last Name: " + lastName + "\nPay Rate: " + payRate;
      return str;
    }
}