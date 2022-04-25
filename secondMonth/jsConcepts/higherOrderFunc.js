// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array

const numbers = [5, 1, 2, 3, 4, 6, 7, 8, 9, 10]
// filter
const higherThanFive = numbers.filter((number) => number > 5)
// console.log(higherThanFive)

// const found = numbers.find((number, i) => {
//   console.log('index', i)
//   return number === 5
// })
console.log(found)
// const higherThanFive = []
// for (let i = 0; i < numbers.length; i++) {
//   if (numbers[i] > 5) {
//     higherThanFive.push(numbers[i])
//   }
// }
// console.log(higherThanFive)
//  map
const double = numbers.map((number) => number * 2)

// console.log(double)

// reduce
const total = numbers.reduce((prevValue, current) => {
  return {
    ...prevValue,
    [current]: current,
  }
}, {})

// const obj = { 1: 1, 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 10: 10 }
// console.log(total)
