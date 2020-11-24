import java.util.ArrayList;
import java.util.List;

public class Person {
    private class Date {
        int dd;
        int mm;
        int yy;

        public Date() {}

        public Date(int dd, int mm, int yy) {
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }

        public int getDay() {
            return dd;
        }

        public int getMonth() {
            return mm;
        }

        public int getYear() {
            return yy;
        }

        public void setDay(int dd) {
            ;this.dd = dd;
        }

        public void setMonth(int mm) {
            this.mm = mm;
        }

        public void setYear(int yy) {
            this.yy = yy;
        }

        @Override
        public String toString() {
            return "Date[day=" + dd + ", month" + mm + ", year" + yy + "]";
        }
    }

    private String name;
    private boolean male;
    private Date birthday = new Date();
    private boolean isWedding;
    private List<Person> children = new ArrayList<>();

    public Person() {}

    public Person(String name, boolean isWedding) {
        this.name = name;
        this.isWedding = isWedding;
    }

    public void setBirthday(int dd, int mm, int yy) {
        birthday.setDay(dd);
        birthday.setMonth(mm);
        birthday.setYear(yy);
    }

    public void setWedding(boolean isWedding) {
        this.isWedding = isWedding;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person person) {
        children.add(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Person[name=" + name + ", " + birthday.toString() +  ", wedding=" + isWedding
                + ", male=" + male + "]";
    }
}
