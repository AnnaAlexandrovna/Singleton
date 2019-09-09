public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler uniqeChocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqeChocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqeChocolateBoiler == null) {
                    uniqeChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqeChocolateBoiler;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void boil(){
        if (!isEmpty()&& !isBoiled()){
            boiled = true;
        }
    }
}
