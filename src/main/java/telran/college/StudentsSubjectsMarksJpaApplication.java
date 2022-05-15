package telran.college;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import telran.college.service.CollegeService;

@SpringBootApplication
public class StudentsSubjectsMarksJpaApplication {
	//TODO configuration values
	int nStudents;
	int nSubjects;
	int nMarks;
	/**********************/
	@Autowired
	CollegeService collegeService;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(StudentsSubjectsMarksJpaApplication.class, args);
		
		
	}
	@PostConstruct
	void createDb() {
		createStudents();
		createSubjects();
		createMarks();
		
	}
	private void createMarks() {
		// TODO Auto-generated method stub
		
	}
	private void createSubjects() {
		// TODO Auto-generated method stub
		
	}
	void createStudents() {
		//TODO
	}
	

}
