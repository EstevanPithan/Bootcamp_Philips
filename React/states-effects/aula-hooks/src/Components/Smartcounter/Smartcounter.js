import { useState } from 'react'

function SmartCounter() {
  // retorna um vetor
  // 1. variavel stateful
  // 2. Função amarrada a essa variavel que atualiza esse valor

  const [quantity, upQuantity] = useState(1)

  return (
    <>
      <h2>Contador com hooks</h2>
      <h3 id="counter-box"> {quantity} </h3>
      <button onClick={() => upQuantity(quantity + 1)}>Aumentar</button>
    </>
  )
}

export default SmartCounter
