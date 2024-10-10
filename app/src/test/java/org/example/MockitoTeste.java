package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class MockitoTeste {

    @Mock
    private List<String> letras;

     @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
   
    }

    @Test
    public void testName() {
        when(letras.get(0)).thenReturn("B");
        assertEquals("B", letras.get(0));

    }

}
