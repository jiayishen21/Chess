public abstract class Piece {
    protected char name;
    protected boolean isWhite;
    protected int row;
    protected int col;

    Piece(boolean isWhite, int row, int col) {
        this.isWhite = isWhite;
        this.row = row;
        this.col = col;
    }

    char getName() {
        return name;
    }

    boolean isWhite() {
        return isWhite;
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }

    boolean move(int row, int col) {
        if(!isLegal(row, col)) return false;
        this.row = row;
        this.col = col;
        return true;
    }

    abstract boolean isLegal(int row, int col);

    boolean isValid(int row, int col) {
        if(row == this.row && col == this.col) return false;
        int dirRow = row - this.row;
        int dirCol = col - this.col;
        //Setting direction vectors to 1 or -1
        dirRow = dirRow < 0? -1 : (dirRow > 0? 1 : 0);
        dirCol = dirCol < 0? -1 : (dirCol > 0? 1 : 0);
        int tempRow = this.row;
        int tempCol = this.col;
        while(true) {
            tempRow += dirRow;
            tempCol += dirCol;
            if(dirRow == row && dirCol == col) return true;
            if(Board.gameBoard[tempRow][tempCol] != null) return false;
        }
    }
}
