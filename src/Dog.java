public class Dog extends Animal {

    public String mSize = "big";
    private int mID = 9527;

    public Dog() {
    }

    public Dog(String sex, int age, String name) {
        super(sex, age, name);
    }

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }
}
