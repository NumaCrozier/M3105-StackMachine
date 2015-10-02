package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	private Instruction[] instructions;
	
	public Program(Instruction[] instructions_p){
		this.instructions = instructions_p;
	}

	public int getInstructionCount() {
		// TODO Auto-generated method stub
		return this.instructions.length;
	}

	public Instruction getInstructionAt(int instructionNumber) {
		// TODO Auto-generated method stub
		return this.instructions[instructionNumber];
	}
}
