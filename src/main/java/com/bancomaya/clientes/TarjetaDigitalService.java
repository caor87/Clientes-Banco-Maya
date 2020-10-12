package com.bancomaya.clientes;



import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService
public interface TarjetaDigitalService {

	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta);
	public List<TarjetaDigital> obtenerTrejetasDigitales();
	public TarjetaDigital obtenerTarjetaNumero(String numeroTrajeta);
	public TarjetaDigital obtenerTrejetaNombreCliente(String nombreCliente);
	
}
