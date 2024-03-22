import org.junit.jupiter.api.*;

public class TestFixture {
    @BeforeAll
    static void setUpClass() throws Exception {
        // Code executed before the first test method
        ServiceController[] serviceControllers = new ServiceController[3];
        serviceControllers[0] = new MockFlightController();
        serviceControllers[1] = new MockHotelController();
        serviceControllers[2] = new MockTourController();
        Engine engine = new Engine(serviceControllers);
    }

    @BeforeEach
    void setUp() throws Exception {
        // Code executed before each test
    }

    @Test
    void search() {
        Service[] result = engine.search("foo");
        assertEquals(result, new Service[0]);
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
