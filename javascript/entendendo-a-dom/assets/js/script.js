// const body = document.getElementsByTagName('body')[0]
// const h1 = document.getElementById('mode')
// const botao = document.getElementById('botao')
// let temaClaro = true

// function trocaCor() {
//   temaClaro ? modeLight() : modeDark()
// }

// function modeLight() {
//   temaClaro = false
//   botao.classList.add('dark-mode')
//   body.classList.add('dark-mode')
//   botao.innerHTML = 'Light Mode'
//   h1.innerHTML = 'Dark Mode ON'
// }

// function modeDark() {
//   temaClaro = true
//   botao.classList.remove('dark-mode')
//   body.classList.remove('dark-mode')
//   botao.innerHTML = 'Dark Mode'
//   h1.innerHTML = 'Light Mode ON'
// }

// botao.addEventListener('click', trocaCor)

//------------------ UTILIZANDO O TOGGLE--------------------------
const body = document.getElementsByTagName('body')[0]
const h1 = document.getElementById('mode')
const botao = document.getElementById('botao')
let temaClaro = true

function trocaCor() {
  mudaClasses()
  temaClaro ? modeLight() : modeDark()
}

function mudaClasses() {
  body.classList.toggle('dark-mode')
  h1.classList.toggle('dark-mode')
  botao.classList.toggle('dark-mode')
}

function modeLight() {
  temaClaro = false
  botao.innerHTML = 'Light Mode'
  h1.innerHTML = 'Dark Mode ON'
}

function modeDark() {
  temaClaro = true
  botao.innerHTML = 'Dark Mode'
  h1.innerHTML = 'Light Mode ON'
}

botao.addEventListener('click', trocaCor)
