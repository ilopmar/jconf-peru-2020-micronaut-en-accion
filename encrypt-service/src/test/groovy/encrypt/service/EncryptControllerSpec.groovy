package encrypt.service

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class EncryptControllerSpec extends Specification {

    @Shared
    @AutoCleanup
    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    @Shared
    EncryptClient encryptClient = embeddedServer.applicationContext.getBean(EncryptClient)

    void 'test encrypt client'() {
        expect:
        encryptClient.encrypt('Hola JConf Peru').text == 'ureP fnoCJ aloH'
    }

    void 'test encrypt client 2'() {
        expect:
        encryptClient.encrypt('Hola JConf Peru').text == 'ureP fnoCJ aloH'
    }
}
