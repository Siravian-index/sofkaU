class BoardView {
    constructor(canvas, board) {
        this.canvas = canvas;
        this.canvas.width = board.width;
        this.canvas.height = board.height;
        this.board = board;
        this.context = canvas.getContext('2d');
    }
    simpleDraw() {
        const elements = this.board.elements;
        for (const element of elements) {
            if (this.context) {
                this.draw(this.context, element);
            }
        }
    }
    draw(context, ballBars) {
        const bar = ballBars;
        switch (bar.kind) {
            case 'square':
                context.fillRect(bar.x, bar.y, bar.width, bar.height);
                break;
            default:
                break;
        }
    }
}
export default BoardView;
