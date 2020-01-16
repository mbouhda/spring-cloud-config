package com.mbouhda.cloud.config.client1.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@RefreshScope
public class RepoProperties {

    @Value("${property.from.repo}")
    private String propertyValue;

}
