import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestFixture {

    private Engine engine;
    private static MockFlightController mockFlightController;
    private static MockHotelController mockHotelController;
    private static MockTourController mockTourController;

    @BeforeAll
    static void setUpClass() throws Exception {
        // Code executed before the first test method
        mockFlightController = new MockFlightController();
        mockHotelController = new MockHotelController();
        mockTourController = new MockTourController();
        ServiceController[] controllers = {mockFlightController, mockHotelController, mockTourController};
        engine = new Engine(controllers);
    }

    @BeforeEach
    void setUp() throws Exception {
        // Code executed before each test
        
    }

    @Test
    void testSearch() {
        Service[] results = engine.search("query");

        for (Service service : result) {
            assertEquals("query", service.getName())
        }
    }

    @Test
    void testSortId() {
        // Code that tests another thing
        Service sort1 = new Service(0);
        Service sort2 = new Service(3);
        Service sort3 = new Service(1);
        Service sort4 = new Service(2);
        Service[] sortServiceId = {sort1, sort2, sort3, sort4};

        sortedServicesId = engine.sort(sortServiceId, SortingParam.ID, false);
        Service[] expectedIdOrder = new Service[] {sort2, sort4, sort3, sort1};
        assertArrayEquals(expectedIdOrder, sortedServicesId);
    }

    @Test
    void testSortPrice() {
        // Code that tests something else
        Service sort1 = new Service(1000);
        Service sort2 = new Service(4000);
        Service sort3 = new Service(2000);
        Service sort4 = new Service(3000);
        Service[] sortServicePrice = {sort1, sort2, sort3, sort4};

        sortedServicesPrice = engine.sort(sortServicePrice, SortingParam.PRICE, false);

        Service[] expectedPriceOrder = new Service[] {sort2, sort4, sort3, sort1};
        assertArrayEquals(expectedPriceOrder, sortedServicesPrice);
    }
    
    @Test
    void testReverseSortPrice() {
        // Code that tests something else
        Service sort1 = new Service(1000);
        Service sort2 = new Service(4000);
        Service sort3 = new Service(2000);
        Service sort4 = new Service(3000);
        Service[] sortServicePrice = {sort1, sort2, sort3, sort4};

        sortedServicesPrice = engine.sort(sortServicePrice, SortingParam.PRICE, true);

        Service[] expectedPriceOrder = new Service[] {sort1, sort3, sort4, sort2};
        assertArrayEquals(expectedPriceOrder, sortedServicesPrice);
    }

    @AfterEach
    void tearDown() throws Exception {
        // Code executed after each test
    }

    @AfterAll
    static void tearDownClass() throws Exception {
        // Code executed after the last test method
        engine = null;
    }
}
