package myobj.tong;

import java.util.Scanner;

public class TongGame {
	Scanner sc;
	
	Barrel barrel;
	int mode;
	
	int turn;
	int numOfPlayer;
	
	public TongGame(int mode) {
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
	}
	
	public TongGame(int mode, int numOfPlayer) {
		this(mode);
		this.numOfPlayer = numOfPlayer;
	}
	
	public void start() {
		switch (this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default:
			System.out.println("아직 구현되지 않은 모드");
			break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while (true) {
			System.out.println((turn + 1) + "턴 > ");
			System.out.print("'Player" + ((turn % numOfPlayer) + 1) + "'의 차례");
			int slot = sc.nextInt();
			
			boolean fork_result = barrel.fork(slot);
			if (fork_result) {
				if (barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다...");
					System.out.println("'Player" + ((turn % numOfPlayer) + 1) + "'의 패배!");
					break;
				}
				
				turn++;
			}
		}
	}
	
	void pvc() {
		while (true) {
			System.out.println((turn + 1) + "턴 > ");
			if (turn % 2 == 0) {
				System.out.println("플레이어 턴");
				int slot = sc.nextInt();
				
				boolean fork_result = barrel.fork(slot);
				if (fork_result) {
					if (barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다...");
						System.out.println("플레이어 패배!");
						break;
					}
					
					turn++;
				}
			} else {
				System.out.println("컴퓨터 턴");
				int slot = (int)(Math.random() * barrel.size);
				System.out.println("Computer : " + slot + "!!");
				
				boolean fork_result = barrel.fork(slot);
				if (fork_result) {
					if (barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다...");
						System.out.println("플레이어 승리!");
						break;
					}
					
					turn++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TongGame testGame = new TongGame(99);
		
		testGame.start();
		testGame.config(1);
		testGame.start();
	}
}
