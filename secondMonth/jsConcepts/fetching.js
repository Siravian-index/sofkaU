// https://jsonplaceholder.typicode.com/
const url = 'https://jsonplaceholder.typicode.com/users'

// fetch can GET / POST / PUT / DELETE
// GET is done by default
const fetchData = async (url) => {
  const firstStep = await fetch(url)
  const secondStep = await firstStep.json()
  console.log(firstStep)
  console.log(secondStep)
}

fetchData(url)
