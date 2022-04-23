class Board {
    constructor(width, height, bars, ball) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.gameOver = false;
        this.bars = bars;
        this.ball = ball;
        this.isPlaying = true;
    }
    getBars() {
        return this.bars;
    }
    getBall() {
        return this.ball;
    }
    pause(event) {
        event.preventDefault();
        this.isPlaying = !this.isPlaying;
    }
}
export default Board;
