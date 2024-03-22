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
    void recommend() {
        Trip trip = new Trip();
        Service[] result = engine.recommend(trip);
        assertEquals(result, new Service[0]);
    }

    @Test
    void sortId() {
        Service[] toBeSorted = new Service[3];
        toBeSorted[0] = new Service();
        toBeSorted[0].setId(1)
        toBeSorted[1] = new Service();
        toBeSorted[1].setId(0)
        toBeSorted[2] = new Service();
        toBeSorted[2].setId(2)
        toBeSorted = engine.sort(toBeSorted, SortingParam.ID, false);
        assertEquals(toBeSorted[0].getId(), 0);
        assertEquals(toBeSorted[1].getId(), 1);
        assertEquals(toBeSorted[2].getId(), 2);
    }

    @Test
    void sortPrice() {
        Service[] toBeSorted = new Service[3];
        toBeSorted[0] = new Service();
        toBeSorted[0].setPrice(1)
        toBeSorted[1] = new Service();
        toBeSorted[1].setPrice(0)
        toBeSorted[2] = new Service();
        toBeSorted[2].setPrice(2)
        toBeSorted = engine.sort(toBeSorted, SortingParam.PRICE, false);
        assertEquals(toBeSorted[0].getPrice(), 0);
        assertEquals(toBeSorted[1].getPrice(), 1);
        assertEquals(toBeSorted[2].getPrice(), 2);
    }

    @Test
    void sortIdReverse() {
        Service[] toBeSorted = new Service[3];
        toBeSorted[0] = new Service();
        toBeSorted[0].setId(1)
        toBeSorted[1] = new Service();
        toBeSorted[1].setId(0)
        toBeSorted[2] = new Service();
        toBeSorted[2].setId(2)
        toBeSorted = engine.sort(toBeSorted, SortingParam.ID, true);
        assertEquals(toBeSorted[0].getId(), 2);
        assertEquals(toBeSorted[1].getId(), 1);
        assertEquals(toBeSorted[2].getId(), 0);
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
