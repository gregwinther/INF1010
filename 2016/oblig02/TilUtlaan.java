/**
* TilUtlaan er et grensesnitt for klassen Bok. Dette grensesnittet
* begrenser bruken av klassen til metodene laanUt() og leverTilbake
*
* @author Sebastian G. Winther-Larsen
*
*/

interface TilUtlaan {
	/**
	* @param utlaaner Den som laaner ut boken
	*/
	void laanUt(String utlaaner);
	/**
	* Returnerer boken som er til utlaan.
	* Den vil ikke lenger ha status som utlaant.
	* @return boken som ble levert tilbake.
	*/ 
	void leverTilbake();
}
