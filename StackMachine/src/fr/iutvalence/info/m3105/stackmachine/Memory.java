package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private int startAddress, endAddress;
	private Object[] opCodes;
	

	public Memory(int i, int j) {
		this.startAddress = i;
		this.endAddress = j;
		
	}

	public int getStartAddress() {
		return this.startAddress;
	}

	public void write(int currentAddress, Object opCode) {
		this.opCodes[currentAddress] = opCode;
	}

}
