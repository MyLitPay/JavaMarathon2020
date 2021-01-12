package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] arr = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            arr[i] = ChessPiece.PAWN_WHITE;
        }
        for (int i = 4; i < 8; i++) {
            arr[i] = ChessPiece.ROOK_BLACK;
        }

        for (ChessPiece x : arr) {
            System.out.print(x.getSymbol());
        }
    }
}