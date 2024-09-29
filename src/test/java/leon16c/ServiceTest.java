package leon16c;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testGetServiceName() {
        assertEquals("ASDF", service.getServiceName());
    }
}
