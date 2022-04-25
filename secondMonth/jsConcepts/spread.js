// spread syntax =>  ...

// merge two (or more) array
const oddNumbers = [1, 3, 5, 7, 9]
const evenNumbers = [0, 2, 4, 6, 8]
// const contactedArr = oddNumbers.concat(evenNumbers)
const allNumbers = [...oddNumbers, ...evenNumbers]
// console.log(allNumbers)
// console.log(contactedArr)

// merge two (or more) obj
const data1 = { name: 'david', age: 23, address: { city: 'Cali' } }
const data2 = { hasPet: true, isHappy: true }
// const person = JSON.parse(JSON.stringify(data1))
const person = { ...data1, ...data2 }
person.address.city = 'Medellin'
console.log('person', person)
console.log('data1', data1)
