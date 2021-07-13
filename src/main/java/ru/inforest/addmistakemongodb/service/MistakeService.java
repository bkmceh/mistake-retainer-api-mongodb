package ru.inforest.addmistakemongodb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.inforest.addmistakemongodb.model.Mistake;
import ru.inforest.addmistakemongodb.model.request.MistakeRequest;
import ru.inforest.addmistakemongodb.repository.MistakeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MistakeService {

    @Autowired
    private MistakeRepository mistakeRepository;

    public List<Mistake> readAllMistakes() {
        return mistakeRepository.findAll();
    }

    public Mistake addMistake(final MistakeRequest request) {
        Mistake createdMistake = new Mistake();
        BeanUtils.copyProperties(request, createdMistake);
        return mistakeRepository.save(createdMistake);
    }

    public void deleteMistake(final String id) {
        mistakeRepository.deleteById(id);
    }

}
