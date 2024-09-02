package org.khnure.lect10threads.ex3annotations.ex1;

public class CustomAnnotationExample {

    @MyAnnotation("Example")
    public void annotatedMethod() {
        System.out.println("Annotated method");
    }

    public static void main(String[] args) throws Exception {
        CustomAnnotationExample example = new CustomAnnotationExample();
        MyAnnotation annotation = example.getClass()
                .getMethod("annotatedMethod")
                .getAnnotation(MyAnnotation.class);
        System.out.println("Annotation value: " + annotation.value());
    }

}
