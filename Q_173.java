package OCA_11;

public class Q_173 {

    /*

    Given:
    List<String> longlist = List.of(“Hello”,”World”,”Beat”);
    List<String> shortlist = new ArrayList<>();
    Which code fragment correctly forms a short list of words containing the letter “e”?

    A. longList.stream()
            .filter (w -> w.indexOf('e') != -1)
            .parallel()
            .forEach (w -> shortList.add(w));

    B. longList.parallelStream()
            .filter (w -> w.indexOf('e') != -1)
            .forEach (w -> shortList.add(w));

    C. shortList = longList.stream()
            .filter (w -> w.indexOf('e') != -1)
            .parallel()
            .collect(Collectors.toList());

     D. longList.stream()
            .filter (w -> w.indexOf('e') != -1)
            .parallel()
            .collect(shortlist);

    A. Option A
    B. Option B
    C. Option C
    D. Option D

    Answer : C

     */
}
