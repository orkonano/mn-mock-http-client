package mn104

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class FooControllerFailSpec extends Specification{

    @Inject
    @Client('/')
    RxHttpClient client

    @Inject
    FooClient fooClient

    void "test hello method"() {
        when:
        HttpResponse response = client.toBlocking().exchange("/")

        then:
        1 * fooClient.hello()
        noExceptionThrown()
        response.status == HttpStatus.OK
    }

    @MockBean(FooClient)
    FooClient fooClient(){
        Mock(FooClient)
    }

}
