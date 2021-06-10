package Entities;

public class Loan {
	//classe emprestimo
	double requestedValue;//valor reuisitado
	double 	fees;//juros
	double limitValue;// valor limite a este cliente
	boolean situation;// situação aprovado ou não
	int QTDinstallments;//qtd de párcelas
	
	
	
	
	public double getRequestedValue() {
		return requestedValue;
	}
	public void setRequestedValue(double requestedValue) {
		this.requestedValue = requestedValue;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getLimitValue() {
		return limitValue;
	}
	public void setLimitValue(double limitValue) {
		this.limitValue = limitValue;
	}
	public boolean isSituation() {
		return situation;
	}
	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	public int getQTDinstallments() {
		return QTDinstallments;
	}
	public void setQTDinstallments(int qTDinstallments) {
		QTDinstallments = qTDinstallments;
	}

	
	
	
}
