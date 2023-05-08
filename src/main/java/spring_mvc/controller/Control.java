package spring_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring_mvc.dao.EmpDAO;
import spring_mvc.dto.Employee;


@Controller
public class Control {
	
    @Autowired
	Employee employee;
    @Autowired
	EmpDAO dao;
	
	
	@RequestMapping(path = "/saveEmp")
	public ModelAndView sE() {
		ModelAndView mav=new ModelAndView("saveEmployee.jsp");
		mav.addObject("Emp",employee);
		return mav;
	}
	
	@RequestMapping("/savedStudent")
	public ModelAndView savedEmp(@ModelAttribute Employee emp) {
		dao.saveEmployee(emp);
		ModelAndView mav=new ModelAndView("AddEmployee.jsp");
		
		return mav;
	}
	
	@RequestMapping("/viewEmp")
	public ModelAndView vE() {
		 List<Employee> employees = dao.getAllEmployee();
		 ModelAndView mav=new ModelAndView("viewEmployee.jsp");
		 mav.addObject("emp", employees);
		 return mav;
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView uE(@RequestParam int VinothID) {
	  Employee employee=dao.findEmp(VinothID);
	  ModelAndView mav=new ModelAndView("updateEmployee.jsp");
		mav.addObject("em",employee);
		return mav;
		
	}
	
	@RequestMapping("/updatedEmployee")
	public ModelAndView udE(@ModelAttribute Employee emp) {
		dao.updateEmployee(emp);
		ModelAndView mav=new ModelAndView("viewEmployee.jsp");
		 List<Employee> employees = dao.getAllEmployee();
		 mav.addObject("emp", employees);
		return mav;
	}
	@RequestMapping("/deleteEmployee")
	public ModelAndView dE(@RequestParam int VasanthID) {
	Employee empl=dao.findEmp(VasanthID);
		dao.deleteEmployee(empl);
		ModelAndView mv=new ModelAndView("viewEmployee.jsp");
		 List<Employee> employees = dao.getAllEmployee();
		 mv.addObject("emp", employees);
		return mv;
		
	}
}
