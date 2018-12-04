package test.java;

/**
 * @author Karapet_Yepremyan on 10/22/2018
 * @project TriggerHappy
 */
public interface InterfaceA {
    default void defMethod() {
        System.out.println("defMethod from A");
    }

    void methodA();
}
