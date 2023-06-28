package dam2.dii.p12.service;

import java.util.ArrayList;
import java.util.Iterator;

import dam2.dii.p12.controller.ContactoController;
import dam2.dii.p12.dao.ContactoDAOImplMem;
import dam2.dii.p12.dao.IContactoDAO;
import dam2.dii.p12.model.Contacto;

public class ContactoService {

	private IContactoDAO udao = new ContactoDAOImplMem();

	ArrayList<Contacto> libreta = udao.getListaContactos();

	public ArrayList<Contacto> agregarAgenda(Contacto contact) {

		libreta.add(contact);

		ContactoDAOImplMem.agenda = libreta;

		return libreta;
	}

	public boolean compruebaExiste(Contacto contact) {

		boolean existe = false;

		try {

			Iterator<Contacto> it = libreta.iterator();

			while (it.hasNext()) {

				Contacto contacto = it.next();

				String name = contacto.getName();
				String surname = contacto.getSurname();
				String email = contacto.getEmail();
				String phone = contacto.getPhone();

				if (name.equals(contact.getName()) && surname.equals(contact.getSurname())
						|| email.equals(contact.getEmail()) || phone.equals(contact.getPhone())) {
					existe = true;
				}

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Datos fuera de límites");
		}

		return existe;
	}

}
