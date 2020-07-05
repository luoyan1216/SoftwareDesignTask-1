

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChessPanel extends JPanel implements MouseListener ,Runnable{
	//棋子数组
	//chesses[0][0]->chesses[18][18],默认是0，表示没有棋子，白色-1，黑色1
	int[][] chesses = new int[19][19];
	int currentColor = 1;//初始颜色：黑色，标志最近下的棋子颜色
	String blackMessage = "时间无限制";//就写个字
	String whiteMessage = "时间无限制";
	int blackTime = 0;//剩余落子时间
	int whiteTime = 0;
	Thread t = new Thread(this);//new一个线程
	int undoTimeX;//撤销时间
	int undoTimeY;
	
	@Override
	public void paint(Graphics g) {//画面板
		
	}

	public void drawBackground(Graphics g) {//画背景
		
	}

	public void drawGameInfo(Graphics g) {//写游戏信息
		
	}

	public void drawTime(Graphics g) {//计时器，需要游戏里设置计时才倒计时
		
	}

	public void drawChessBoard(Graphics g) {//画棋盘
		
	}
	boolean gameOver = false;//游戏结束标志
	@Override
	public void mouseClicked(MouseEvent e) {//鼠标点击事件
		
	}
	
	public String currentColorStringfy() {//判断最近一次落子的颜色

	}

	public void playChess(int mouseX,int mouseY) {//落子
		
	}
	
	public boolean checkWin() { //判断输赢
		
	}
	
	public boolean checkOneDirection() {//检查是否已经五子连
		
	}
	
	public void run() {//运行
		
	}
	
	//下面都是检查某个功能点的范围
	public boolean isChessBoardRange (int mouseX, int mouseY) {

	}

	public boolean isStartGameRange (int mouseX, int mouseY) {

	}

	public boolean isSettingRange (int mouseX, int mouseY) {

	}

	public boolean isGameBriefRge (int mouseX, int mouseY) {

	}
	
	public boolean isDefeat (int mouseX, int mouseY) {

	}

	public boolean isGiveUpRange (int mouseX, int mouseY) {

	}

	public boolean isAboutRange (int mouseX, int mouseY) {

	}

	public boolean isExitRange (int mouseX, int mouseY) {

	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}