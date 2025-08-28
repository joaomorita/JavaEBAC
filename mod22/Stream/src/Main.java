import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = List.of("João", "Vitor", "Morita").stream();

        Stream<String> set = Set.of("João", "Vitor", "Morita").stream();

        Map<String, String> map = Map.of("João", "Vitor");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valor = map.values().stream();
    }
}