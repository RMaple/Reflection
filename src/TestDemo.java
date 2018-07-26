import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestDemo {
    public static void main(String[] args) {
        //获取Class对象的四种方法
        //1
        Class<Cat> catClass = Cat.class;
        //2
        Class dogClass = null;
        try {
            dogClass = Class.forName("Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //3
        Bird bird = new Bird();
        Class birdClass = bird.getClass();
        //4 只对Java中的“类型”有效
        Class floatClass = Float.TYPE;
        //
        System.out.println("获取Class对象的四种方法测试");
        System.out.println("1: " + catClass);
        System.out.println("2: " + dogClass);
        System.out.println("3: " + birdClass);
        System.out.println("4: " + floatClass);
        System.out.println("==========================");

        /**
         *获取Class对象的构造函数
         */
        //获取public 以及 继承的构造方法（单个）
        System.out.println("获取Class对象的构造函数");
        System.out.println("1、获取public 以及 继承的构造方法（单个和所有）：");
        try {
            Constructor c1 = catClass.getConstructor(String.class);//单个
            Constructor[] c1s = catClass.getConstructors();//所有
            Cat cat = (Cat) c1.newInstance("小白");
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //获取继承以外的构造方法，可获取private修饰的（也可获取所有）
        try {
            Constructor c2 = catClass.getDeclaredConstructor(String.class, String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        /**
         * 获取属性
         */
        //获取public 和 继承的属性
        System.out.println("==========================");
        System.out.println("获取public 和 继承的属性");
        System.out.println();
        Dog dog = new Dog();
        try {
            Field dogSize = dogClass.getField("mSize");
            System.out.println("Dog的mSize属性值为：" + dogSize.get(dog));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //设置私有的属性
        System.out.println("获取 继承以外的属性");
        try {
            Field dogID = dogClass.getDeclaredField("mID");
            dogID.setAccessible(true);//设置访问私有的权限
            dogID.set(dog,111);
            System.out.println("Dog的私有属性mID的值为："+dog.getID());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
