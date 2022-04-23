import Board from './Board.js'

class Bar {
  x: number
  y: number
  width: number
  height: number
  kind: string
  speed: number
  constructor(x: number, y: number, width: number, height: number) {
    this.x = x
    this.y = y
    this.width = width
    this.height = height
    this.kind = 'rectangle'
    this.speed = 10
  }

  down() {
    this.y += this.speed
  }

  up() {
    this.y -= this.speed
  }

  toString(): string {
    return `x: ${this.x} y: ${this.y}`
  }
}

export default Bar
