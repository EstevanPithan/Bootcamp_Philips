import './App.css'
import Counter from '../Counter/Counter'
import SmartCounter from '../Smartcounter/Smartcounter'
import IfoodCounter from '../Ifoodcounter/Ifoodcounter'

function App() {
  return (
    <>
      <div>
        <h1>Contadores de números utilizando sem/com hooks</h1>
        <Counter />
        <SmartCounter />
      </div>
      <div>
        <h1>Contador do Ifood</h1>
        <IfoodCounter />
      </div>
    </>
  )
}

export default App
