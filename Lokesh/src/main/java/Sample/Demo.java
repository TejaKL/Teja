package Sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
private int slno;
private String name;
private String city;
private long phone;
public int getSlno() {
	return slno;
}
public void setSlno(int slno) {
	this.slno = slno;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Demo [slno=" + slno + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
}


}
