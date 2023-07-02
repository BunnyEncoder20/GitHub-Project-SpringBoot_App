package in.BunnyEncoder.PET.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.BunnyEncoder.PET.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
}
