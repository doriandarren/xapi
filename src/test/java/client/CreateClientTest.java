package client;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.app.backend.datastore.DAOClient;
import com.app.backend.datastore.EMF;
import com.app.backend.model.Client;



public class CreateClientTest extends BaseClientTest {

	@Test
	public void testCreate() {
		Client client = getMockClient();
		
		DAOClient service = new DAOClient();
		service.create(client);
				
		EntityManager emF = EMF.get().createEntityManager();
		Client clientFind = emF.find(Client.class, client.getKey());
		emF.close();
				
		Assert.assertNotNull(clientFind);
		Assert.assertEquals(client.getName(), clientFind.getName());
		Assert.assertEquals(client.getDescription(), clientFind.getDescription());
		Assert.assertEquals(client.getCreateAt(), clientFind.getCreateAt());
		//EL client se puede crear sin Place
		//Assert.assertEquals(0, clientFind.getListPlace().size());
		
	}
	
}
