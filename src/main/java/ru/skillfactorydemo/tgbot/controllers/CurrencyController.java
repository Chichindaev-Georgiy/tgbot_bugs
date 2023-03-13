package ru.skillfactorydemo.tgbot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.skillfactorydemo.tgbot.dto.ValuteCursOnDate;
import ru.skillfactorydemo.tgbot.service.CentralRussianBankService;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }

//    @GetMapping("/getCurrency/{code}")
//    public ValuteCursOnDate getCourseForCurrency (@PathVariable String code) throws DatatypeConfigurationException {
//        return centralRussianBankService.getCourseForCurrency(code);
//    }
}
