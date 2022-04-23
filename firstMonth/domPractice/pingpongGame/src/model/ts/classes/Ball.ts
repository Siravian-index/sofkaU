import Board from './Board'

class Ball {
  x: number
  y: number
  radius: number
  board: Board
  speedX: number
  speedY: number
  kind: string
  constructor(x: number, y: number, radius: number, board: Board) {
    this.x = x
    this.y = y
    this.radius = radius
    this.board = board
    this.speedX = 3
    this.speedY = 0
    board.ball = this
    this.kind = 'circle'
  }
}

export default Ball
