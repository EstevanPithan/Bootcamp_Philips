import React, { Fragment } from 'react'
import ReactDOM from 'react-dom/client'
import Button from './Button.jsx'
import './index.css'

function App() {
  const soma = (a, b) => {
    alert(a + b)
  }

  return (
    <div className="App">
      Papagaio
      <Button onClick={() => soma(10, 20)} name="Estevan Pithan" />
    </div>
  )
}

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(<App />)
