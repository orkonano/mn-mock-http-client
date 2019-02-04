package mn104;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Singleton
@Primary
public class MockFooClient implements FooClient {
    @Override
    public String hello() {
        return "hello";
    }
}
