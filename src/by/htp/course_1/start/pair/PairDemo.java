package by.htp.course_1.start.pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("test", 5);
        System.out.println(pair);
        Pair<Integer, String> newPair = swap(pair);
        System.out.println(newPair);
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }
}
