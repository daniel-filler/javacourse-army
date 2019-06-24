package java8_examples;

import lombok.SneakyThrows;

import java.util.List;


public class LambdaUtils {
    @SneakyThrows
    public static  <T>  void forEachWithDelay(List<T> list, int delay, Looper<T> looper){
        for (T t : list) {
            Thread.sleep(delay);
            looper.myApplier(t);
        }
    }
}
