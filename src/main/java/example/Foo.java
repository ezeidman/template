package example;

import org.immutables.value.Value;

class Foo {

    public static void main(String[] args) {
        Bar msg = ImmutableBar.builder()
                .bar("BAR")
                .build();
        System.out.println(msg);
    }

    @Value.Immutable
    public static abstract class Bar {

        public abstract String bar();

        @Value.Default
        @Override
        public String toString() {
            return String.format("bar = %s", bar());
        }
    }

}
