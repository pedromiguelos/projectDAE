package ejbs;

import entities.Administrator;
import exceptions.EntityAlreadyExistsException;
import java.util.Collection;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

@Stateless
public class AdministratorBean extends Bean<Administrator> {

    public void create(String username, String password, String name, String email) throws EntityAlreadyExistsException {
        try {
            if (em.find(Administrator.class, username) != null) {
                throw new EntityAlreadyExistsException("A user with that username already exists.");
            }
            
            em.persist(new Administrator(username, password, name, email));
        } catch (EntityAlreadyExistsException e) {
            throw e;
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
    }
    
    @Override
    protected Collection<Administrator> getAll() {
        return em.createNamedQuery("getAllAdministrators").getResultList();
    }
}
