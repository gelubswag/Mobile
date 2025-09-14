/* 
Как кошка с собакой
*/
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}
class Cat {
    private final String name;
    private final int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private final String name;
    private final int speed;
    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
