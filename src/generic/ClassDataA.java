package generic;

import java.util.ArrayList;
import java.util.List;

public class ClassDataA<ID, DATATYPE> {

	private ID id;
	private List<DATATYPE> dataList;

	public ClassDataA(ID id) {
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
