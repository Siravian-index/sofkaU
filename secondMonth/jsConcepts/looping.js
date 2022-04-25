const obj1 = { name: 'david' }
const obj2 = { name: 'carlos' }
const obj3 = { name: 'juan' }

const arr = [obj1, obj2, obj3]

// for i
// for (let i = 0; i < arr.length; i++) {
//   console.log(arr[i].name)
// }
// for of
// for (let i of arr) {
//   console.log(i.name)
// }

const cityKeyName = 'citizens'
const city = { name: 'medellin', citizens: 50000, temp: 22, key: true }
// city.name

// console.log(city.name)
// console.log(city[cityKeyName])
// for in
// const str1 = ""
// const str2 = ''
// const templateLiterals = ``
// for (const key in city) {
//   console.log(`key: ${key} and value: ${city[key]}`)
// }

const names = ['david', 'juan', 'carlos']
// forEach
names.forEach((name) => console.log(name))
