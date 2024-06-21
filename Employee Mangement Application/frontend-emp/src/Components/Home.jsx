import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css'


const Home = () => {
  return (
    <div className='home-container'>
     
      <h1 className='home-title'>Welcome to the Employee Management System</h1>
      <img src="https://i0.wp.com/juntrax.com/blog/wp-content/uploads/2021/01/Employee-Management-System.jpg?resize=840%2C480&ssl=1" alt="Employee Management System"/>
      {/* <div className='link-container'>
      <Link to="/" className='home-link'>Home</Link>
      <Link to="/add-employee" className='home-link'>Add Employee</Link>
      <Link to="/employees" className='home-link'>View All Employee</Link>
      <Link to="/" className='home-link'>About</Link>
      <Link to="/" className='home-link'>Contact</Link>
          
          </div> */}
    </div>
  );
}

export default Home;
