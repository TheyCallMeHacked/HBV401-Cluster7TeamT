import org.junit.jupiter.api.*;

public class TestFixture {
    @BeforeAll
    static void setUpClass() throws Exception {
        // Code executed before the first test method
    }

    @BeforeEach
    void setUp() throws Exception {
        // Code executed before each test
    }

    @Test
    void oneThing() {
        // Code that tests one thing
    }

    @Test
    void anotherThing() {
        // Code that tests another thing
    }

    @Test
    void somethingElse() {
        // Code that tests something else
    }

    @AfterEach
    void tearDown() throws Exception {
        // Code executed after each test
    }

    @AfterAll
    static void tearDownClass() throws Exception {
        // Code executed after the last test method
    }
}
