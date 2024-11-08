import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person4 person4 = new Person4();
        Class person3Class = person4.getClass();
        Class person4Class = Person4.class;
        Class person2Class = Class.forName("Person4");

        Method[] methods = person4Class.getMethods();
//        for(Method method : methods){
//            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
//        }

        Field[] fields = person3Class.getDeclaredFields();
//        for(Field field : fields){
//            System.out.println(field.getName() + ", " + field.getType());
//        }
        Annotation[] annotations = person2Class.getAnnotations();
        for(Annotation annotation : annotations){
            if(annotation instanceof Author){
                System.out.println("Yes");
            }
        }


    }
}
