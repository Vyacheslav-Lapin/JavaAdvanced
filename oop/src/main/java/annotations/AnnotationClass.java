package annotations;

@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
//        currentRevision = 6,
//        lastModified = "4/12/2004",
//        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class AnnotationClass {
    public static void main(String[] args) {
        ClassPreamble classPreamble = AnnotationClass.class
                .getAnnotation(ClassPreamble.class);

        int i = (int) 1L;

        System.out.println(classPreamble.author());
        System.out.println(i);
    }
}
