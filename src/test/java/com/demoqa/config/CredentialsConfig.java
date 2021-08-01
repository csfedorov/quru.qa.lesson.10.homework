package com.demoqa.config;

import org.aeonbits.owner.Config;

/**
 * Created by Konstantin Fedorov on 01.08.2021.
 */
@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
