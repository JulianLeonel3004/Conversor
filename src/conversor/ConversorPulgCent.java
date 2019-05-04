/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 * a: Pulgadas
 * b: Centímetros
 * @author nestor
 */
public class ConversorPulgCent extends Conversor
{
	@Override
	public double toB(double pulgadas)
	{
		return pulgadas * 2.54;
	}
	
	
	@Override
	public double toA(double centimetros)
	{
		return centimetros / 2.54;
	}
	
	
	@Override
	public String nameA()
	{
		return "Pulgadas";
	}
	
	
	@Override
	public String nameB()
	{
		return "Centímetros";
	}
}
