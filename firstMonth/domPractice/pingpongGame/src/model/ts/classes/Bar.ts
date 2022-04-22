import Board from './Board.js'

class Bar {
  x: number
  y: number
  width: number
  height: number
  board: Board
  kind: string
  constructor(x: number, y: number, width: number, height: number, board: Board) {
    this.x = x
    this.y = y
    this.width = width
    this.height = height
    this.board = board
    this.board.bars.push(this)
    this.kind = 'rectangle'
  }

  down() {}

  up() {}
}

export default Bar
