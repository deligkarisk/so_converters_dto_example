package com.example.conversion_entities.converters;

import com.example.conversion_entities.domain.Group;
import com.example.conversion_entities.dto.GroupDto;
import com.example.conversion_entities.dto.StudentDto;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupToGroupDtoConverter implements org.springframework.core.convert.converter.Converter<Group, GroupDto> {

    private ConversionService conversionService;

    public GroupToGroupDtoConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public GroupDto convert(Group group) {


        List<StudentDto> studentDtoList =
                group.getStudents().stream().map(a -> conversionService.convert(a, StudentDto.class)).collect(Collectors.toList());
        GroupDto groupDto = new GroupDto(group.getId(), group.getName(), studentDtoList);

        return groupDto;
    }
}
