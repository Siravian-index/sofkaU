import { ballBars } from './../types/ballBars'
import Ball from './Ball'
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

  clean() {
    this.context?.clearRect(0, 0, this.board.width, this.board.height)
  }

  drawElement() {
    const bars = this.board.getBars()
    const ball = this.board.getBall()
    const elements: ballBars[] = [...bars, ball]
    for (let i = elements.length - 1; i >= 0; i--) {
      if (this.context) {
        const element = elements[i]
        this.draw(this.context, element)
      }
    }
  }

  draw(context: CanvasRenderingContext2D, ballBars: ballBars) {
    // hard casting each element
    const bar = ballBars as Bar
    const ball = ballBars as Ball
    switch (ballBars.kind) {
      case 'rectangle':
        context.fillRect(bar.x, bar.y, bar.width, bar.height)
        break
      case 'circle':
        context.beginPath()
        context.arc(ball.x, ball.y, ball.radius, 0, 7)
        context.fill()
        context.closePath()
        break
      default:
        break
    }
  }

  play() {
    this.clean()
    this.drawElement()
    this.board.ball.move()
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
}

export default BoardView
