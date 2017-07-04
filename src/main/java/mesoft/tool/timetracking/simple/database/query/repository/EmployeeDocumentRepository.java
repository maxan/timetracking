package mesoft.tool.timetracking.simple.database.query.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import mesoft.tool.timetracking.simple.database.query.entity.EmployeeDocument;

public interface EmployeeDocumentRepository extends MongoRepository<EmployeeDocument, Integer> {
	
	List<EmployeeDocument> findByUsername(String username);

}
