package com.portfolio.np.Interface;

import com.portfolio.np.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo hacemos por ID
    public void deletePersona (Long id);
    
    //Buscar una perona por ID
    public Persona findPersona(Long id);
}