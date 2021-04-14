public class Squirrel implements Animal
{
  public static final int numberOfLimbs = 4;
  public static int squirrelCount = 0;

  protected int squirrelNumber;
  protected int position;
  protected double length;
  protected double weight;

  public Squirrel(double l, double w)
  {
    length = l;
    weight = w;
    position = 0;
    squirrelNumber = squirrelCount;
    squirrelCount++;
  }

  public void move(int numberOfSeconds)
  {
    position = 4*numberOfSeconds;
  }

  public String sound()
  {
    return "chitter-chitter-chitter";
  }

  public String toString()
  {
    return "Squirrel" + squirrelNumber + ", Location " + position;
  }
}