public class Pawn extends Piece {
    private boolean hasMoved;

    Pawn(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
        name = isWhite? 'p' : 'P';
        hasMoved = false;
    }

    boolean isLegal(int row, int col) {
        
        return true;
    }

    boolean isValid(int row, int col) {
        int dirRow = row - this.row;
        int dirCol = Math.abs(col - this.col);
        //Not moved yet
        if(dirCol > 1) return false;
        if(dirCol == 1) {
            if(isWhite && dirRow == -1) {
                if(Board.gameBoard[row][col] != null && !Board.gameBoard[row][col].isWhite) return true;
                if(Board.gameBoard[this.row][col] == Board.enPassant) return true;
            }  
            else if(!isWhite && dirRow == 1){
                if(Board.gameBoard[row][col] != null && Board.gameBoard[row][col].isWhite) return true;
                if(Board.gameBoard[this.row][col] == Board.enPassant) return true;
            }
            
            return false;
        }
        else if(!hasMoved && dirRow == -2 && isWhite) {
            if(Board.gameBoard[this.row - 1][this.col] != null) return false;
            if(Board.gameBoard[this.row - 2][this.col] != null) return false;
        }
        else if(!hasMoved && dirRow == 2 && !isWhite) {
            if(Board.gameBoard[this.row + 1][this.col] != null) return false;
            if(Board.gameBoard[this.row + 2][this.col] != null) return false;
        }
        else if(dirRow == -1 && isWhite) {
            if(Board.gameBoard[this.row - 1][this.col] != null) return false;
            if(Board.gameBoard[this.row - 2][this.col] != null) return false;
        }
        else if(dirRow == 1 && !isWhite) {
            if(Board.gameBoard[this.row + 1][this.col] != null) return false;
            if(Board.gameBoard[this.row + 2][this.col] != null) return false;
        }

        return true;

    }
}
