import java.util.*;

public class Canvas
{
    public void  drawAll(List<? extends  Shape>  shapes)
	{
		for (Object	 object: shapes)
		{
			Shape	 s=(Shape)object;
			s.draw(this);
		}
	}
	public static void main(String[] args)
	{
    List<Circle>  circleList=new ArrayList<Circle>();
    circleList.add(new Circle());
    Canvas   c=new Canvas();
    c.drawAll(circleList);
	}

}
