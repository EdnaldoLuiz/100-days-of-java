package challenges.day_075;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day075 {
    public static void main(String[] args) {
        List<Integer> listaComDuplicatas = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6);

        List<Integer> listaSemDuplicatas = listaComDuplicatas.stream()
                                                             .distinct()
                                                             .collect(Collectors.toList());

        System.out.println(listaSemDuplicatas);
    }
}