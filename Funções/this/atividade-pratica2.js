function calculaIdade(anos) {
  return `Daqui a ${anos} anos, ${this.nome} terá ${
    this.idade + anos
  } anos de idade`
}

const pessoa1 = {
  nome: 'João',
  idade: 39
}

const pessoa2 = {
  nome: 'José',
  idade: 13
}

const pessoa3 = {
  nome: 'Maria',
  idade: 60
}
console.log('Utilizando o call')
console.log(calculaIdade.call(pessoa1, 30))
console.log('Utilizando o apply')
console.log(calculaIdade.apply(pessoa1, [30]))
