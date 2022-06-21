package br.com.product.domain.service.impl;

import br.com.product.domain.exception.model.BusinessException;
import br.com.product.domain.model.Group;
import br.com.product.domain.repository.GroupRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
class GroupServiceImplTest {

    @Mock
    GroupRepository repository;

    @InjectMocks
    GroupServiceImpl service;

    @Test
    void testFindById() {
        when(repository.findById(Mockito.anyString())).thenReturn(Optional.of(new Group()));

        Group entity = service.findById(Mockito.anyString());
        assertNotNull(entity);
        verify(repository, times(1)).findById(Mockito.anyString());
    }

    @Test
    void testFindAll() {
        when(repository.findAll()).thenReturn(Arrays.asList(new Group()));

        List<Group> list = service.findAll();
        assertNotNull(list);
        verify(repository, times(1)).findAll();
    }

    @Test
    void testSave() {
        when(repository.save(Mockito.any())).thenReturn(new Group());

        Group entity = service.save(Mockito.any());
        assertNotNull(entity);
        verify(repository, times(1)).save(Mockito.any());
    }

    @Test
    void testDeleteById() {
        when(repository.existsById("1")).thenReturn(Boolean.FALSE);
        BusinessException exception = assertThrows(BusinessException.class, () -> {
            service.deleteById("1");
        }, "exception is null");
        assertNotNull(exception);
    }

    @Test
    void testExistsByIdReturnFalse() {
        when(repository.existsById(Mockito.any())).thenReturn(Boolean.FALSE);

        BusinessException exception = assertThrows(BusinessException.class, () -> {
            service.existsById(Mockito.any());
        }, "exception is null");
        assertNotNull(exception);
        verify(repository, times(1)).existsById(Mockito.any());
    }

}
