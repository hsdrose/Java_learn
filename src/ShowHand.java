import java.awt.List;
import java.util.LinkedList;
import java.util.*;

public class ShowHand
{
     private final int  PLAY_NUM=5;
  //定义扑克牌的所有花色和数值
  //下面四个时特殊字符，会打印初出方块，草花，红桃，黑桃
      private String[]    types={"\4","\5","\3","\6"};
      private String[]    values={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
       private  List<String>   cards=new  LinkedList<String>();
       private    String  []   players=new  String[PLAY_NUM];
       private  List<String>[]    playersCards=new List[PLAY_NUM];
       //初始化扑克牌   并用shuffle方法将他们按随机排序
       public void   initCards()
       {
    	   for (int i = 0; i < types.length; i++)
		{
			for (int j = 0; j < values.length; j++)
			{
				cards.add(types[i]+values[j]);
			}
		}
    	   Collections.shuffle(cards);
       }
       //初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
       //程序使用一个长度的LinkedList来表示
       public void initPlayer(String ...   names )
	{
		if (names.length>PLAY_NUM||names.length<2)
		{
			System.out.println("玩家数量不对");
		}
		else {
			//初始化玩家用户名
			for (int i = 0; i < names.length; i++)
			{
				players[i]=names[i];
			}
		}
	}
       public static void main(String[] args)
       {
	}

}
