package example;

import org.immutables.value.Value;

class Foo {

	public static void main(String[] args) {
		String msg = ImmutableBar.builder().build().msg();
		System.out.println(msg);
	}

	@Value.Immutable
	public interface Bar {

		@Value.Default
		default String msg() {
			return "bar";
		}

	}

}
