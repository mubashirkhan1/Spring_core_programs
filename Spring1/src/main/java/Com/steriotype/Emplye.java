package Com.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Emplye {
	@Value(value = "mubashir khan zafer ahmed")
	private String name;
	@Value(value = "zamda shaahi")
	private String city;
	@Value("#{emp}")
	private List<String> add;
	public List<String> getAdd() {
		return add;
	}
	public void setAdd(List<String> add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emplye [name=" + name + ", city=" + city + ", add=" + add + "]";
	}
	

}
