// https://jsonplaceholder.typicode.com/
const url = 'https://jsonplaceholder.typicode.com/users'

// fetch can GET / POST / PUT / DELETE
// GET is done by default
// const fetchData = async (url) => {
//   const blob = await fetch(url)
//   const data = await blob.json()
//   // const names = data.reduce((arr, person) => {
//   //   if (person.name.startsWith('C')) {
//   //     return [...arr, person.name]
//   //   }
//   //   return [...arr]
//   // }, [])

//   console.log(data)
// }

const postTest = {
  title: '',
  id: 21233,
  content: '',
}

// const createPost = async (post) => {
//   const blob = await fetch('myEndpoint', {
//     method: 'PATCH',
//     body: post,
//   })

//   const data = await blob.json()
// }

fetchData(url)

// callback
// promises

// const testFetch = () => {
//   fetch(url)
//     .then(result => {
//       console.log(result);
//     })
//     .then(data => {
//       console.log(data);
//     })
//     .catch(error => {
//       console.log(error);
//     })
// }
