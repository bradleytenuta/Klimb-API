package com.bradleytenuta.klimb.core.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bradleytenuta.klimb.core.domain.GeneratedMap;

@RestController
@AllArgsConstructor
public class GameController {

    // TODO: Add param to match openapi spec.
    @GetMapping("/generate-map")
    GeneratedMap generateMap() {
        return new GeneratedMap();
    }
}
