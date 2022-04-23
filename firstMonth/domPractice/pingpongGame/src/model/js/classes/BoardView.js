class BoardView {
    constructor(canvas, board) {
        this.canvas = canvas;
        this.canvas.width = board.width;
        this.canvas.height = board.height;
        this.board = board;
        this.context = canvas.getContext('2d');
    }
    clean() {
        var _a;
        (_a = this.context) === null || _a === void 0 ? void 0 : _a.clearRect(0, 0, this.board.width, this.board.height);
    }
    drawElement() {
        const bars = this.board.getBars();
        const ball = this.board.getBall();
        const elements = [...bars, ball];
        for (let i = elements.length - 1; i >= 0; i--) {
            if (this.context) {
                const element = elements[i];
                this.draw(this.context, element);
            }
        }
    }
    draw(context, ballBars) {
        // hard casting each element
        const bar = ballBars;
        const ball = ballBars;
        switch (ballBars.kind) {
            case 'rectangle':
                context.fillRect(bar.x, bar.y, bar.width, bar.height);
                break;
            case 'circle':
                context.beginPath();
                context.arc(ball.x, ball.y, ball.radius, 0, 7);
                context.fill();
                context.closePath();
                break;
            default:
                break;
        }
    }
    play() {
        this.clean();
        this.drawElement();
        this.board.ball.move();
    }
}
export default BoardView;
