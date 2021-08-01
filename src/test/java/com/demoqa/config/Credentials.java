package com.demoqa.config;

import org.aeonbits.owner.ConfigFactory;

/**
 * Created by Konstantin Fedorov on 01.08.2021.
 */
public class Credentials {
    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
}
