package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.Spend;

import java.math.BigDecimal;
import java.util.Optional;


@DataJpaTest
class SpendRepositoryTest {
    @Autowired
    private SpendRepository spendRepository;

    @Test
    public void addFinanceOperationAddSpendTest() {
        Optional<Spend> spend = spendRepository.findById(12345L);
        Assertions.assertTrue(spend.isPresent());
        Assertions.assertEquals(new BigDecimal("112233.00"), spend.get().getSpend());
    }
}