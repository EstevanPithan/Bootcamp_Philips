const lista = document.querySelector('.lista')
const check = document.querySelector('#check')
let numItem = 0

function adicionar() {
  numItem++
  console.log('Entrou no adicionar')

  const entrada = document.querySelector('#entrada')
  const div = document.createElement('div')
  const item = document.createElement('input')
  const itemLabel = document.createElement('label')
  item.type = 'checkbox'
  item.name = numItem
  item.id = 'check'
  itemLabel.id = numItem
  itemLabel.append(entrada.value)

  lista.appendChild(div)
  div.appendChild(item)
  div.appendChild(itemLabel)
  itemLabel.classList.add('itens')
}
