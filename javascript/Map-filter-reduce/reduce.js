function somaNumeros(arr) {
  return arr.reduce(callBack)
}

function callBack(prev, current) {
  console.log({ prev }, { current })
  return prev + current
}

let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

console.log(somaNumeros(array))
console.log(array)
