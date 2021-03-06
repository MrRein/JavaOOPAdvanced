package h_militaryElite.soldier;


import h_militaryElite.interfaces.ILeutenantGeneral;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class LeutenantGeneral extends Private implements ILeutenantGeneral {
    private List<Private> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private p) {
        this.privates.add(p);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(System.lineSeparator());
        builder.append("Privates:");
        for (Private aPrivate : privates.stream().sorted(Comparator.comparing(Soldier::getId).reversed()).collect(Collectors.toList())) {
            builder.append(System.lineSeparator());
            builder.append("  ").append(aPrivate);
        }
        return builder.toString();
    }
}
