import { ballBars } from './../types/ballBars'
import Bar from './Bar.js'
import Board from './Board.js'

class BoardView {
  canvas: HTMLCanvasElement
  board: Board
  context: CanvasRenderingContext2D | null
  constructor(canvas: HTMLCanvasElement, board: Board) {
    this.canvas = canvas
    this.canvas.width = board.width
    this.canvas.height = board.height
    this.board = board
    this.context = canvas.getContext('2d')
  }

  simpleDraw() {
    const elements = this.board.elements
    for (const element of elements) {
      if (this.context) {
        this.draw(this.context, element)
      }
    }
  }

  draw(context: CanvasRenderingContext2D, ballBars: ballBars) {
    const bar = ballBars as Bar
    switch (bar.kind) {
      case 'square':
        context.fillRect(bar.x, bar.y, bar.width, bar.height)
        break

      default:
        break
    }
  }
}

export default BoardView
