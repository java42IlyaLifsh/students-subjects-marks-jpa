package telran.college.repo;
//IlyaL HW-66

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.college.dto.Subject;
import telran.college.entities.StudentEntity;
import telran.college.entities.SubjectEntity;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
	
	 @Query(value = "select * from subjects s join marks m on s.id=m.subject_id "
		 		+ "group by m.id, subject_name order by avg(m.mark) "
		 		+ "desc limit 1", nativeQuery = true)
	SubjectEntity SubjectGreatestAvgMark();

	 
	 @Query("select su from SubjectEntity su where su.id in"
				+ " (select ms.id from MarkEntity m right join m.subject ms "
				+ "group by ms.id having avg(m.mark) < :avgMark) ")
 	 
	 List<SubjectEntity> getSubjectsAvgMarkLess(double avgMark);
	 
}
