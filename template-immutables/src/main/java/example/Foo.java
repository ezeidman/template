package example;

class Foo {

    public static void main(String[] args) {
        Bar bar = ImmutableBar.builder()
                .bar("BAR")
                .build();
        System.out.println(bar);
    }

}
