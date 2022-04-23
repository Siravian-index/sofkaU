import Bar from './Bar'

class Ball {
  x: number
  y: number
  width: number
  height: number
  radius: number
  speedX: number
  speedY: number
  speed: number
  kind: string
  direction: number
  bounceAngle: number
  maxBounceAngle: number
  boardWidth: number
  constructor(x: number, y: number, radius: number, boardWidth: number) {
    this.x = x
    this.y = y
    this.radius = radius
    this.speed = 5
    this.speedX = 3
    this.speedY = 0
    this.kind = 'circle'
    this.direction = 1
    this.width = 0
    this.height = 0
    this.bounceAngle = 0
    this.maxBounceAngle = Math.PI / 12
    this.boardWidth = boardWidth
  }

  move() {
    this.x += this.speedX * this.direction
    this.y += this.speedY
  }

  collision(bar: Bar) {
    const relativeIntersectY = bar.y + bar.height / 2 - this.y
    const normalizedIntersectY = relativeIntersectY / (bar.height / 2)
    this.bounceAngle = normalizedIntersectY * this.maxBounceAngle
    this.speedY = this.speed * Math.sin(this.bounceAngle)
    this.speedX = this.speed * Math.cos(this.bounceAngle)
    if (this.x > this.boardWidth / 2) {
      this.direction = -1
    } else {
      this.direction = 1
    }
  }
}

export default Ball
