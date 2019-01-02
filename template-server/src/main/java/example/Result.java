package example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@JsonSerialize(as=ImmutableResult.class)
@JsonDeserialize(as=ImmutableResult.class)
@Value.Immutable
public abstract class Result {

    public abstract String foo();

    public abstract String bar();

}
