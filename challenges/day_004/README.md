# Desafio 4

Agendando uma tarefa para ser executada a cada 2 segundos

## Resultado

```java
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Day004 {

    private static final String TIME_PATTERN = "HH:mm:ss";
    private static final ScheduledExecutorService AGENDADOR = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {

        Runnable task = () -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_PATTERN);
            String formattedDate = dateFormat.format(new Date());
            System.out.println("Hora atual: " + formattedDate);
        };
        AGENDADOR.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}
```