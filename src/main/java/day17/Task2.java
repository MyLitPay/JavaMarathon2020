package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] arr = new ChessPiece[8][8];
        arr[0][0] = ChessPiece.ROOK_BLACK;
        arr[0][1] = ChessPiece.EMPTY;
        arr[0][2] = ChessPiece.EMPTY;
        arr[0][3] = ChessPiece.EMPTY;
        arr[0][4] = ChessPiece.EMPTY;
        arr[0][5] = ChessPiece.ROOK_BLACK;
        arr[0][6] = ChessPiece.KING_BLACK;
        arr[0][7] = ChessPiece.EMPTY;

        arr[1][0] = ChessPiece.EMPTY;
        arr[1][1] = ChessPiece.ROOK_WHITE;
        arr[1][2] = ChessPiece.EMPTY;
        arr[1][3] = ChessPiece.EMPTY;
        arr[1][4] = ChessPiece.PAWN_BLACK;
        arr[1][5] = ChessPiece.PAWN_BLACK;
        arr[1][6] = ChessPiece.EMPTY;
        arr[1][7] = ChessPiece.PAWN_BLACK;

        arr[2][0] = ChessPiece.PAWN_BLACK;
        arr[2][1] = ChessPiece.EMPTY;
        arr[2][2] = ChessPiece.KNIGHT_BLACK;
        arr[2][3] = ChessPiece.EMPTY;
        arr[2][4] = ChessPiece.EMPTY;
        arr[2][5] = ChessPiece.EMPTY;
        arr[2][6] = ChessPiece.PAWN_BLACK;
        arr[2][7] = ChessPiece.EMPTY;

        arr[3][0] = ChessPiece.QUEEN_BLACK;
        arr[3][1] = ChessPiece.EMPTY;
        arr[3][2] = ChessPiece.EMPTY;
        arr[3][3] = ChessPiece.BISHOP_WHITE;
        arr[3][4] = ChessPiece.EMPTY;
        arr[3][5] = ChessPiece.EMPTY;
        arr[3][6] = ChessPiece.EMPTY;
        arr[3][7] = ChessPiece.EMPTY;

        arr[4][0] = ChessPiece.EMPTY;
        arr[4][1] = ChessPiece.EMPTY;
        arr[4][2] = ChessPiece.EMPTY;
        arr[4][3] = ChessPiece.BISHOP_BLACK;
        arr[4][4] = ChessPiece.PAWN_WHITE;
        arr[4][5] = ChessPiece.EMPTY;
        arr[4][6] = ChessPiece.EMPTY;
        arr[4][7] = ChessPiece.EMPTY;

        arr[5][0] = ChessPiece.EMPTY;
        arr[5][1] = ChessPiece.EMPTY;
        arr[5][2] = ChessPiece.EMPTY;
        arr[5][3] = ChessPiece.EMPTY;
        arr[5][4] = ChessPiece.BISHOP_WHITE;
        arr[5][5] = ChessPiece.PAWN_WHITE;
        arr[5][6] = ChessPiece.EMPTY;
        arr[5][7] = ChessPiece.EMPTY;

        arr[6][0] = ChessPiece.PAWN_WHITE;
        arr[6][1] = ChessPiece.EMPTY;
        arr[6][2] = ChessPiece.EMPTY;
        arr[6][3] = ChessPiece.QUEEN_WHITE;
        arr[6][4] = ChessPiece.EMPTY;
        arr[6][5] = ChessPiece.PAWN_WHITE;
        arr[6][6] = ChessPiece.EMPTY;
        arr[6][7] = ChessPiece.PAWN_WHITE;

        arr[7][0] = ChessPiece.EMPTY;
        arr[7][1] = ChessPiece.EMPTY;
        arr[7][2] = ChessPiece.EMPTY;
        arr[7][3] = ChessPiece.EMPTY;
        arr[7][4] = ChessPiece.EMPTY;
        arr[7][5] = ChessPiece.ROOK_WHITE;
        arr[7][6] = ChessPiece.KING_WHITE;
        arr[7][7] = ChessPiece.EMPTY;

        ChessBoard chessBoard = new ChessBoard(arr);
        chessBoard.print();
    }
}
