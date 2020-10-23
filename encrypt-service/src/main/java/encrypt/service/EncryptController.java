package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.reactivex.Single;

@Controller
@ExecuteOn(TaskExecutors.IO)
public class EncryptController {

    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(String text) {
        var encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted));
    }
}
