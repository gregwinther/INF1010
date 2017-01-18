/**
* Generisk grensesnitt som muliggjoer plassering av fast antall ting.
* Det er mulig å (1) spoerre hyllen om dens stoerrelse, (2) sette noe
* paa en gitt plass, (3) sjekke om en bestemt plass er ledig, og (4)
* ta ut noe fra en bestemt plass.
*
* @author Sebastian G. Winther-Larsen
* 
*/

interface GenHylle<T> {

	public int hentStor();
	public void sett(T ting, int plass);
	public void ledig(int plass);
	public T hent(int plass);
}
