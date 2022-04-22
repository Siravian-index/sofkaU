import Bar from './classes/Bar.js'
import Board from './classes/Board.js'
import BoardView from './classes/BoardView.js'

function main() {
  const canvas = document.querySelector('#canvas') as HTMLCanvasElement
  const board = new Board(800, 400)
  const bar = new Bar(20, 100, 40, 100, board)
  const bar2 = new Bar(730, 100, 40, 100, board)
  const boardView = new BoardView(canvas, board)
  console.log(boardView)
  boardView.drawElement()
}

main()
