import Bar from './classes/Bar.js';
import Board from './classes/Board.js';
import BoardView from './classes/BoardView.js';
function main() {
    const canvas = document.querySelector('#canvas');
    const board = new Board(800, 400);
    const bar = new Bar(20, 100, 40, 100, board);
    const bar2 = new Bar(730, 100, 40, 100, board);
    const boardView = new BoardView(canvas, board);
    boardView.drawElement();
    document.addEventListener('keydown', function (event) {
        const pressedKey = event.key;
        if (pressedKey === 'w') {
            bar.up();
        }
        else if (pressedKey === 's') {
            bar.down();
        }
        console.log(bar.toString());
    });
}
main();
