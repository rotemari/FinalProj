package com.simpleprogrammer.proteintracker;

import java.util.List;

public interface Notifier {


	public void addProtein(int amount);
	public void removeProtein(int amount);
	public int getTotal();
	public void setGoal(int value);
	public boolean isGoalMet();
	public List<HistoryItem> getHistory();

}
