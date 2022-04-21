// Solução 1
function verificaPalindromo(string) {
  if (!string) return 'String inexistente'
  let stringContrario = string.split('').reverse().join('')
  let resultado
  string === stringContrario ? (resultado = '') : (resultado = 'não')

  console.log(
    `A palavra ao contrário é: ${stringContrario} e ela ${resultado} é um Palindromo de ${string}`
  )
}

verificaPalindromo('abccba abccba')

function verificaPalindromo2(fraseInicial) {
  if (!fraseInicial) return 'String inexistente'
  let string = fraseInicial.toUpperCase()
  for (let i = 0; i < string.length / 2; i++) {
    if (string[i] !== string[string.length - 1 - i]) {
      return false
    }
  }
  return true
}

console.log(verificaPalindromo2('EstevanNavetse '))
