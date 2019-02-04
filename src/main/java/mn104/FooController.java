package mn104;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/")
public class FooController {

    @Inject
    private FooClient fooClient;

    @Get
    public String hello(){
        return fooClient.hello();
    }
}
