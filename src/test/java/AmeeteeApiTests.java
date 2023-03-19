import feign.Feign;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.damir.AmeeteeAuthUser;
import org.damir.AuthService;
import org.damir.UserToken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AmeeteeApiTests {
    AmeeteeAuthUser ameeteeAuthUser = new AmeeteeAuthUser();
    AuthService authService;
    UserToken userToken;
    @BeforeEach
    public void init() {
        ameeteeAuthUser.setEmail("feizulov@technokratos.com");
        ameeteeAuthUser.setPassword("Kxzbnp52!!!");
        authService = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .decode404()
                .errorDecoder(new ErrorDecoder.Default())
                .target(AuthService.class, "https://ameetee.backend.develop.cloud.technokratos.com/api");
        userToken = authService.authAmeeteeUser(ameeteeAuthUser);
        System.out.printf(userToken.getAccess());
    }
    //TODO: Доделать тесты
    @Test
    public void sayHello() {
        System.out.printf("Hello!");
    }
}
