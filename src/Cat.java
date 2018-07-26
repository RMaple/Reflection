public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        System.out.println("我是一只叫做" + name + "的猫");
    }

    private Cat(String name, String sex) {
        System.out.println("我是一只叫做" + name + "的" + sex + "猫");
    }


    public Cat(String sex, int age, String name) {
        super(sex, age, name);
    }

}
