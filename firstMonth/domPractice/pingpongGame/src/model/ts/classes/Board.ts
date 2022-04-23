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
  constructor(width: number, height: number, bars: Bar[], ball: Ball) {
    this.width = width
    this.height = height
    this.playing = false
    this.gameOver = false
    this.bars = bars
    this.ball = ball
  }

  getBars(): Bar[] {
    return this.bars
  }
  getBall(): Ball {
    return this.ball
  }
}

export default Board
