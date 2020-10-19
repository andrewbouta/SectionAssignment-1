import stanford.karel.*;
import acm.program.*;

public class KarelMidterm extends SuperKarel {
	
	public void run() {
		karelFirst();
		for (int i = 0; i < 4; i++) {
			karelMove();
			innerTurn();
		}
	}
	
	private void karelFirst() {
		turnLeft();
		move();
		turnRight();
	}
	private void karelMove() {
		move();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	private void innerTurn() {
		// 
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}	
}
