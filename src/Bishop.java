public class Bishop extends Piece {

    Bishop(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
        name = isWhite? 'b' : 'B';
    }

    boolean move(int row, int col) {
        if(!isValid(row, col)) return false;
        this.row = row;
        this.col = col;
        return true;
    }

    boolean isLegal(int row, int col) {
        return true;
    }

    boolean isValid(int row, int col) {
        if(Math.abs(row - this.row) != Math.abs(col = this.col)) return false;
        return super.isValid(row, col);
    }

}
