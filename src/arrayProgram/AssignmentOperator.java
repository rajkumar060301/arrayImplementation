package arrayProgram;

import java.util.StringJoiner;

public class AssignmentOperator {

    public static int number = 10;

    @Override
    public String toString() {
        return new StringJoiner(", ", AssignmentOperator.class.getSimpleName() + "[", "]")
                .toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        AssignmentOperator.number = number;
    }

    public AssignmentOperator() {
    }

    public static void main(String[] args) {

//        System.out.println(number++);//10 (11)
//        System.out.println(++number);//12
//        System.out.println(number--);//12 (11)
//        System.out.println(--number);//10
        System.out.println(getNumber());
//        System.out.println(setNumber(25));
        setNumber(25);
        System.out.println(getNumber());
    }
}
