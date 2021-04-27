package generic;

import java.util.ArrayList;
import java.util.List;

public class ClassDataB<ID extends Number, DATATYPE> {

	private ID id;
	private List<DATATYPE> dataList;

	public ClassDataB(ID id) {
		this.id = id;
		this.dataList = new ArrayList<>();
	}

	public void addStudentName(DATATYPE studentName) {
		dataList.add(studentName);
	}

	public void showStudents() {
		System.out.println("Class: " + id);
		System.out.println("Students: " + dataList + "\n");
	}

}
