package com.demoqa.tests.registration;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.demoqa.config.Credentials.credentials;
import static java.lang.String.*;

/**
 * Created by Konstantin Fedorov on 01.08.2021.
 */
public class RegistrationWithOwnerTest extends TestBase {

    @Test
    void registrationWithOwnerTest() {
        String login = credentials.login();
        String password = credentials.password();
        String remoteHost = System.getProperty("remoteHost", "selenoid.autotests.cloud");
        Configuration.remote = format("https://%s:%s@%s/wd/hub/", login, password, remoteHost);
        new RegistrationTest().positiveFillTest();
    }
}
