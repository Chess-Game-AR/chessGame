public class Board {
    private final int WIDTH = 8;
    private final int HEIGHT = 8;
    private Spot[][] Board;
    public Board() {
        this.Board = new Spot[WIDTH][HEIGHT];
        for(int i = 0; i < WIDTH; i++) {
            for(int j = 0; j < HEIGHT; j++) {
                Board[i][j] = new Spot(i,j);
            }
        }
    }
    public String getBoardSpot(int i, int j) {
        return this.Board[i][j].getX() + ", " + this.Board[i][j].getY();
    }

}
