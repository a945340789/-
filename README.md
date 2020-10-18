# 计201 2020322073 宋子寒
# Java1
课本编程题1

## 实验目的
1．了解 Java 的数据类型；
2．熟悉各种约束关键词的作用；
3．了解构造方法和属性的应用。
## 实验内容
1. CPU 类要求getSpeed（）返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给 speed；
2. HardDisk 类要求getAmount（）返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount；
3. PC类要求setCPU(CPU c)将参数c的值赋值给cpu,要求setHardDisk (HardDisk h)方法将参数h的值赋值给HD,要求show（）方法能显示cpu的速度和硬盘的容量;
4. 每个类定义不少于两个属性，且属性的类型应该多样化;
5. 根据课堂中关于访问权限的内容，尝试定义属性的修饰多样化，类中定义方法操作属性，避免直接通过“类对象属性的形式访问属性值;且定义的方法内应该又符合常理的逻辑判断；
6. 尝试把本次实验的多个类放置在不同的包中。
## 核心方法
private约束关键词
```
	private int speed;		
	private String type;	
	private int ram;
```
构造方法
```
	HardDisk(int amount,String brank,int rom){
		this.amount=amount;
		this.brank=brank;
		this.rom=rom;
		
	}
```
实例化对象
```
	PC pc = new PC();
	pc.setCpu(cpu);
	pc.setDisk(disk);
	pc.show();
```
## 实验结果
```
	CPU:2200
	硬盘容量:200GB
	硬盘价格:100
	CPU名称:鸿蒙
```
## 实验感想
1. 了解了构造方法的调用；
2. 熟悉了约束关键词的作用和调用的范围；
