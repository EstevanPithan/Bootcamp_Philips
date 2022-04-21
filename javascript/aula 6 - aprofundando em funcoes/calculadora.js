function calculadora() {
  let n1
  let n2
  let resultado
  const operacao = Number(
    prompt(
      'Escolha uma operação:\n 1 - Soma(+)\n 2 - Subtração(-)\n 3 - Multiplicação(*)\n 4 - Divisão(/)\n 5 - Divisão Inteira(%)\n 6 - Potenciação(**)\n 7 - Sair'
    )
  )

  if (
    operacao == 1 ||
    operacao == 2 ||
    operacao == 3 ||
    operacao == 4 ||
    operacao == 5 ||
    operacao == 6
  ) {
    n1 = Number(prompt('Insira o primeiro valor: '))
    n2 = Number(prompt('Insira o segundo valor: '))
  } else if (operacao == 7) {
    alert('Saindo....')
  } else {
    alert('Opção não é válida.')
    calculadora()
  }
  if (!n1 || !n2) {
    alert('Valores inválidos')
    calculadora()
  } else {
    switch (operacao) {
      case 1:
        soma()
        calculadora()
        break
      case 2:
        subtracao()
        calculadora()
        break
      case 3:
        1
        multiplicacao()
        calculadora()
        break
      case 4:
        divisao()
        break
      case 5:
        divisao_inteira()
        calculadora()
        break
      case 6:
        potenciacao()
        calculadora()
        break
      default:
        alert('Até mais!!!!')
        break
    }
  }

  function soma() {
    resultado = n1 + n2
    alert(`${n1} + ${n2} = ${resultado}`)
  }

  function subtracao() {
    resultado = n1 - n2
    alert(`${n1} - ${n2} = ${resultado}`)
  }

  function multiplicacao() {
    resultado = n1 * n2
    alert(`${n1} * ${n2} = ${resultado}`)
  }

  function divisao() {
    resultado = n1 / n2
    alert(`${n1} / ${n2} = ${resultado}`)
  }

  function divisao_inteira() {
    resultado = n1 % n2
    alert(`'O resto da divição entre ${n1} e ${n2} é ${resultado}`)
  }

  function potenciacao() {
    resultado = n1 ** n2
    alert(`${n1} elevado a ${n2} é igual a ${resultado}`)
  }
}

calculadora()
