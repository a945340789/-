package com;

public class PC {
	
	CPU cpu;
	HardDisk disk;
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setDisk(HardDisk disk) {
		this.disk = disk;
	}
	
	void show() {
		System.out.println("CPUƷ�ƣ�"+cpu.getType());
		if(cpu.getRam()==32 || cpu.getRam()==64){
			System.out.println(cpu.getType()+"��Ʒ�Ƶ�CPUΪ��"+cpu.getRam()+"λ");
		}else{
			System.out.println(cpu.getType()+"Ʒ��CPU"+cpu.getRam()+"λ�Ĳ����ڣ�����");
		}
		System.out.println("CPU�����ٶ�:"+cpu.getSpeed()+"ת");
		
		System.out.println("-------------------------------");
		
		System.out.println("Ӳ��Ʒ��:"+disk.getBrank());
		
		System.out.println("Ӳ�̼۸�:"+disk.getAmount()+"�����");
		
		if(disk.getRom()>=120 && disk.getRom()<=2048){
			System.out.println("��Ʒ��Ӳ���ڴ��СΪ��"+disk.getRom()+"GB");
		}else{
			System.out.println("��Ʒ��Ӳ���ڴ�"+disk.getRom()+"GB��С�����ڣ�����");
		}
	}

}
