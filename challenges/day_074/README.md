# Desafio 74

Utilizando Reactive Streams a partir do Java 9

## Resultado

```java
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Day074 {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<Integer> subscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("Item recebido: " + item);
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Finalizado");
            }
        };
        publisher.subscribe(subscriber);

        System.out.println("Publicando items...");
        for (int i = 0; i < 10; i++) {
            publisher.submit(i);
        }

        TimeUnit.SECONDS.sleep(2);

        publisher.close();
    }
}
```