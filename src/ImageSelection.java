
import java.awt.*;
import java.awt.datatransfer.*;
public class ImageSelection implements Transferable
{
	private Image image;
	//构造器，负责持有一个Image对象
	public ImageSelection(Image image)
	{
		this.image = image;
	}
	//返回该Tranferable对象所支持的所有DataFlavor
	public DataFlavor[] getTransferDataFlavors()
	{
		return new DataFlavor[]{DataFlavor.imageFlavor}; 
	}
	//取出Transferable对象里实际的数据
	public Object getTransferData(DataFlavor flavor)
		throws UnsupportedFlavorException
	{
		if(flavor.equals(DataFlavor.imageFlavor))
		{ 
			return image;
		} 
		else
		{
			throw new UnsupportedFlavorException(flavor);
		}
	}
	//返回该Transferable对象是否支持指定的DataFlavor
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.equals(DataFlavor.imageFlavor);
	}
} 
