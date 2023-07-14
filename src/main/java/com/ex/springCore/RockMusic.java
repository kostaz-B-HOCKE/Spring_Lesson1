package com.ex.springCore;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSound() {
        return "Rammstein - Links 2 3 4";
    }
}

