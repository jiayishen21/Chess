public class King extends Piece {
    King(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
        name = isWhite? 'k' : 'K';
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
        if(row == this.row && col == this.col) return false;
        return(Math.abs(row - this.row) < 2 && Math.abs(col - this.col) < 2);
    }
}
