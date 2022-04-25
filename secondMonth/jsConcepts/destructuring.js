// const arrayDestructuring = (name, age, phone, color) => [name, age, phone, color]
const arrayDestructuring = (name, age) => [name, age]

// const [firstName, age] = arrayDestructuring('david', 23, 311111, 'Blue')
// console.log(firstName, age)

// ---------------------------------------
// works with objs too
// const objDestructuring = (score, player, difficulty, level) => {
//   return { score, player, difficulty, level }
// }
// const data = objDestructuring(200, 'player', 'hard', 5)
// console.log(data)
// // const { score } = data
// // console.log(score)

// ---------------------------------------
// functions as first class citizens
// const arrayDestructuring = (name) => {
//   function upper(str) {
//     name = str
//     console.log(name.toUpperCase())
//   }
//   return [name, upper]
// }

// const [firstName, setName] = arrayDestructuring('david')
// console.log(firstName)
// setName('Juan')
