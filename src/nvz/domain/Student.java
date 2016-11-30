package nvz.domain;

public class Student {
	private long id;
	private Name name;
	private int age;
	
	
	public Student() {
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student[id: " + id + ", " + name + ", age: " + age + "]";
	}
	
	public boolean hasId(long id) {
		return this.id == id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
