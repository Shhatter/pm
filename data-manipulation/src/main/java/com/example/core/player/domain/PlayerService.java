package com.example.core.player.domain;

import com.example.core.player.api.dto.PlayerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PlayerService {

    @Transactional
    public void addNewPlayer(PlayerDto accountDto) {
        // TODO document why this method is empty
    }

    @Transactional
    public void updatePlayer(PlayerDto playerDto) {
    }

    @Transactional
    public void deletePlayer(Long playerId) {
    }
}
