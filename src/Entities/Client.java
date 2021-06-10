package Entities;

public class Client {
	
	
	private String fullName;
	private String CPF;
	private String RG;
	private String birthDate;
	private double salary1;
	private double salary2;
	private double salary3;    
	private double averageWage;
	private String financialHealth;
	
	

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
		double average= this.averageWage;
		average = (salary1 + salary2 +salary3)/3;
		return average;
	}

	public void setAverageWage(double averageWage) {
		
		this.averageWage = averageWage;
	}

	

	

	@Override
	public String toString() {
		return "Nome Completo :" + fullName +"\n"
				+"CPF :" + CPF + "\n"
				+"RG :" + RG + "\n" 
				+"Data de Aniversario :" + birthDate +"\n" 
				+"Media dos 3 ultimos salarios : R$ " + String.format("%.2f",getAverageWage()) + "\n" 
				+"Classificação do cliente :" +  getFinancialHealth();
	}

	public String getFinancialHealth() {
		
			double health = this.getAverageWage(); 
			String FinancialHealth =this.financialHealth;
			
			if (health <= 500) {
				
				FinancialHealth= "Client Class F";
				
			}else if (health <= 2000) {
				
				FinancialHealth="Client Class E";
				
			}else if (health <= 6000) {
				
				FinancialHealth="Client Class D";
				
			}else if (health <= 10000) {
				
				FinancialHealth= "Client Class C";
			}else if (health <= 18000) {
				
				FinancialHealth="Client Class B";
			}else{
				
				FinancialHealth= "Client Class A";
			}
			
			return FinancialHealth;
	}

	public void setFinancialHealth(String Health) {
		this.financialHealth = Health;
	}

	
	

	

	
	
	
	
	

}
