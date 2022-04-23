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
        const elements = this.board.elements;
        for (let i = elements.length - 1; i >= 0; i--) {
            if (this.context) {
                const element = elements[i];
                this.draw(this.context, element);
            }
        }
    }
    draw(context, bar) {
        switch (bar.kind) {
            case 'rectangle':
                console.log('inside switch rectangle');
                context.fillRect(bar.x, bar.y, bar.width, bar.height);
                break;
            default:
                break;
        }
    }
    play() {
        this.clean();
        this.drawElement();
    }
}
export default BoardView;
