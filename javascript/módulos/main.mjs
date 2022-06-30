let pessoa = {
  nome: 'Estevan',
  idade: '27 anos',
  cidade: 'Uberlândia',
  hobby: 'Fazer cerveja'
}

import {
  mostraCidade as cidade,
  mostraHobby as hobby,
  mostraIdade as idade
} from './funcoes.mjs'

console.log(idade(pessoa))
console.log(cidade(pessoa))
console.log(hobby(pessoa))

// import { mostraCidade, mostraHobby, mostraIdade } from './funcoes.mjs'

// console.log(mostraIdade(pessoa))
// console.log(mostraCidade(pessoa))
// console.log(mostraHobby(pessoa))
