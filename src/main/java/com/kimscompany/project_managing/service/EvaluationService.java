package com.kimscompany.project_managing.service;

import com.kimscompany.project_managing.domain.evaluation.Evaluation;
import com.kimscompany.project_managing.repository.EvaluationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public Evaluation registerEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }
}
