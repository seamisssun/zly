package Day26.Cat.cat;

import Day26.Cat.cat.Cat;
import Day26.Cat.cat.Dog;
import Day26.Cat.cat.G;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        G g=new G();
        g.makeCry(cat);
        g.makeCry(dog);
    }
}
