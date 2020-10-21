package com;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU(2200, "因特尔", 64);
		
		HardDisk disk = new HardDisk(599, "爱国者", 1024);
		
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	

}
