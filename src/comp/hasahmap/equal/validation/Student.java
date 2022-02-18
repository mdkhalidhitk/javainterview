package comp.hasahmap.equal.validation;

public class Student {

	private String regNum;

	public Student(String regNum) {
		this.regNum = regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getRegNum() {
		return regNum;
	}

	public boolean equals(Object o) {
		// System.out.println("equal");
		if (o != null && o instanceof Student) {

			String reg = ((Student) o).getRegNum();

			if (reg != null && reg.equals(this.getRegNum())) {

				return true;
			}

		}
		return false;

	}

	public int hashCode() {
		// System.out.println(" hashCode()");
		return 8;
	}

}
