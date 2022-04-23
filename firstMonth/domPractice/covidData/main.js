const ulRoot = document.querySelector('#ul-root')
const divRoot = document.querySelector('#root')
const btn = document.querySelector('#main-btn')
const url = 'https://api.covid19api.com/summary'

const fetchAllCountries = async () => {
  const blob = await fetch(url)
  const data = await blob.json()
  const countriesInfo = data.Countries
  const countryNames = countriesInfo.map((c) => c.Country)
  return countryNames
}

const fetchSpecificCountry = async (country) => {
  const blob = await fetch(url)
  const data = await blob.json()
  const allCountries = data.Countries
  const specificCountry = allCountries.filter((c) => c.Country.toLowerCase() === country.toLowerCase())
  return specificCountry
}

const showSpecificCountry = async (country) => {
  const data = await fetchSpecificCountry(country)
  const div = document.createElement('div')
  for (info of data) {
    const p = document.createElement('p')
    p.innerText = JSON.stringify(info, null, 2)
    p.addEventListener('click', p.remove)
    div.append(p)
  }
  divRoot.append(div)
}

const appendAllCountries = async (array) => {
  const countries = await array
  for (country of countries) {
    const li = document.createElement('li')
    li.innerText = country
    li.addEventListener('click', () => showSpecificCountry(li.innerText))
    ulRoot.append(li)
  }
}

btn.addEventListener('click', () => appendAllCountries(fetchAllCountries()))
