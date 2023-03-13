package ru.skillfactorydemo.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactorydemo.tgbot.entity.Incomes;

public interface IncomeRepository  extends JpaRepository<Incomes, Long> {
}
