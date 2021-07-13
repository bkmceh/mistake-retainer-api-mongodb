package ru.inforest.addmistakemongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.inforest.addmistakemongodb.model.Mistake;
import ru.inforest.addmistakemongodb.model.request.MistakeRequest;
import ru.inforest.addmistakemongodb.service.MistakeService;

import java.util.List;

@RestController
@RequestMapping("/api/mistake-memory")
public class MistakeController {

    @Autowired
    private MistakeService mistakeService;

    @PostMapping("/new")
    public ResponseEntity<Mistake> addMistake(MistakeRequest request) {
        return ResponseEntity.ok(mistakeService.addMistake(request));
    }

    @GetMapping("/mistakes")
    public ResponseEntity<List<Mistake>> showMistakes() {
        return ResponseEntity.ok(mistakeService.readAllMistakes());
    }

    @DeleteMapping("/mistake/{id}")
    public ResponseEntity<Void> deleteMistake(@PathVariable String id) {
        mistakeService.deleteMistake(id);
        return ResponseEntity.ok().build();
    }
}
