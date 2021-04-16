public class Rook extends Piece {

    Rook(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
        name = isWhite? 'r' : 'R';
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
        if(this.row != row && this.col != col) return false;
        return super.isValid(row, col);
    }

}
