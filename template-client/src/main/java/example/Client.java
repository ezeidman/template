package example;

import feign.Feign;
import feign.RequestLine;
import feign.gson.GsonDecoder;

// https://github.com/OpenFeign/feign
public class Client {

    public static void main(String[] args) {
        Service service = Feign.builder()
                .decoder(new GsonDecoder())
                .target(Service.class, "http://localhost:8080/api");

        System.out.println(service.baz());
    }

    public static class Item {
        String foo;
        String bar;

        @Override
        public String toString() {
            return "Item{" +
                    "foo='" + foo + '\'' +
                    ", bar='" + bar + '\'' +
                    '}';
        }
    }

    public interface Service {

        @RequestLine("GET /baz")
        Item baz();
    }

}
