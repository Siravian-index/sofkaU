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

  drawElement() {
    const elements = this.board.elements
    for (let i = elements.length - 1; i >= 0; i--) {
      if (this.context) {
        const element = elements[i]
        this.draw(this.context, element)
      }
    }
  }

  // draw(context: CanvasRenderingContext2D, ballBars: ballBars) {
  //   const bar = ballBars as Bar
  //   // const ball = ballBars as Ball
  //   switch (bar.kind) {
  //     case 'rectangle':
  //       console.log('inside switch rectangle')
  //       context.fillRect(bar.x, bar.y, bar.width, bar.height)
  //       break
  //     default:
  //       break
  //   }
  // }

  draw(context: CanvasRenderingContext2D, bar: Bar) {
    // const ball = ballBars as Ball
    switch (bar.kind) {
      case 'rectangle':
        console.log('inside switch rectangle')
        context.fillRect(bar.x, bar.y, bar.width, bar.height)
        break
      default:
        break
    }
  }
}

export default BoardView
