import Ball from './classes/Ball.js';
import Bar from './classes/Bar.js';
import Board from './classes/Board.js';
import BoardView from './classes/BoardView.js';
const W = 'w';
const S = 's';
const ArrowUp = 'ArrowUp';
const ArrowDown = 'ArrowDown';
const SpaceBar = ' ';
const BOARD_WIDTH = 800;
const BOARD_HEIGHT = 400;
const canvas = document.querySelector('#canvas');
const bar = new Bar(20, 100, 40, 100);
const bar2 = new Bar(730, 100, 40, 100);
const ball = new Ball(350, 100, 10, BOARD_WIDTH);
const board = new Board(BOARD_WIDTH, BOARD_HEIGHT, [bar, bar2], ball);
const boardView = new BoardView(canvas, board);
document.addEventListener('keydown', function (event) {
    const pressedKey = event.key;
    switch (pressedKey) {
        case W:
            bar.up(event);
            break;
        case S:
            bar.down(event);
            break;
        case ArrowUp:
            bar2.up(event);
            break;
        case ArrowDown:
            bar2.down(event);
            break;
        case SpaceBar:
            board.pause(event);
            break;
        default:
            break;
    }
});
function main() {
    boardView.play();
    window.requestAnimationFrame(main);
}
window.requestAnimationFrame(main);
