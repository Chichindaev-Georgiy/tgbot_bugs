package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.ActiveChat;

import java.util.Optional;


@DataJpaTest
class ActiveChatRepositoryTest {
    @Autowired
    private ActiveChatRepository activeChatRepository;

    @Test
    public void addChatIdTest() {
        Optional<ActiveChat> activeChat = activeChatRepository.findActiveChatByChatId(54321L);
        Assertions.assertTrue(activeChat.isPresent());
    }
}