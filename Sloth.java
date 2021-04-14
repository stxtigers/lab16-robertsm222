

public class Sloth implements Animal
{
  public static final int numberOfLimbs = 4;
  public static int slothCount = 0;

  protected int slothNumber;
  protected int position;
  protected double length;
  protected double weight;

  public Squirrel(double l, double w)
  {
    length = l;
    weight = w;
    position = 0;
    slothNumber = slothCount;
    slothCount++;
  }

  public void move(int numberOfSeconds)
    {
      position = numberOfSeconds;
    }

    public String sound()
    {
      return "ahhhhhhh";
    }

    public String toString()
    {
      return "Sloth" + slothNumber + ", Location " + position;
    }
}