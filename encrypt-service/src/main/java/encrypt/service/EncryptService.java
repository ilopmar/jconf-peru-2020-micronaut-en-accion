package encrypt.service;

import io.micronaut.runtime.server.EmbeddedServer;
import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class EncryptService {

    private final EmbeddedServer embeddedServer;

    public EncryptService(EmbeddedServer embeddedServer) {
        this.embeddedServer = embeddedServer;
    }

    public Single<MyMessage> encrypt(String text) {
        var encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted + " --> port: " + embeddedServer.getPort()));
    }
}
