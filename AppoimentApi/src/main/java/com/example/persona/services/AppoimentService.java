package com.example.persona.services;

import com.example.persona.entities.Appoiment;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface AppoimentService extends BaseService<Appoiment, Long> {
    CompletableFuture<List<Appoiment>> pruebaGetall();
}
