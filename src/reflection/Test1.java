package reflection;

import java.lang.annotation.*;
import java.lang.invoke.TypeDescriptor;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

public class Test1 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<User> c1 =  User.class;
        Annotation[] annotations = c1.getAnnotations();
    for(Annotation annotation : annotations){
        System.out.println(annotation.toString());
}
        User_db userDb = c1.getAnnotation(User_db.class);
        String value = userDb.value();
        System.out.println(value);

        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);
        Name annotation1 = name.getAnnotation(Name.class);
        String value1 = annotation1.value();
        System.out.println(value1);

    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface User_db{
String value();
        }
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Name{
    String value();
}
