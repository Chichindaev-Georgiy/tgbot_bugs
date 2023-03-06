package ru.skillfactorydemo.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactorydemo.tgbot.entity.Income;

public interface IncomeRepository  extends JpaRepository<Income, Long> {
}
