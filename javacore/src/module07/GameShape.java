package module07;

class GameShape {
	public void displayShape() {
		System.out.println("displaying shape");
	}
}

class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("moving game piece");
	}
}

class TilePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("getting adjacent tiles");
	}
}
