package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{

	public static List<TarjetaDigital> tarjetas = new ArrayList<TarjetaDigital>();
	
	static {
		TarjetaDigital tarjeta = new TarjetaDigital();
		tarjeta.setId(1);
		tarjeta.setCliente("Carlos Oviedo");
		tarjeta.setBanco("Davivienda");
		tarjeta.setNumero("789-456-123");
		tarjeta.setNumeroSeguridad("56210");
		tarjetas.add(tarjeta);
		
	}
	
	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta) {
		tarjeta.setId(tarjetas.size()+1);
		tarjetas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<TarjetaDigital> obtenerTrejetasDigitales() {
		return tarjetas;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTrajeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTrejetaNombreCliente(String nombreCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
