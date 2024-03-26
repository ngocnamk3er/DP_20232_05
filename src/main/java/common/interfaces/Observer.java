package common.interfaces;

/**
 * @author
 */
// Interface Observable có 3 phương thức attach(Observer observer), remove(Observer observer),  notifyObservers() đều được sử dụng trong views > home > Mediahandler
// => KHÔNG vi phạm ISP
public interface Observer {

    void update(Observable observable);

}
