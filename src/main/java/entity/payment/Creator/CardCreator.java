package entity.payment.Creator;

import entity.payment.Card;

import java.lang.reflect.InvocationTargetException;

public interface CardCreator {
    static CardCreator createCreactor(String className,Object... args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(className);
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return (CardCreator) clazz.getConstructor(parameterTypes).newInstance(args);
    }

    abstract Card createCard();

}
