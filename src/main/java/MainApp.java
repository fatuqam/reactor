import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.stream.Stream;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {
        Flux.just("red", "white", "blue")
                .log()
                .map(String::toUpperCase)
                .subscribeOn(Schedulers.parallel())
                .subscribe(null, 2);

        String[][] data = new String[][]{{"a","b"},{"c","d"},{"e","f"}};


        Stream<String[]> s1 = Arrays.stream(data);

    }



}







