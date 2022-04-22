import Ball from './Ball.js';
class Board {
    constructor(width, height) {
        this.width = width;
        this.height = height;
        this.playing = false;
        this.gameOver = false;
        this.bars = [];
        this.ball = new Ball();
    }
    get elements() {
        const elements = this.bars;
        elements.push(this.ball);
        return elements;
    }
}
export default Board;
