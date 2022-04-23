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

  checkCollisions() {
    // hit() checks collisions
    const hit = (bar: Bar, ball: Ball): boolean => {
      let didHit = false
      if (ball.x + ball.width >= bar.x && ball.x < bar.x + bar.width) {
        if (ball.y + ball.height >= bar.y && ball.y < bar.y + bar.height) {
          didHit = true
        }
      }
      if (ball.x <= bar.x && ball.x + ball.width >= bar.x + bar.width) {
        if (ball.y <= bar.y && ball.y + ball.height >= bar.y + bar.height) {
          didHit = true
        }
      }
      if (bar.x <= ball.x && bar.x + bar.width >= ball.x + ball.width) {
        if (bar.y <= ball.y && bar.y + bar.height >= ball.y + ball.height) {
          didHit = true
        }
      }
      return didHit
    }
    const bars = this.board.getBars()
    for (let i = bars.length - 1; i >= 0; i--) {
      const bar = bars[i]
      if (hit(bar, this.board.ball)) {
        this.board.ball.collision(bar)
      }
    }
  }

  play() {
    if (this.board.isPlaying) {
      this.clean()
      this.drawElement()
      this.checkCollisions()
      this.board.ball.move()
    }
  }
}

export default BoardView
