package i_linkedListTraversial.manager;

import i_linkedListTraversial.model.LinkedListImpl;
import i_linkedListTraversial.utils.Constants;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Manager {
    private LinkedListImpl list;

    public Manager() {
        this.list = new LinkedListImpl();
    }

    public void executeAddCommand(int element) {
        this.list.add(element);
    }

    public void executeRemoveCommand(int element) {
        this.list.remove(element);
    }

    public void printResult() {
        System.out.println(this.list.getSize());
        System.out.println(this.joinWith(Constants.JOINER));
    }

    private String joinWith(String joiner) {
        StringBuilder builder = new StringBuilder();
        this.list.forEach(x -> builder.append(x).append(joiner));
        return builder.toString().trim();
    }
}
