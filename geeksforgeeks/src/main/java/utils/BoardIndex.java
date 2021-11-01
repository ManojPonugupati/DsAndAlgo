package utils;

public final class BoardIndex {

    public BoardIndex(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    final int row;
    final int col;


}
