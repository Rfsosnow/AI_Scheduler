package artificial.intelligence.cpsc;

import java.util.ArrayList;
import java.util.List;

public class Course extends Classes {
	private ArrayList<Lab> labs;
	public Course(String department_, String classNumber_, String section_) {
		labs = new ArrayList<Lab>();
		
		this.department = department_;
		this.classNumber = classNumber_;
		this.section = section_;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getSection() {
		return this.section;
	}
	
	public String getClassNumber() {
		return this.classNumber;
	}
	
	public String toString() {
		return ("Department: " + department + "\t\tClass Number: " + this.classNumber + "\t\tSection: " + this.section);
	}
	
	public void addLab(Lab lab_) {
		this.labs.add(lab_);
	}

	public List<Lab> getLabs() {
		// TODO Auto-generated method stub
		return labs;
	}
}
