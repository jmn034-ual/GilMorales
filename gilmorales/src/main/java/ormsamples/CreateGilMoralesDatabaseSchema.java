/**
 * Licensee: Jmn034(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateGilMoralesDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(bd_dcl.GilMoralesPersistentManager.instance());
			bd_dcl.GilMoralesPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
