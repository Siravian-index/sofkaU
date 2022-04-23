import Bar from './Bar'

class Ball {
  x: number
  y: number
  radius: number
  speedX: number
  speedY: number
  kind: string
  direction: number
  constructor(x: number, y: number, radius: number) {
    this.x = x
    this.y = y
    this.radius = radius
    this.speedX = 3
    this.speedY = 0
    this.kind = 'circle'
    this.direction = 1
  }

  move() {
    this.x += this.speedX * this.direction
    this.y += this.speedY
  }

  collision(bar: Bar) {}
}

export default Ball
