package part03.dto;

public class EmpDTO {
	
	private int employees_id, department_id;
	private String first_name, job_id;
	private DeptDTO dept;
	
	public EmpDTO() {
		
	}
	
	public DeptDTO getDept() {
		return dept;
	}
	
	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	public int getEmployees_id() {
		return employees_id;
	}

	public void setEmployees_id(int employees_id) {
		this.employees_id = employees_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	
}
