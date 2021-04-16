import java.util.Scanner;
import java.io.File;

public class Board {
    static Piece[][] gameBoard;
    static Pawn enPassant;

    Board() throws Exception {
        readFile();
    }

    void readFile() throws Exception {
        Scanner fileInput = new Scanner(new File("GameData.txt"));
        gameBoard = new Piece[8][8];
        String curLine;
        for(int i = 0; i < 8; i ++) {
            curLine = fileInput.nextLine();
            for(int j = 0; j < 8; j ++) {
                char curPiece = curLine.charAt(j);

                if(curPiece == ' ') {
                    gameBoard[i][j] = null;
                }
                else if(curPiece == 'b' || curPiece == 'B') {
                    gameBoard[i][j] = new Bishop(curPiece == 'b', i, j);
                }
                else if(curPiece == 'k' || curPiece == 'K') {
                    gameBoard[i][j] = new King(curPiece == 'k', i, j);
                }
                else if(curPiece == 'n' || curPiece == 'N') {
                    gameBoard[i][j] = new Knight(curPiece == 'n', i, j);
                }
                else if(curPiece == 'p' || curPiece == 'P') {
                    gameBoard[i][j] = new Pawn(curPiece == 'p', i, j);
                }
                else if(curPiece == 'q' || curPiece == 'Q') {
                    gameBoard[i][j] = new Queen(curPiece == 'q', i, j);
                }
                else if(curPiece == 'r' || curPiece == 'R') {
                    gameBoard[i][j] = new Rook(curPiece == 'r', i, j);
                }
            }
        }
    }
}
