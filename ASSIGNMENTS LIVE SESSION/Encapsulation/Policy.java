package Encapsulation;

public class Policy {
	
	private int policyid;
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public float getPremium() {
		return premium;
	}
	public void calculatePremium(int age) {
		if(age<=30)
		{
		this.premium = 1000;
		}
		else if(age<=45)
		{
			this.premium=2000;
			
		}
		else if(age<=60)
		{
			this.premium=5000;
		}
		}
	private float premium;
	
	

}
