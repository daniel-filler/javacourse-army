package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        for (Field field : declaredFields) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if (annotation != null) {
                Object object = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t,object);

            }

        }
    }
}
