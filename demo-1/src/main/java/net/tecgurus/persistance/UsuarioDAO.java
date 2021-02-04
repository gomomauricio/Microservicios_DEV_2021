package net.tecgurus.persistance;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import net.tecgurus.dto.UsuarioDto;
import net.tecgurus.util.UsuarioUtil;


@Repository  //inyectarlo, los objetos de esta clase puedan ser manejados por springs
public class UsuarioDAO
{

		public Collection<UsuarioDto> getAll()
		{
			return UsuarioUtil.generateUserList(100);
		}
}
