public class Student
{
	private String name;
	private double average;
	
	public Student(String name, double average) {
		this.setName(name);
		if (average > 0.0) {
			if (average <= 100.0) {
				this.setAverage(average);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		if (average > 0.0 && average <= 100.0) {
			this.average = average;
		}
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80)
			letterGrade = "B";
		else if (average >= 70)
			letterGrade = "C";
		else if (average >= 60) 
			letterGrade = "D";
		else 
			letterGrade = "F";
		return letterGrade;
	}
}