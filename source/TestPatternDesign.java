public class TestPatternDesign {
    public static void main(String[] args) {
        Person grandfather = new Person("Huong", true);
        grandfather.setBirthday(7,11,1927);

        Person father = new Person("Hai", true);
        father.setBirthday(19, 5, 1954);

        Person son = new Person("Son", true);
        son.setBirthday(11, 12, 1980);

        Person grandsonS = new Person("Long", false);
        grandsonS.setBirthday(13, 1, 2010);

        Person granddaughterS = new Person("Ly", false);
        granddaughterS.setBirthday(7, 11, 2015);

        son.addChild(grandsonS);
        son.addChild(granddaughterS);

        Person daughter = new Person("Ha", true);
        daughter.setBirthday(22, 11, 1985);

        Person grandsonD = new Person("Duc", false);
        grandsonD.setBirthday(13, 1, 2015);

        Person granddaughterD = new Person("Anh", false);
        granddaughterD.setBirthday(7, 11, 2020);

        daughter.addChild(grandsonD);
        daughter.addChild(granddaughterD);

        father.addChild(son);
        father.addChild(daughter);

        grandfather.addChild(father);

        genealogyInfo(grandfather);
        System.out.println();
        getFamilyHas2(grandfather);
    }

    public static void genealogyInfo(Person person) {
        if (person == null) return;
        if (person.getChildren().size() == 0) System.out.println(person.getInfo());
        else {
            for (Person p : person.getChildren()) {
                genealogyInfo(p);
            }
        }
    }

    public static void getFamilyHas2(Person person) {
        if (person == null) return;
        if (person.getChildren().size() == 2) {
            System.out.println(person.getInfo());
        }
        for (Person p : person.getChildren()) {
            getFamilyHas2(p);
        }
    }
}
