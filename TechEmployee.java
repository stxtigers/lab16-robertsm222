public class TechEmployee extends Employee
{
  String qual;
  TechEmployee()
  {
    super();
  }

  public void setQual(String ql)
  {
    qual = ql;
  }

  public String getQual()
  {
    return qual;
  }

  public String toString()
  {
    String str = "Last Name: " + lastName + "\nPay Rate: " + payRate + "\nQual: " + qual;
    return str;
  }

  public void setPayRate(double pr)
  {
    payRate = pr*2;
  }

}