import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GoBang {
	//下面三个位图分别为棋盘  白子 黑子
	BufferedImage table;
	BufferedImage black;
	BufferedImage white;
	//当鼠标西东时候的选择框
	BufferedImage selected;
	//定义棋盘大小
	private static int BOARD_SIZE=15;
	//定义棋盘宽 高多少个像素
	private final int TABLE_WIDTH=535;
	private final int TABLE_HEIGHT=536;
	//定义棋盘坐标的像素值和棋盘数组之间的比率
	private final int RATE=TABLE_WIDTH/BOARD_SIZE;
	private final int X_OFFSET=5;
	private final int Y_OFFSET=6;
	private String[][] board=new String[BOARD_SIZE][BOARD_SIZE];
	JFrame f=new JFrame("五子棋游戏");
	//五子棋游戏棋盘对应的Canvas组件
	ChessBoard chessBoard =new ChessBoard();
	//当前选中点的坐标
	private int selectedX=-1;
	private int selectedY=-1;
	public void init() throws Exception
	{
		table =ImageIO.read(new File("image/board.jpg"));
		black =ImageIO.read(new File("image/black.gif"));
		white =ImageIO.read(new File("image/white.gif"));
		selected =ImageIO.read(new File("image/selected.gif"));
		//把每个元素赋值为"+"，用于在控制台画出棋盘
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j]="╋";
			}
		}
		chessBoard.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
		chessBoard.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				//将用户鼠标事件的坐标换成棋子数组的坐标
				int xPos=(int)(e.getX()-X_OFFSET)/RATE;
				int yPos=(int)(e.getY()-Y_OFFSET)/RATE;
				board[xPos][yPos] = "●";
				/*
				 电脑随机生成两个整数，作为电脑下棋的大的坐标，赋给board数组
				 还涉及
				 如果下棋的点已经有棋子，不能重复下棋
				 每次下棋后，要扫描谁赢了
				 */
				chessBoard.repaint();
			}
			//当鼠标退出棋盘区后，复位选中点坐标
			public void mouseExited(MouseEvent e)
			{
				selectedX=-1;
				selectedY=-1;
				chessBoard.repaint();
			}
		});
		chessBoard.addMouseMotionListener(new MouseMotionAdapter()
		{
			//当鼠标移动时，改变选中点的座标
			public void mouseMoved(MouseEvent e)
			{
				selectedX = (e.getX() - X_OFFSET) / RATE;
				selectedY = (e.getY() - Y_OFFSET) / RATE;
				chessBoard.repaint();
			}
		});
		f.add(chessBoard);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) throws Exception {
		GoBang gb=new GoBang();
		gb.init();
	}
	class ChessBoard extends JPanel
	{
		public void paint(Graphics g)
		{
			g.drawImage(table, 0, 0, null);
			if (selectedX>=0&&selectedY>=0) {
				g.drawImage(selected, selectedX*RATE+X_OFFSET, selectedY*RATE+Y_OFFSET, null);
			}
			for (int i = 0; i < BOARD_SIZE; i++) {
				for (int j = 0; j < BOARD_SIZE; j++) {
					//绘制黑棋
					if (board[i][j].equals("●")) {
						g.drawImage(black, i*RATE+X_OFFSET,	j*RATE+Y_OFFSET, null);
					}
					if(board[i][j].equals("○"))
					{
						g.drawImage(black , i * RATE  + X_OFFSET, j * RATE  + Y_OFFSET, null);
					}
				}
			}
		}
	}

}
