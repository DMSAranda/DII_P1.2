package dam2.dii.p12.dao;

import java.util.ArrayList;

import dam2.dii.p12.controller.ContactoController;
import dam2.dii.p12.model.Contacto;

public class ContactoDAOImplMem implements IContactoDAO {
	
	public static ArrayList<Contacto> agenda = new ArrayList<Contacto>();
	

	@Override
	public ArrayList<Contacto> getListaContactos() {
		
		ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
		
		listaContactos = agenda;
		
		return listaContactos;
	}
	


}
