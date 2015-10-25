import java.util.*;
public class ShowHand
{
     private final int  PLAY_NUM=5;
  //定义扑克牌的所有花色和数值
  //下面四个时特殊字符，会打印初出方块，草花，红桃，黑桃
      private String[]    types={"\4","\5","\3","\6"};
      private String[]    values={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
      //card是一局游戏中剩下的扑克牌
      private  List<String>   cards=new  LinkedList<String>();
      //定义所有的玩家
       private    String  []   players=new  String[PLAY_NUM];
       //定义所有玩家手上的牌
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
    	   //随机排列
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
//       初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
//       程序使用一个长度为0的LiskedList来表示
    public void initPlayerCards()
    {
    	for (int i = 0; i < players.length; i++) 
    	{
			if (players[i]!=null&&!players[i].equals("")) 
			{
				playersCards[i]=new LinkedList<String>();
			}
		}
    }
    public void showAllCards() 
    {
		for (String card : cards) {
			System.out.println(card);
		}
	}
    //派扑克牌，first最先拍给谁
    public void  deliverCard(String first) {
    	//调用ArraysUtils工具类的search方法，查询出指定元素在数组中的索引
    	int firstPos=ArrayUtils.search(players,first);
    	//依次给位于该指定玩家之后的每个玩家派扑克牌
		for (int i = firstPos; i < PLAY_NUM; i++) {
			if (players[i]!=null) {
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
		//依次给位于指定玩家之前的每个玩家派扑克牌
		for (int i = 0; i < firstPos; i++) {
			if (players[i]!=null) {
				playersCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}
    //输出玩家手上的扑克牌
    //实现方法时，应该控制每个玩家看不到别人的第一张牌，但此处没有增加该功能
    public void  showPlayerCards() {
		for (int i = 0; i < PLAY_NUM; i++) {
			//当该玩家不为空时
			if (players[i]!=null) {
				//输出玩家
				System.out.println(players[i]+"：");
				//遍历玩家手中的扑克牌
				for (String card : playersCards[i]) {
					System.out.println(card+"\t");
				}
			}
			System.out.println("\n");
		}
	}
       public static void main(String[] args)
       {
    	   ShowHand sh=new ShowHand();
    	   sh.initPlayer("电脑玩家","孙悟空");
    	   sh.initCards();
    	   sh.initPlayerCards();
    	   sh.showAllCards();
/*    	   这个地方需要增加处理；
    	   1 牌面最大的玩家下注
    	   2其他玩家是否下注
    	   3游戏是否只剩一个玩家？如果是，他胜利了
    	   4如果已经是最后一张扑克牌，则需要比较剩下玩家的牌面大小*/
    	   System.out.println("--------------");
    	   sh.deliverCard("孙悟空");
    	   sh.showPlayerCards();
    	   sh.deliverCard("电脑玩家");
    	   sh.showPlayerCards();
	}

}
