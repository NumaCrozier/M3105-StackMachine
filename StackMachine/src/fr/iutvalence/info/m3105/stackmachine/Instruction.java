package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {

	private int opCode;
	private int[] addresses;
	
	public Instruction(int operator_p, int[] adddresses_p){
		this.opCode = operator_p;
		this.addresses = adddresses_p;
	}

	public Object getOpCode() {
		// TODO Auto-generated method stub
		return this.opCode;
	}

	public int[] getParams() {
		
		// TODO Auto-generated method stub
		return this.addresses;
	}

	
}
