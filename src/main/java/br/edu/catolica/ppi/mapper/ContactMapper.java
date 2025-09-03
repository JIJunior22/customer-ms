package br.edu.catolica.ppi.mapper;


import br.edu.catolica.ppi.domain.Contact;
import br.edu.catolica.ppi.dto.ContactDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ContactMapper {

    Contact dtoToEntity(ContactDTO contactDTO);

    ContactDTO entityToDTOy(Contact contact);
}
