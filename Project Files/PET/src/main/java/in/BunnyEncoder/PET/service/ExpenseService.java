package in.BunnyEncoder.PET.service;

import java.util.List;

import in.BunnyEncoder.PET.model.Expense;

public interface ExpenseService {
	List<Expense> findAll();
	
	void save (Expense expense); 
	
	Expense findById(Long id);

	void delete(Long id);
	
	void update(Expense expense);
}
