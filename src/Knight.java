public class Knight extends Piece {
    Knight(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
        name = isWhite? 'n' : 'N';
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
        int dirRow = Math.abs(row - this.row);
        int dirCol = Math.abs(col - this.col);
        return (dirRow == 1 && dirCol == 2 || dirRow == 2 && dirCol == 1);
    }

}
