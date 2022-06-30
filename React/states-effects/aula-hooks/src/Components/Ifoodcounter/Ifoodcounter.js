import React, { useEffect, useState } from 'react'
import '../Ifoodcounter/Ifoodcounter.css'

export default function IfoodCounter() {
  const [value, setValue] = useState(1)
  const [buttonMinusStyle, setButtonMinusStyle] = useState(
    'counter-button-minus-active'
  )
  const [buttonPlusStyle, setButtonPlusStyle] = useState(
    'counter-button-plus-active'
  )

  let price = 2.75
  let total = price * value

  useEffect(() => {
    total = price * value
  }, [value])

  function down() {
    if (value <= 1) {
      setButtonMinusStyle('counter-button-minus-desactive')
    }

    if (value > 0) {
      setValue(value - 1)
      setButtonPlusStyle('counter-button-plus-active')
    }
  }

  function up() {
    if (value >= 9) {
      setButtonPlusStyle('counter-button-plus-desactive')
      alert('Só é possivel comprar no máximo 10 itens')
    }

    if (value < 10) {
      setValue(value + 1)
      setButtonMinusStyle('counter-button-minus-active')
    }
  }

  return (
    <>
      <div className="counter-wrapper">
        <button onClick={down} className={buttonMinusStyle}>
          -
        </button>
        <p>{value}</p>
        <button onClick={up} className={buttonPlusStyle}>
          +
        </button>
      </div>
      <span>Preço unitário: {price}</span>
      <div>
        <button>Total a pagar: {total}</button>
      </div>
    </>
  )
}
