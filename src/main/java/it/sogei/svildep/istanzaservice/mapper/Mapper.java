package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.Entity;

import java.util.*;

public interface Mapper<E extends Entity, D extends Dto> {

    D convertEntityToDtoImpl(E entity);

    E convertDtoToEntityImpl(D dto);

    default D convertEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = convertEntityToDtoImpl(entity);
        dto.setId(String.valueOf(entity.getId()));
        return dto;
    }

    default Collection<D> convertEntityToDto(Collection<D> dtos, Collection<E> entities) {
        if (entities == null) return null;
        for (E entity : entities) dtos.add(convertEntityToDto(entity));
        return dtos;
    }

    default List<D> convertEntityToDto(List<E> entities) { return (List<D>) convertEntityToDto(new ArrayList<>(), entities); }

    default Set<D> convertEntityToDto(Set<E> entities) { return (Set<D>) convertEntityToDto(new HashSet<>(), entities); }

    default E convertDtoToEntity(D dto) {
        if (dto == null) return null;
        E entity = convertDtoToEntityImpl(dto);
        if (dto.getId() != null) entity.setId(Long.parseLong(dto.getId()));
        return entity;
    }

    default Collection<E> convertDtoToEntity(Collection<E> entities, Collection<D> dtos) {
        if (dtos == null) return null;
        for (D dto : dtos) entities.add(convertDtoToEntity(dto));
        return entities;
    }

    default List<E> convertDtoToEntity(List<D> dtos) { return (List<E>) convertDtoToEntity(new ArrayList<>(), dtos); }

    default Set<E> convertDtoToEntity(Set<D> dtos) { return (Set<E>) convertDtoToEntity(new HashSet<>(), dtos); }

}
