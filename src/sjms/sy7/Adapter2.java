package sjms.sy7;

/**
 * @author sunday
 * @create 2023 --- 04 --- 10 --- 11:41
 */
public class Adapter2 implements Robot{
    Dog dog = new Dog();
    Bird bird = new Bird();
    @Override
    public void run() {
        dog.dogRun();
    }

    @Override
    public void say() {
        bird.birdSay();
    }
}
