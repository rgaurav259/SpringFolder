package com.restCodeGenerator.restCodeGeneratorDemo.mapper;

import com.restCodeGenerator.restCodeGeneratorDemo.dto.EmployeeDTO;
import com.restCodeGenerator.restCodeGeneratorDemo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ReferenceMapper.class)
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    Employee asEntity(EmployeeDTO dto);
}