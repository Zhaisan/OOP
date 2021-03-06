package problem3;

public class Queen extends Piece {

	public Queen(Position pos1) {
		this.pos1 = pos1;
	}
	
	public boolean isLegalMove(Position pos2) {
		return isLegalMove(this.pos1, pos2);
	}
	
	public static boolean isLegalMove(Position pos1, Position pos2) {
		if (!Piece.isLegalMove(pos1, pos2)) {
			return false;
		}
		else if (Bishop.isLegalMove(pos1, pos2) || Rook.isLegalMove(pos1, pos2)) {
			return true;
		}
		return false;
		
	}

}
