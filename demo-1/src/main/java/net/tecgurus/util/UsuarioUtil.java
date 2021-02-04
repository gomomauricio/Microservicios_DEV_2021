package net.tecgurus.util;

import java.util.ArrayList;
import java.util.Collection;

import net.tecgurus.dto.UsuarioDto;

public class UsuarioUtil 
{

	public static Collection<UsuarioDto> generateUserList(Integer num)
	{
	      Collection<UsuarioDto> list = new ArrayList<UsuarioDto>();
	  
	      for( int i=0; i<num; i++)
	      {
	    	  list.add(new UsuarioDto("User"+i, i+"@domain", "dir#"+ i, 20+i ) );
	      }
	      
	      return list;
	}
	
	
}
