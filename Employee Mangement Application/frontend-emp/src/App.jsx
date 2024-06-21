
import './App.css'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import ListAllEmployee from './Components/ListAllEmployee'
import UpdateEmployee from './Components/UpdateEmployee'
import AddEmployee from './Components/AddEmployee'
import Home from './Components/Home'
import Navbar from './Components/Navbar'
import About from './Components/About'
import Contact from './Components/Contact'

function App() {
  return (
    <>
      <Router>
        <Navbar/>
        <div>
          <Routes>
            <Route path="/" Component={Home } />
            <Route path="/employees" Component={ListAllEmployee} />
            <Route path="/add-employee" Component={AddEmployee }/>
            <Route path="/edit-employee/:id" Component={UpdateEmployee } />
            <Route path="/about" Component={About}/>
            <Route path="/contact" Component={Contact}/>
          </Routes>
        </div>
      </Router>
    </>
  )
}

export default App
