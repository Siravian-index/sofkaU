// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/rest_parameters

// rest in params
const func = (...rest) => {
  // spread in body
  const max = Math.max(...rest)
  return max
}

const r = func(1, 11, 11, 13, 15, 16, 100, 1000000)
console.log(r)
