public class Spot {
    private int x;
    private int y;
    private Piece p;
    //constructor
    public Spot(int x, int y, Piece p) {
        this.x = x;
        this.y = y;
        this.p = p;
    }
    //accessors
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public Piece getPiece() {
        return this.p;
    }
    //mutators
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setPiece(Piece p) {
        this.p = p;
    }
}
