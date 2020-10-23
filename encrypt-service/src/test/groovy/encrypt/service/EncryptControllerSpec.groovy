package encrypt.service

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class EncryptControllerSpec extends Specification {

    @Inject
    EncryptClient encryptClient

    void 'test encrypt client'() {
        expect:
        encryptClient.encrypt('Hola JConf Peru').text == 'ureP fnoCJ aloH'
    }

}
