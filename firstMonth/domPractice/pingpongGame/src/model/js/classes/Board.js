class Board {
    constructor(width, height, bars, ball) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.gameOver = false;
        this.bars = bars;
        this.ball = ball;
    }
    getBars() {
        return this.bars;
    }
    getBall() {
        return this.ball;
    }
}
export default Board;
