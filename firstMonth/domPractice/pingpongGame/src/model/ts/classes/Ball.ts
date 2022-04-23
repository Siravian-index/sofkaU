import Board from './Board'

class Ball {
  x: number
  y: number
  radius: number
  speedX: number
  speedY: number
  kind: string
  constructor(x: number, y: number, radius: number) {
    this.x = x
    this.y = y
    this.radius = radius
    this.speedX = 3
    this.speedY = 0
    this.kind = 'circle'
  }
}

export default Ball
