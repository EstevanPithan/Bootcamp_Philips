const alunos = [
  (aluno1 = {
    nome: 'João',
    nota: 7
  }),
  (aluno2 = {
    nome: 'Maria',
    nota: 8
  }),
  (aluno3 = {
    nome: 'José',
    nota: 6
  }),
  (aluno4 = {
    nome: 'Roberto',
    nota: 10
  }),
  (aluno5 = {
    nome: 'Creuza',
    nota: 5
  })
]

function aprovados(alunos, media) {
  let arrAprovados = []
  // let j = 0 - substitui esse contador pois há a possibilidade de usar o método push

  for (let i = 0; i < alunos.length; i++) {
    const { nota, nome } = alunos[i]

    if (nota >= media) {
      arrAprovados.push(nome)

      // arrAprovados.push(alunos[i].nome) - utilizando o objecct destructing não há a necessicade de utilizar dessa forma
      // arrAprovados[j] = alunos[i].nome
      // j++
    }
  }
  return arrAprovados
}

console.log(aprovados(alunos, 7))
