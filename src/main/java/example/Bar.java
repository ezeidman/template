package example;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Bar {

    public abstract String bar();

    @Value.Default
    @Override
    public String toString() {
        return String.format("bar = %s", bar());
    }
}
