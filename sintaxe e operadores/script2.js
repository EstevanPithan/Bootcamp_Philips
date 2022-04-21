function comparaNumeros(num1, num2) {
  const primeiraFrase = criaPrimeiraFrase(num1, num2)
  const segundaFrase = ciraSegundaFrase(num1, num2)
  console.log(`${primeiraFrase} ${segundaFrase}`)
}

function criaPrimeiraFrase(num1, num2) {
  let saoIguais = ''
  num1 !== num2 ? (saoIguais = 'não') : (saoIguais = '')
  return `Os números ${num1} e ${num2} ${saoIguais} são iguais.`
}

function ciraSegundaFrase(num1, num2) {
  let relacao1 = ''
  let relacao2 = ''
  const soma = num1 + num2
  soma > 10 ? (relacao1 = 'maior') : (relacao1 = 'menor')
  soma > 20 ? (relacao2 = 'maior') : (relacao2 = 'menor')
  return `Sua soma é ${soma}, que é ${relacao1} que 10 e ${relacao2} que 20.`
}

console.log(comparaNumeros(20, 20))
