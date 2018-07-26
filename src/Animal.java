public class Animal {

    private String mSex;
    private int mAge;
    private String mName;

    public Animal() {
    }

    private Animal(String sex) {
        mSex = sex;
    }

    protected Animal(String name, int age) {
        mAge = age;
        mName = name;
    }

    public Animal(String sex, int age, String name) {
        mSex = sex;
        mAge = age;
        mName = name;
    }

    public String getSex() {
        return mSex;
    }

    public void setSex(String sex) {
        mSex = sex;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
