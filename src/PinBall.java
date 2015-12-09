import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.Timer;
public class PinBall {
	private final int TABLE_WIDTH=300;
	private final int TABLE_HEIGHT=400;
	//定义球拍的垂直位置，高度，宽度
	private final int RACKET_Y=340;
	private final int RACKET_WIDTH=60;
	private final int RACKET_HEIGHT=20;
	private final int BALL_SIZE=16;
	private Frame f=new Frame("弹球游戏");
	Random rand=new Random();
	//小球速度
	private int ySpeed=10;
	//返回一个-0.5~0.5的比率，用于控制小球的运行反向
	private double xyRate=rand.nextDouble()-0.5;
	private int xSpeed=(int)(ySpeed*xyRate*2);
	//小球的坐标
	private int ballX=rand.nextInt(200)+20;
	private int ballY=rand.nextInt(10)+20;
	//racketX代表球拍的水平位置
	private int racketX=rand.nextInt(200);
	private MyCanvas tableArea = new MyCanvas();
	//用于保存需要绘制什么图形的字符串属性
	private String shape="";
	Timer timer;
	//游戏结束的棋标
	private boolean isLose=false;
	public void init() 
	{
		tableArea.setPreferredSize(new Dimension(TABLE_WIDTH , TABLE_HEIGHT));
		f.add(tableArea);
		KeyAdapter keyProcessor=new KeyAdapter() 
		{
			public void keyPressed(KeyEvent ke)
			{
				if(ke.getKeyCode()==KeyEvent.VK_LEFT)
				{
					if(racketX>0)
						racketX-=10;
				}
				if (ke.getKeyCode()==KeyEvent.VK_RIGHT) 
				{
					if (racketX<TABLE_WIDTH-RACKET_WIDTH)
						racketX+=10;
				}
			}
		};
		//为窗口和tableArea对象分别添加键盘监听器
		f.addKeyListener(keyProcessor);
		tableArea.addKeyListener(keyProcessor);
		//定义每0.1秒执行一次事件监听器
		ActionListener taskPerformer=new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) {
			if (ballX<=0||ballX>=TABLE_WIDTH-BALL_SIZE) {
				xSpeed=-xSpeed;
			}
			//如果小球高度超出了球拍的位置，且横向不在球拍范围内，借宿游戏
			if(ballY>=RACKET_Y-BALL_SIZE&&
					(ballX<racketX||ballX>racketX+RACKET_WIDTH))
			{
				timer.stop();
				//设置游戏是否结束的标志为true
				isLose=true;
				tableArea.repaint();
			}
			//如果小球位于球拍之内，且达到球拍位置，小球反弹
			else if(ballY<=0||
					(ballY>=RACKET_Y-BALL_SIZE&&ballX>racketX&&ballX<=racketX+RACKET_WIDTH))
			{
				ySpeed=-ySpeed;
			}
			//小球坐标
			ballY+=ySpeed;
			ballX+=xSpeed;
			tableArea.repaint();
			}
		};
		timer=new Timer(100,taskPerformer);
		timer.start();
		f.pack();
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new PinBall().init();
	}
	class MyCanvas extends Canvas
	{
		//重写paint方法，实现绘画
		public void paint(Graphics g)
		{
			//如果游戏已经结束了
			if(isLose)
			{
				g.setColor(new Color(255,0,0));
				g.setFont(new Font("Times",Font.BOLD,30));
				g.drawString("游戏已结束",50,200);
			}
			//如果游戏还为结束
			else{
				g.setColor(new Color(240,240,80));
				g.fillOval(ballX,ballY,BALL_SIZE,BALL_SIZE);
				g.setColor(new Color(80,80,200));
				g.fillRect(racketX,RACKET_Y,RACKET_WIDTH,RACKET_HEIGHT);
			}
		}
	}

}
