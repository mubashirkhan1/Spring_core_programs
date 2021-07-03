package Spring__programs.Spring1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String add;
	private  List company;
	private Set name1;
	private Map name3;
	private Certi cer;
	public Certi getCer() {
		return cer;
	}
	public void setCer(Certi cer) {
		this.cer = cer;
	}
	public int getId() {
		return id;
	}
	public List getCompany() {
		return company;
	}
	public void setCompany(List company) {
		this.company = company;
	}
	public Set getName1() {
		return name1;
	}
	public void setName1(Set name1) {
		this.name1 = name1;
	}
	public Map getName3() {
		return name3;
	}
	public void setName3(Map name3) {
		this.name3 = name3;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", company=" + company + ", name1=" + name1
				+ ", name3=" + name3 + ", cer=" + cer + "]";
	}

	
	public Student(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void init() {
		System.out.println("hii iam init maethod ");
	}
	
	public void destroy() {
		System.out.println("hii iam destroy maethod ");
	}
}
