/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author nestor
 */
public abstract class Conversor
{
	public abstract double toB(double a);
	public abstract double toA(double b);
	public abstract String nameA();
	public abstract String nameB();
}
