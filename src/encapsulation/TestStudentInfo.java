package encapsulation;

public class TestStudentInfo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setStId(100);
		st.setStName("jabbar");
		
		st.setStDOB("08-12-1990");
		st.setStGrade("A-");
		
		System.out.println("ID is :" +st.getStId() + " " + "Name: " +st.getStName() +" " + "Date of Birth:" +  st.getStDOB() + " " + " Grade :"+ st.getStGrade());
		
		
		Student st2 = new Student();
		st2.setStId(200);
		st2.setStName("Taneya");
		
		st2.setStDOB("02-06-1993");
		st2.setStGrade("B-");
		
		System.out.println("ID is :" +st2.getStId() + " " + "Name: " +st2.getStName() +" " + "Date of Birth:" +  st2.getStDOB() + " " + " Grade :"+ st2.getStGrade());
		
		
	}

}
