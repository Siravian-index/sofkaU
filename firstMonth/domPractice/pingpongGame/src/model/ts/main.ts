import Ball from './classes/Ball.js'
import Bar from './classes/Bar.js'
import Board from './classes/Board.js'
import BoardView from './classes/BoardView.js'

const canvas = document.querySelector('#canvas') as HTMLCanvasElement
const bar = new Bar(20, 100, 40, 100)
const bar2 = new Bar(730, 100, 40, 100)
const ball = new Ball(350, 100, 10)
const board = new Board(800, 400, [bar, bar2], ball)
const boardView = new BoardView(canvas, board)

document.addEventListener('keydown', function (event: KeyboardEvent) {
  event.preventDefault()
  const pressedKey: string = event.key
  const W = 'w'
  const S = 's'
  const ArrowUp = 'ArrowUp'
  const ArrowDown = 'ArrowDown'

  switch (pressedKey) {
    case W:
      bar.up()
      break
    case S:
      bar.down()
      break
    case ArrowUp:
      bar2.up()
      break
    case ArrowDown:
      bar2.down()
      break
    default:
      console.log('use w/s to move bar1, up/down to move bar2')
      break
  }
})

function main() {
  boardView.play()
  window.requestAnimationFrame(main)
}

window.requestAnimationFrame(main)
