import io.reactivex.Observable;

/**
 * Created by KAKAO on 2017. 10. 24..
 */
public class FirstExample {

    public void emit() {
        Observable.just("Hello", "RxJava 2!!").subscribe(System.out::println);
    }

    public static void main(String argp[]) {

        FirstExample firstExample = new FirstExample();
        firstExample.emit();

    }

}
