public class Displaygen {

	public static final String COHORT_CODE="CHNAJ19004";
	private String name;
	private int empId;
	
	public Displaygen(int empId,String name) {
		this.name=name;
		this.empId=empId;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void display() {
		System.out.println(+getEmpId() +getName() +COHORT_CODE+"\n");
	}
}
