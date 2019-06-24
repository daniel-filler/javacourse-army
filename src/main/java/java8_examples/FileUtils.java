package java8_examples;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileUtils {
    @SneakyThrows
    public static int wordcCount(String fileName){
        Stream<String> stream = Files.lines(Paths.get(fileName));
        return stream.flatMap(line -> Arrays.stream(line.split(" "))).mapToInt(word -> 1).sum();
    }
}
