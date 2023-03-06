package ru.skillfactorydemo.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactorydemo.tgbot.entity.Spend;

public interface SpendRepository extends JpaRepository<Spend, Long> {
}
