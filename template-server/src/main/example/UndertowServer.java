
package example;

import org.junit.Assert;
import org.junit.Test;

public class UndertowServer {
    public static void main(String[] args) {

        PathHandler path = Handlers.path();

        server = Undertow.builder()
                .addHttpListener(port, "localhost")
                .setHandler(path)
                .build();


    }
}
