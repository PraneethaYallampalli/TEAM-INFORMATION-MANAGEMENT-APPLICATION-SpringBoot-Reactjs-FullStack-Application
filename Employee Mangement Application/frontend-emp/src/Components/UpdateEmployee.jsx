import React,{useState, useEffect} from 'react'
import {useParams,useNavigate} from 'react-router-dom'
import EmployeeService from '../EmployeeServices/EmployeeService';
import './AddEmployee.css'

const UpdateEmployee = () => {
    const[name,setName]=useState(" ");
    const[email,setEmail]=useState(" ");
    const[gender,setGender]=useState(" ");
    const[deptno,setDeptno]=useState(" ");

    const {id} = useParams();
    const navigate = useNavigate();
    const updateEmployee = (event)=>{
        event.preventDefault();
        const employee = {name, email, gender, deptno}
        EmployeeService.updateEmp(employee,id)
        .then((response)=>{
            console.log(response.data);
            navigate('/employee')
        }).catch((error)=>{
            console.log(error);
        })
    }
  useEffect(()=>{
    EmployeeService.getOneRecord(id)
    .then((response)=>{
        setName(response.data.name);
        setEmail(response.data.email);
        setGender(response.data.gender);
        setDeptno(response.data.deptno);
    })
    .catch((error)=>{
        console.log(error);
    })
  },[id])
  return (
    <div className="employee-form-container">
      <h3 className='employee-form-title'>Update Employee</h3>
     <form>
        <table border="2" className='employee-form-table'>
            <tbody>
            <tr>
                <td>Employee Name</td>
                <td><input type="text" value={name} onChange={(event)=>setName(event.target.value)} className='employee-form-input' name="name"/></td>
            </tr>
            <tr>
                <td>Employee Email</td>
                <td><input type="text" value={email} onChange={(event)=>setEmail(event.target.value)} className='employee-form-input' name="email"/></td>
            </tr>
            <tr>
                <td>Employee Gender</td>
                <td><input type="text" value={gender} onChange={(event)=>setGender(event.target.value)} className='employee-form-input' name="gender"/></td>
            </tr>
            <tr>
                <td>Employee Deptno</td>
                <td><input type="text" value={deptno} onChange={(event)=>setDeptno(event.target.value)} className='employee-form-input' name="deptno"/></td>
            </tr>
            <tr>
                <td colSpan={2}>
                    <button onClick={(event)=> updateEmployee(event)} className='employee-form-button'>Update</button>
                    </td>
            </tr>
            </tbody>
        </table>
     </form>
    </div>
  )
}

export default UpdateEmployee
