import Board from './classes/Board.js';
import BoardView from './classes/BoardView.js';
function main() {
    const canvas = document.querySelector('#canvas');
    const board = new Board(800, 400);
    const boardView = new BoardView(canvas, board);
    console.log(boardView);
    console.log(board.elements);
}
main();
