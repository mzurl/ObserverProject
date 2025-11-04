import java.util.ArrayList;

public abstract class UiSubject {
    private ArrayList<UiObserver> observers;

    protected UiSubject()
    {
        observers = new ArrayList<>();
    }
    
    public void register(UiObserver observer)
    {
    }
    
    public void unregister(UiObserver observer)
    {
    }

    public abstract void notify(Channel ch);

    public void toggleMode()
    {
    }
}
