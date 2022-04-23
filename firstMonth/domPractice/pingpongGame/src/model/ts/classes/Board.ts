import { ballBars } from './../types/ballBars'
import Ball from './Ball.js'
import Bar from './Bar'

class Board {
  width: number
  height: number
  playing: boolean
  gameOver: boolean
  bars: Bar[]
  ball: Ball
  constructor(width: number, height: number) {
    this.width = width
    this.height = height
    this.playing = false
    this.gameOver = false
    this.bars = [] as Bar[]
    this.ball = new Ball()
  }
  get elements() {
    const elements = this.bars
    // elements.push(this.ball)
    return elements
  }
}

export default Board
