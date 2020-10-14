package index;

public class Student extends People{
	public static void main(String[] args) {
//		Student[] stus=new Student[10];
//		
//		People[] peos=stus;
//		
//		peos[0]=new People("woshiceshi");
		
		
		People p1=new People();
		
		System.out.println(p1.getName());
		
		Object o=p1;
		
	}
//	public Student() {}
	private String xuehao;
	private String ceshi;
	
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String getCeshi() {
		return ceshi;
	}
	public void setCeshi(String ceshi) {
		this.ceshi = ceshi;
	}
	public Student() {
		super();
	}
	public Student(String xuehao) {
		super();
		this.xuehao = xuehao;
	}
	public Student(String xuehao, String ceshi) {
//		super();
		this(xuehao);
		this.ceshi = ceshi;
	}
	@Override
	public String toString() {
		return "Student [xuehao=" + xuehao + ", name=" +super.getName()+", ceshi=" + ceshi + "]";
	}
	
	public Student sum() {
		return null;
	}
	
}

class People{
	private String name;
	
	public People sum() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People() {
		super();
	}

	public People(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	
	
}