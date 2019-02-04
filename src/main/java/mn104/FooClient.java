package mn104;

import io.micronaut.http.client.annotation.Client;

@Client(value = "foo", path = "anyPath")
public interface FooClient {

    String hello();
}
