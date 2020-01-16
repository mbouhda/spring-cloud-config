package com.mbouhda.cloud.config.client1.controllers;

import com.mbouhda.cloud.config.client1.tools.RepoProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("/api")
public class ParametersController {

    private RepoProperties repoProperties;

    public ParametersController(final RepoProperties repoProperties) {
        this.repoProperties = repoProperties;
    }

    @GetMapping
    public String getParameter() {
        return repoProperties.getPropertyValue();
    }
}
