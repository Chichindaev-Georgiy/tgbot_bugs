package ru.skillfactorydemo.tgbot.service;


import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillfactorydemo.tgbot.entity.Incomes;
import ru.skillfactorydemo.tgbot.repository.IncomeRepository;
import ru.skillfactorydemo.tgbot.repository.SpendRepository;
import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FinanceServiceTest {
    @InjectMocks
    private FinanceService financeService;
    @Mock
    private SpendRepository spendRepository;
    @Mock
    private IncomeRepository incomeRepository;

    @BeforeEach
    public void beforeAll() {
        System.out.println(System.currentTimeMillis());
    }

    @AfterEach
    public void afterEach() {
        System.out.println(System.currentTimeMillis());
    }


    @DisplayName("ADD_INCOME_test")
    @Test
    public void addFinanceOperationAddIncomeTest() {
        Optional<Incomes> incomes = incomeRepository.findById(12345L);
        Assertions.assertTrue(incomes.isPresent());
        Assertions.assertEquals(new BigDecimal("3000.00"),incomes.get().getIncome());
    }

}
