package problem2KingsGambit.models;

import problem2KingsGambit.core.contracts.Database;
import problem2KingsGambit.models.contracts.Observable;
import problem2KingsGambit.models.contracts.Soldier;

public class FootmanImpl implements Soldier {

    private String name;
    private Observable observable;

    public FootmanImpl(String name) {
        this.name = name;
    }

    @Override
    public String update(String message) {
        return String.format("Footman %s is panicking!", this.getName());
    }

    @Override
    public void subscribe(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void unsubscribe() {
        this.observable = null;
    }

    @Override
    public void kill(Database db) {
        db.remove(getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}