package com.kimscompany.project_managing.service;

import com.kimscompany.project_managing.domain.developer.DeveloperInfo;
import com.kimscompany.project_managing.domain.developer.InputDev;
import com.kimscompany.project_managing.repository.DeveloperInfoRepository;
import com.kimscompany.project_managing.repository.InputDevRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeveloperService {

    private final DeveloperInfoRepository devInfoRepository;
    private final InputDevRepository inputDevRepository;

    public InputDev registerInputDev(InputDev inputDev) {
        return inputDevRepository.save(inputDev);
    }

    public DeveloperInfo registerDevInfo(DeveloperInfo devInfo) {
        return devInfoRepository.save(devInfo);
    }
}
