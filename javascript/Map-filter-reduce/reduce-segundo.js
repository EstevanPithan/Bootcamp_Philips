let saldo = 50
const prods = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

function calcSaldo(valorProds, valorConta) {
  return valorConta - valorProds.reduce(callBack)
}

function callBack(prev, current) {
  console.log({ prev }, { current })
  return prev + current
}

console.log('O saldo em conta é de', calcSaldo(prods, saldo), 'reais')
