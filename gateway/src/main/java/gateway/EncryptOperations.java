package gateway;

import io.reactivex.Single;

public interface EncryptOperations {

    Single<MyMessage> encrypt(String text);
}
