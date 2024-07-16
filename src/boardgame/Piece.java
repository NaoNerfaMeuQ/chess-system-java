package boardgame;

public class Piece{

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() { //Somente classes do mesmo pacote e subclasses podem acessar o board
        return board;
    }


}
