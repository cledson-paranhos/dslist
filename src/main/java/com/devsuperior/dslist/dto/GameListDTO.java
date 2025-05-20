package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private Long Id;
    private String name;

    public GameListDTO() {

    }

    public GameListDTO(GameList gameList) {
        BeanUtils.copyProperties(gameList, this);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
