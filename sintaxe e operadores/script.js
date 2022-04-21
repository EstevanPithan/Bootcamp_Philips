alert('PROGRAMA DE COMPARAÇÃO ENTRE DOIS NÚMEROS!!!!!!!!')
function desafio() {
  let num1 = Number(prompt('Insira o primeiro número'))
  let num2 = Number(prompt('Insira o segundo número'))
  let iguais
  let relacao1
  let relacao2
  let soma = num1 + num2

  num1 === num2 ? (iguais = 'são') : (iguais = 'não')
  soma > 10 ? (relacao1 = 'maior') : (relacao1 = 'menor')
  soma > 20 ? (relacao2 = 'maior') : (relacao2 = 'menor')

  alert(
    `Os números ${num1} e ${num2} ${iguais} iguais. Sua soma é ${soma}, que é ${relacao1} que 10 e ${relacao2} que 20`
  )
  prompt('Deseja testar novamente?\n 1 - Sim\n 2 - Não') == 1
    ? desafio()
    : alert('Até mais')
}

desafio()
