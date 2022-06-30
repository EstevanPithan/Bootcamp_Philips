const dado1 = [1, 2, 3, 4, 5]

function verificaArray(array, num) {
  try {
    if (!array && !num) throw new ReferenceError('Envie os Parâmetros')
    if (typeof array !== 'object')
      throw new TypeError('Array precisa ser do tipo objeto')
    if (typeof num !== 'number')
      throw new TypeError('Num precisa ser do tipo number')
    if (array.length !== num) throw new RangeError('Tamanho é inválido!')
    return array
  } catch (e) {
    if (e instanceof ReferenceError) {
      console.log('Esse erro é um ReferenceError')
      console.log(e.message)
    } else if (e instanceof TypeError) {
      console.log('Esse erro é um TypeError')
      console.log(e.message)
    } else if (e instanceof RangeError) {
      console.log('Esse erro é um RangeError')
      console.log(e.message)
    } else {
      console.log('Tipo de erro não esperado:' + e)
    }
  }
}
console.log(verificaArray())
console.log(verificaArray('a', 5))
console.log(verificaArray(dado1, 'a'))
console.log(verificaArray(dado1, 4))
console.log(verificaArray(dado1, 5))
