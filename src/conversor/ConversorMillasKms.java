/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 * a: Millas
 * b: Kms
 * @author nestor
 */
public class ConversorMillasKms extends Conversor
{
	@Override
	public double toB(double millas)
	{
		return millas * 1.609;
	}
	
	
	@Override
	public double toA(double kms)
	{
		return kms / 1.609;
	}
	
	
	@Override
	public String nameA()
	{
		return "Millas";
	}
	
	
	@Override
	public String nameB()
	{
		return "Kilómetros";
	}
}
