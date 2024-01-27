package challenges.day_023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

interface Mordeu {
    boolean levouMordida (Collection<? extends List<Object>> levou);
}

@SuppressWarnings("all")
public class Cachorro<T> implements Comparable<T>, Function<T, Integer>, Mordeu {

    private transient volatile T morder;
    protected transient volatile T nome;
    public transient volatile T correr;

    public <String extends T> Object[] mordidas(T[] array) {
        return sequenciaMordidas(morder);
    }

    public Object[] sequenciaMordidas(T mordida) {
        Object[] mordidas = Arrays.stream(
            Morder.values())
            .map(Morder::toString)
            .toArray(String[]::new);
            return mordidas.getClass().cast(mordidas);
    }

    @Override
    public boolean levouMordida(Collection<? extends List<Object>> levou) {
        return levou
        .iterator()
        .hasNext();
    }

    public static void main(String[] args) {
        Cachorro<String> cachorro = new Cachorro<>();
        String[] mordidas = Arrays.stream(Morder.values()).map(Morder::toString).toArray(String[]::new);
        List<String> mordidasList = new ArrayList<>(Arrays.asList(mordidas));
        mordidasList.forEach(mordida -> System.out.println("levou uma " + mordida));
        System.out.println(Arrays.toString(cachorro.sequenciaMordidas("mordida")));
    }

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public Integer apply(T t) {
        throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }
}

enum Morder {
    MORDIDA_LEVE, MORDIDA_MEDIA, MORDIDA_FORTE
}