import Bar from './classes/Bar.js'
import Board from './classes/Board.js'
import BoardView from './classes/BoardView.js'

function main() {
  const canvas = document.querySelector('#canvas') as HTMLCanvasElement
  const board = new Board(800, 400)
  const bar = new Bar(20, 100, 40, 100, board)
  const bar2 = new Bar(730, 100, 40, 100, board)
  const boardView = new BoardView(canvas, board)
  boardView.drawElement()

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

  // window.requestAnimationFrame(main)
}

window.requestAnimationFrame(main)

// window.addEventListener('load', main)
// setInterval(main, 1000)
