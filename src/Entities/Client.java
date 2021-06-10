package Entities;

public class Client {
	
	
	String fullName;
	String CPF;
	String RG;
	String birthDate;
	double salary1;
	double salary2;
	double salary3;
	double averageWage;
	
	
	String financialHealth;
	
	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary1() {
		return salary1;
	}

	public void setSalary1(double salary1) {
		this.salary1 = salary1;
	}

	public double getSalary2() {
		return salary2;
	}

	public void setSalary2(double salary2) {
		this.salary2 = salary2;
	}

	public double getSalary3() {
		return salary3;
	}

	public void setSalary3(double salary3) {
		this.salary3 = salary3;
	}

	public double getAverageWage() {
		
		return (salary1 + salary2 + salary3)/3;
	}

	

	public String getFinancialHealth() {

		double health = this.getAverageWage(); 
		
		if (health <= 500) {
			
			return "Client Class F";
			
		}else if (health <= 2000) {
			
			return "Client Class E";
			
		}else if (health <= 6000) {
			
			return "Client Class D";
			
		}else if (health <= 10000) {
			
			return "Client Class C";
		}else if (health <= 18000) {
			
			return "Client Class B";
		}else if (health >= 25000) {
			
			return "Client Class A";
		}else {
			return "empty";
		}
		
	
	}

	
	
	
	

}
