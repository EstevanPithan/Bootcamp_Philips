function filtraPares(arr) {
  return arr.filter(callBack)
}

function callBack(item) {
  return item % 2 === 0
}

let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

console.log('Os numeros pares são', filtraPares(array))
console.log(array)
