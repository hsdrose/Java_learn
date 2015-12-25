import java.io.*;
import java.awt.datatransfer.*;

public class LocalSelection implements Transferable
{
	private Object obj;
	public LocalSelection(Object obj)
	{
		this.obj = obj;
	}
	public DataFlavor[] getTransferDataFlavors()
	{ 
		DataFlavor[] flavors = new DataFlavor[2];
		//
		Class clazz = obj.getClass();
		String mimeType = "application/x-java-jvm-local-objectref;class=" + clazz.getName();
		try
		{
			flavors[0] = new DataFlavor(mimeType);
			flavors[1] = DataFlavor.stringFlavor;
			return flavors;			
		}
		catch (ClassNotFoundException e)
		{
			return null;
		}
	} 

	public Object getTransferData(DataFlavor flavor)
		throws UnsupportedFlavorException
	{ 
		if(!isDataFlavorSupported(flavor))
		{ 
			throw new UnsupportedFlavorException(flavor);
		} 
		if (flavor.equals(DataFlavor.stringFlavor))
		{
			return obj.toString();
		}
		return obj;
	} 
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{		
		return flavor.equals(DataFlavor.stringFlavor) ||
			flavor.getPrimaryType().equals("application")
			&& flavor.getSubType().equals("x-java-jvm-local-objectref")
			&& flavor.getRepresentationClass().isAssignableFrom(obj.getClass());
	} 
}
