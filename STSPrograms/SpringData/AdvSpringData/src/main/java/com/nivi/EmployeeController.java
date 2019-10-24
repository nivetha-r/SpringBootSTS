package com.nivi;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository dao;
	
	@RequestMapping("/")
		public ModelAndView getEmployees(ModelAndView model)throws IOException{
			
			ModelAndView mv=new ModelAndView();
			mv.addObject("employeeList",dao.findAll());
			mv.setViewName("home");
			return mv;
		}
	
	@RequestMapping("/displayjavacontractors")
	public ModelAndView getjavacont(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("Java", "developer"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayjavaemployees")
	public ModelAndView getjavaemp(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("sql", "developer"));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayAllSortByDesigAscen")
	public ModelAndView displayAllSortByDesigAscen(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		//mv.addObject("employeeList",dao.findAll(Sort.by("desig")));
		mv.addObject("employeeList",dao.findAll(Sort.by("desig").ascending()));//sorting in ascending order...can use .ascending here like descending done below bt op nt came i checked?
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayAllSortByDesigDesc")
	public ModelAndView displayAllSortByDesigDesc(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayAllSortByBasicDesc")
	public ModelAndView displayAllSortByBasicDesc(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findAll(Sort.by("basic").descending()));
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/displayAllSortByBasicAndDeptDesc")
	public ModelAndView displayAllSortByBasicAndDeptDesc(ModelAndView model)throws IOException{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findAll(Sort.by("basic","dept").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	
	@RequestMapping("/displayAll/Page/{pageno}")
	public ModelAndView displayAllSortByDesig(@PathVariable("pageno")int pageno)
	{
	
		ModelAndView mv=new ModelAndView();
		mv.addObject("pagesize",5);
		List<Employee> employeeList = null;
		mv.addObject("totalrecords",employeeList.size());
		mv.addObject("employeeList",dao.findAll(PageRequest.of(pageno, 5)).getContent());
		mv.setViewName("home");
		return mv;
	}
	
    }




