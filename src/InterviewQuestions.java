public class InterviewQuestions {
    {
        System.out.println("IIB -> Instance Initializer Block - 2");
    }
    final int x;
    static final int y;
    // If a final variable is declared but not initialized,
    // where is it done? MCQ Question => Constructor
    // If a static final variable is declared but not initialized,
    // where is it done? MCQ Question => static block
    InterviewQuestions(){
        x = 200;
    }
    public static void main(String[] args) {
        System.out.println("JSSATE");
        new InterviewQuestions();
    }
    static {
        y = 50;
        System.out.println("This is the Static Block");
        System.out.println("Loading resources.......");
    }
    {
        System.out.println("IIB -> Instance Initializer Block - 1");
    }
}
