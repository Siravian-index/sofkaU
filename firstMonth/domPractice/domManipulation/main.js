const addRowBtn = document.querySelector('#add-row')
const addColumnBtn = document.querySelector('#add-column')
const table = document.querySelector('#table')
// tr = new rows
// td inside tr = new column

console.log(addRowBtn)

const rowBtnOnClick = () => {
  console.log('testing')
  const tr = generateRow()
  const td = generateColumn('testing')
  tr.append(td)
}

const generateRow = () => {
  const tr = document.createElement('tr')
  return tr
}

const generateColumn = (content) => {
  const td = document.createElement('td')
  td.textContent = content
  return td
}

addRowBtn.addEventListener('click', rowBtnOnClick)
