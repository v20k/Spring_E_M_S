package spring_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int E_Id;
	private String E_Name;
	private long E_PhNo;
	
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int E_Id) {
		this.E_Id = E_Id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String Name) {
		this.E_Name = Name;
	}
	public long getE_PhNo() {
		return E_PhNo;
	}
	public void setE_PhNo(long E_PhNo) {
		this.E_PhNo = E_PhNo;
	}
	
	
}
