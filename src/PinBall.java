import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
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
	private MyCanvas tableArea=new MyCanvas();
	//用于保存需要绘制什么图形的字符串属性
	private String shape="";
	Timer timer;
	//游戏结束的棋标
	private boolean isLose=false;
	public void init() {
		tableArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
		f.add(tableArea);
		KeyAdapter keyProcessor=new KeyAdapter() {
			public void keyPressed(KeyEvent ke)
			{
				if(ke.getKeyCode()==KeyEvent.VK_LEFT)
				{
					if(racketX>0)
						racketX-=10;
				}
				if (ke.getKeyCode()==KeyEvent.VK_RIGHT) {
					if (racketX<TABLE_WIDTH-RACKET_WIDTH) {
						racketX+=10;
					}
				}
			}
		};
		//为窗口和tableArea对象分别添加键盘监听器
		f.addKeyListener(keyProcessor);
		tableArea.addKeyListener(keyProcessor);
		//定义每0.1秒执行一次事件监听器
		ActionListener taskPerformer=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
			if (ballX<=0||ballX>=TABLE_WIDTH-BALL_SIZE) {
				
			}
			}
		};
	}
	public static void main(String[] args) {

	}

}
