package danvega.dev.unitvsintegration.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    // Unit test
    @Test
    void hello() {
        HelloController controller = new HelloController();   // Arrange
        String response = controller.hello("World");    // Act
        assertEquals("Hello, World", response); // Assert
    }
}