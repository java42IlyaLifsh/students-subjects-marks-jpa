package telran.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.college.entities.MarkEntity;

public interface MarkRepository extends JpaRepository<MarkEntity, Long> {

}
