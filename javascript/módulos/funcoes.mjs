function mostraIdade(pessoa) {
  return `A idade de ${pessoa.nome} é de ${pessoa.idade}`
}

function mostraCidade(pessoa) {
  return `${pessoa.nome} mora na cidade de ${pessoa.cidade}`
}

function mostraHobby(pessoa) {
  return `o hobby de ${pessoa.nome} é ${pessoa.hobby}`
}

export { mostraCidade, mostraHobby, mostraIdade }
