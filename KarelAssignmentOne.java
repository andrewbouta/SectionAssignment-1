import stanford.karel.*;

public class KarelAssignmentOne extends SuperKarel {

	public void run() {
		firstSteps();
		anyBeepersInMiddle();
		blockedPathNoBeepers();
		moveTwo();
		anyBeepersInMiddle();
		blockedPathNoBeepers();
		moveTwo();
		anyBeepersInMiddle();
		blockedPathNoBeepers();
		move();
	}
	// initial steps for Karel to get to (1, 3)
	private void firstSteps() {
		turnLeft();
		move();
		move();
		turnRight();
		move();
	}
	// Checks middle to see if beepers are present, moves to next loc
	private void anyBeepersInMiddle() {
		// while (frontIsClear())
		// for (int i = 0; i < 2; i++) // This is a test
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
				move();
			} else {
				cleaningBallot();
			}
		}
	}
	// Cleans Ballot, top to bottom
	private void cleaningBallot() {
		turnLeft();
		move();
		grabStrayBeepers();
		turnAround();
		move();
		move();
		grabStrayBeepers();
	}
	// Checks if path in front is clear and there's no beepers
	private void blockedPathNoBeepers() {
		while (frontIsBlocked() && noBeepersPresent()) {
			turnLeft();
			turnLeft();
		} 
		move();
		turnRight();
	}
	//  Grab stray beepers. If no beepers are in the spot of Karel, Pick up stray beepers.
	private void grabStrayBeepers() {
		while (beepersPresent()) {
			pickBeeper();
		}
	}
	// Karel moves 2x
	private void moveTwo() {
		move();
		move();
	}
}