package deqo.tlau.MySimpleStack;

/**
 * Created by 21205213 on 04/11/2016.
 */
public class Item{
    private  Object value;

    Item(Object value) {
        setValue(value);
    }

    /**
     * Un commentaire répondant a l'exigence #1
     * @return
     */

    public Object getValue() {
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
