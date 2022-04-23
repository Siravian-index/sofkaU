class Ball {
    constructor(x, y, radius, board) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.board = board;
        this.speedX = 3;
        this.speedY = 0;
        board.ball = this;
        this.kind = 'circle';
    }
}
export default Ball;
