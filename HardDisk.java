package com;

public class HardDisk {
	
	private int amount;		//���
	private String brank;	//Ʒ��
	private int rom;		//�ڴ�

	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBrank() {
		return brank;
	}
	public void setBrank(String brank) {
		this.brank = brank;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	
	HardDisk(int amount,String brank,int rom){
		this.amount=amount;
		this.brank=brank;
		this.rom=rom;
		
	}

}
