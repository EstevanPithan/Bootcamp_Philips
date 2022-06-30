// // Arquivo para aprendizado this

// const pessoa = {
//   firstName: 'Estevan',
//   lastName: 'Pithan',
//   id: 1,
//   fullName: function () {
//     return this.firstName + ' ' + this.lastName
//   },
//   getId: function () {
//     return this.id
//   }
// }

// console.log(pessoa.fullName())
// console.log(pessoa.getId())
// ------------------------------------------------------
// const pessoa = {
//   nome: 'Miguel'
// }

// const animal = {
//   nome: 'Murphy'
// }

// function getSomething() {
//   console.log(this.nome)
// }

// getSomething.call(pessoa)
// getSomething.call(animal)

// const myObj = {
//   num1: 2,
//   num2: 4
// }

// function soma(a, b) {
//   console.log(this.num1 + this.num2 + a + b)
// }

// soma.call(myObj, 1, 5)
// -------------------------------------------------
// Diferença entre o apply e o call é que o Appply passa os dados dentro de um array

// const pessoa = {
//   nome: 'Miguel'
// }

// const animal = {
//   nome: 'Godi'
// }

// function getSomething() {
//   console.log(this.nome)
// }

// getSomething.apply(pessoa)
// getSomething.apply(animal)

// const myObj = {
//   num1: 2,
//   num2: 4
// }

// function soma(a, b) {
//   console.log(this.num1 + this.num2 + a + b)
// }

// soma.apply(myObj, [1, 5])
// -------------------------------------------------
// Bind clona a estrutura da função onde é chamada e aplica o valor do obejto passado como parâmetro

// const myObj = {
//   nome: 'Bruno',
//   idade: 39,
//   animal: 'Voltaire'
// }

// const retornaNomes = function () {
//   return [this.nome, this.idade, this.animal]
// }

// let bruno = retornaNomes.bind(myObj)

// console.log(bruno())

// ----------------------------------------------
// Arrow Functions, as três funções abaixo são iguais
// const helloWorld = function () {
//   return 'Hello World'
// }

// const helloWorld = () => {
//   return 'Hello World'
// }

// const helloWorld = () => 'Hello World'
