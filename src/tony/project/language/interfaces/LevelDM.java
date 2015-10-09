package tony.project.language.interfaces;

import tony.project.language.domain.Level;

public interface LevelDM {

	public void saveLevelByMapper(Level level);
	
	public Level loadLevelByMapper(String levelID);
	
	public void deleteLevelByMapper(String levelID);
	
}
