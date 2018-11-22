package LearningLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static LearningLambda.LambdasMain.getStreamOfElements;

public class LambdaOperations {

    protected void intermediateOperations() {

        Stream<String> stream = getStreamOfElements();
        //can use the same stream variable for assigning the intermediate result
        stream = stream.filter(s -> s.startsWith("T"));
        stream.forEach(s -> System.out.println("Filter: Starts with T: " + s));

        IntStream intStream = IntStream.iterate(1, n -> n + 1);
        intStream.skip(2).limit(4).forEach(i -> System.out.println("Skip 2 elements and limit output to 4 after skipping " + i));

        System.out.println();
        stream = getStreamOfElements();
        stream.map(s -> s.length()).forEach(i -> System.out.println("Map to length of String " + i));

        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("Tiger");
        List<String> l3 = Arrays.asList("Lion", "Zebra");

        System.out.println("\nFlatMap:");
        Stream<List<String>> listStream = Stream.of(l1, l2, l2, l3, l3);
        Set<String> set = listStream.flatMap(l -> l.stream()).collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("\nFlatMap Distinct and Sorted:");

        listStream = Stream.of(l1, l2, l2, l3, l3);
        listStream.flatMap(u -> u.stream()).
                distinct().
                sorted(Comparator.comparing(y -> y.length())).
                forEach(System.out::println);
    }

    protected void terminalOperations() {

        Stream<String> stream = getStreamOfElements();
        System.out.println("Count: " + stream.count());

        stream = getStreamOfElements();
        System.out.println("\nMin: " + stream.min(Comparator.naturalOrder()).get());

        stream = getStreamOfElements();
        //findFirst, findAny
        System.out.println("\nFind First: " + stream.findFirst().orElse("No Animal"));

        stream = getStreamOfElements();
        //anyMatch, allMatch, noneMatch
        System.out.println("\nAny Match True: " + stream.anyMatch(s -> s.startsWith("L")));

        stream = getStreamOfElements();
        System.out.println("\nAny Match False: " + stream.anyMatch(s-> s.contains("Tej")));

        stream = getStreamOfElements();
        String result = stream.reduce("", String::concat);
        System.out.println("\nReduce: " + result);

        stream = Stream.of("w", "o", "l", "f");
        System.out.println("\nCollect: ");

        System.out.println(stream.collect(Collectors.joining(":")));
    }

    protected void collectors() {

        Stream<String> stream = getStreamOfElements();
        System.out.println("Average length of strings" + stream.collect(Collectors.averagingInt(String::length)));

        System.out.println("Collect into a map");
        stream = getStreamOfElements();
        Map<String, Integer> map = stream.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        System.out.println("Collect into a map for length and string");
        stream = getStreamOfElements();
        Map<Integer, String> iMap = stream.collect(Collectors.
                toMap(String::length, k1 -> k1, (s1, s2) -> s1 + ", " + s2));
        System.out.println(iMap);

        System.out.println("Grouping and Mapping");
        stream = getStreamOfElements();
        TreeMap<Integer, List<String>> gMap = stream.collect(Collectors.
                groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(gMap);

        System.out.println("Grouping and Getting a Count");
        stream = getStreamOfElements();
        Map<Integer, Long> cMap = stream.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(cMap);
    }
}
