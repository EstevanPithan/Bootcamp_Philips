function Counter() {
  let quantity = 10

  function upQuantity() {
    quantity = quantity + 1
    document.getElementById('counter-box').innerHTML = quantity
    console.log(quantity)
  }
  return (
    <>
      <h2>Contador sem hooks</h2>
      <h3 id="counter-box"> {quantity} </h3>
      <button onClick={upQuantity}>Aumentar</button>
    </>
  )
}

export default Counter
