public class Lesson40Annotation {

    @MyAnnotation
    private String name;

    @MyAnnotation
    public Lesson40Annotation(){
    }

    @MyAnnotation
    public void test(@MyAnnotation int value){
        @MyAnnotation String localVar = "Hello";
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
        A a = new A();
        a.ts();
    }
}
