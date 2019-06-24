package java8_examples;




@FunctionalInterface
public interface Looper<T> {
    void myApplier(T t);
}
