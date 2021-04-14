public class FlyingSquirrel extends Squirrel
{
  public FlyingSquirrel(double l, double w)
  {
    super(l, w);
  }

  public void move(int numOfSeconds)
  {
    position = 6*numOfSeconds;
  }
}