package spring_mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import spring_mvc.dto.Employee;

@Component
public class EmpDAO {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gamma");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveEmployee(Employee e) {
		transaction.begin();
		manager.persist(e);
		transaction.commit();
	}

	public List<Employee> getAllEmployee() {
		
		 Query query = manager.createQuery("select s from Employee s");
		 return query.getResultList();
	}
	
	public Employee findEmp(int id) {
		return manager.find(Employee.class, id);
	}

	public void updateEmployee(Employee emp) {
		transaction.begin();
		manager.merge(emp);
		transaction.commit();
	}

	public void deleteEmployee(Employee empl) {
	  transaction.begin();
	  manager.remove(empl);
	  transaction.commit();
		
	}
	
	
}
