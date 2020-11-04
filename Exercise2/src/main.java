package src;
public class main 
{
	public static void main(String[] args) 
	{
		Biodata p = new Biodata();
		WorkSkills u = new WorkSkills();
		WorkExperience r = new WorkExperience();
		Awards t = new Awards();
		ProgrammingResult y = new ProgrammingResult();
		cgpa q = new cgpa();

		System.out.println("BIODATA");
		p.PrintName();
		p.DisplayGender();
		p.ShowAge();
		p.DisplayStatus();
		p.DisplayCitizen();
		p.DisplayAdrres();
		p.DisplayNumber();
		System.out.println();

		System.out.println("WORK SKILLS");
		u.ShowSkills();
		System.out.println();

		System.out.println("WORK EXPERIENCE");
		r.ShowExperience();
		System.out.println();

		System.out.println("AWARDS");
		t.DisplayAwards();
		System.out.println();

		System.out.println("PROGRAMMING RESULT");
		y.PrintExam();
		System.out.println();
	
		System.out.println("CGPA CALCULATION");
		q.printCGPA();
	}
}
