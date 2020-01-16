package com.mbouhda.cloud.config.client1.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class RepoProperties {

    @Value("${property.from.repo}")
    private String propertyValue;

}
