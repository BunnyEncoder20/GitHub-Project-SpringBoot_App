package in.BunnyEncoder.PET.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.BunnyEncoder.PET.model.Expense;
import in.BunnyEncoder.PET.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);

	}

	@Override
	public Expense findById(Long id) {
		if (expenseRepository.findById(id).isPresent()) {
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		expenseRepository.deleteById(id);
	}

	@Override
	public void update(Expense expense) {
		// Retrieve the existing expense record from the database
		Expense existingExpense = expenseRepository.findById(expense.getId()).orElse(null);

		if (existingExpense != null) {
			// Update the fields of the existing expense record with the modified values
			existingExpense.setExpensename(expense.getExpensename());
			existingExpense.setAmount(expense.getAmount());
			existingExpense.setNote(expense.getNote());

			// Save the updated expense record
			expenseRepository.save(existingExpense);
		}
	}

}