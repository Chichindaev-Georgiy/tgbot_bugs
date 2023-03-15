package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.Incomes;

import java.math.BigDecimal;
import java.util.Optional;

@DataJpaTest
class IncomeRepositoryTest {
    @Autowired
    private IncomeRepository incomeRepository;

    @Test
    public void addFinanceOperationAddIncomeTest() {
        Optional<Incomes> incomes = incomeRepository.findById(12345L);
        Assertions.assertTrue(incomes.isPresent());
        Assertions.assertEquals(new BigDecimal("3000.00"), incomes.get().getIncome());
    }
}