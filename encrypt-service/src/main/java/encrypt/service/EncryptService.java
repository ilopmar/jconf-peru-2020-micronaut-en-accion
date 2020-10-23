package encrypt.service;

import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class EncryptService {

    public Single<MyMessage> encrypt(String text) {
        var encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted));
    }
}
