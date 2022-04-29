// const arrayDestructuring = (name, age, phone, color) => [name, age, phone, color]
// const [, , phone, color] = arrayDestructuring('david', 23, 2323123, 'blue')
// console.log(phone, color)

const arrayDestructuring = (name, age) => [name, age]

const [name, age] = arrayDestructuring('david', 23)
console.log(name, age)

// const [firstName, age] = arrayDestructuring('david', 23, 311111, 'Blue')
// console.log(firstName, age)

// ---------------------------------------
// works with objs too
// const objDestructuring = (score, player, difficulty, level) => {
//   return { score, player, difficulty, level }
// }

// const { difficulty: d, score, level, player } = objDestructuring(200, 'player', 'hard', 5)
// const difficulty = "test"
// console.log(d.toUpperCase())

// const person = {
//   name: 'david',
//   address: {
//     city: {
//       name: 'Caicedonia',
//       weather: 'sunny',
//       c: 23,
//     },
//   },
// }

// const {
//   address: {
//     city: { name: cityName, weather, c },
//   },
// } = person
// console.log(cityName, weather, c)
// console.log(typeof cityName, typeof weather, typeof c)

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
// setName('carlos')
