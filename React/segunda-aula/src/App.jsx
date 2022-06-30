import React from 'react'
import Button from './Button.js'

const buttonA = <button>Primeiro botão</button>
const buttonB = <button>segundo botão</button>

const App = () => {
  return (
    <div>
      <p>Digital Innovation</p>
      <p>Bem vindo a aula =D</p>
      {buttonA}
      {buttonB}
    </div>
  )
}
export default App
