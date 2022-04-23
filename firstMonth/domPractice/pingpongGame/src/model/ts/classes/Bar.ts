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

  down(event: KeyboardEvent) {
    event.preventDefault()
    this.y += this.speed
  }

  up(event: KeyboardEvent) {
    event.preventDefault()
    this.y -= this.speed
  }

  toString(): string {
    return `x: ${this.x} y: ${this.y}`
  }
}

export default Bar
