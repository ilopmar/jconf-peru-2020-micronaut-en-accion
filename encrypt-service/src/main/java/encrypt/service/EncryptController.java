package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.reactivex.Single;

@Controller
@ExecuteOn(TaskExecutors.IO)
public class EncryptController {

    private final EncryptService encryptService;

    public EncryptController(EncryptService encryptService) {
        this.encryptService = encryptService;
    }

    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(String text) {
        return encryptService.encrypt(text);
    }
}
